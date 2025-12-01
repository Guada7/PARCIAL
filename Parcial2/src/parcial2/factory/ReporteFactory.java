/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2.factory;

import parcial2.config.ConfiguracionSistema;

/**
 *
 * @author USUARIO
 */
public class ReporteFactory {
    
    public static Reporte crearReporte(String tipo){
        
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();
        
        if (tipo == null || tipo.isEmpty()){
            tipo = config.getFormatoPorDefecto();
        }
        
        switch (tipo.toLowerCase()){
            case "pdf":
                return new ReportePDF();
                
            case "excel":
                return new ReporteExcel();
                
            case "html":
                return new ReporteHTML();
                
            default:
                System.out.println("Tipo de reporte no valido");
                return null;
        }
    }
    
}
