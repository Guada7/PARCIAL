/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2.factory;

import parcial2.factory.Reporte;
import parcial2.factory.ReporteFactory;

/**
 *
 * @author USUARIO
 */
public class MainFactory {
    
    public static void main(String[] args) {

        Reporte excel = ReporteFactory.crearReporte("excel");
        
        System.out.println("Reporte Excel " + excel.generarContenido());


    }
    
}
