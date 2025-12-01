/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2.decorator;

import java.time.LocalDate;
import parcial2.factory.Reporte;

/**
 *
 * @author USUARIO
 */
public class PieConFechaDecorador extends ReporteDecorador {

    public PieConFechaDecorador(Reporte reporte) {
        super(reporte);
    }

    @Override
    public String generarContenido() {
        return reporte.generarContenido() + " \nPie de pagina: Fecha de generacion " + LocalDate.now();
    }
    
}
