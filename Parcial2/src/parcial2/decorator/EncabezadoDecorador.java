/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2.decorator;

import parcial2.factory.Reporte;

/**
 *
 * @author USUARIO
 */
public class EncabezadoDecorador extends ReporteDecorador {

    public EncabezadoDecorador(Reporte reporte) {
        super(reporte);
    }

    @Override
    public String generarContenido() {
        return "Encabezado: Reporte generado por la empresa XYZ\n " + reporte.generarContenido();
    }
    
}
