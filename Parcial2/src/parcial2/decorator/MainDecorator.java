/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2.decorator;

import parcial2.decorator.EncabezadoDecorador;
import parcial2.decorator.MarcaAguaDecorador;
import parcial2.decorator.PieConFechaDecorador;
import parcial2.factory.Reporte;
import parcial2.factory.ReporteFactory;

/**
 *
 * @author USUARIO
 */
public class MainDecorator {
    
     public static void main(String[] args) {
         
        Reporte reporte = ReporteFactory.crearReporte("pdf");

        System.out.println("Reporte base:");
        System.out.println(reporte.generarContenido());

        // Decoradores
        reporte = new EncabezadoDecorador(reporte);
        reporte = new PieConFechaDecorador(reporte);
        reporte = new MarcaAguaDecorador(reporte);

        System.out.println("\nReporte decorado:");
        System.out.println("---------------------------------------------");
        System.out.println(reporte.generarContenido());
        System.out.println("---------------------------------------------");

    }
    
}
