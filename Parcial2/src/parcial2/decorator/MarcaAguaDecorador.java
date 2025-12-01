/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2.decorator;

import parcial2.config.ConfiguracionSistema;
import parcial2.factory.Reporte;

/**
 *
 * @author USUARIO
 */
public class MarcaAguaDecorador extends ReporteDecorador{

    public MarcaAguaDecorador(Reporte reporte) {
        super(reporte);
    }

    @Override
    public String generarContenido() {
        
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();
        
        String contenido = reporte.generarContenido();
        
        if (config.isMostrarMarcaAgua()) {
            contenido += "\n[Marca de agua: Confidencial]";
        }
        
        return contenido;
    }
    
}
