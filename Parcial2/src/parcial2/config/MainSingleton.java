/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2.config;

import parcial2.factory.Reporte;
import parcial2.factory.ReporteFactory;

/**
 *
 * @author USUARIO
 */
public class MainSingleton {
    
     public static void main(String[] args) {

        ConfiguracionSistema config1 = ConfiguracionSistema.getInstancia();

        config1.setDirectorioSalida("C:/out/");
        config1.setFormatoPorDefecto("html");
        config1.setMostrarMarcaAgua(false);

        ConfiguracionSistema config2 = ConfiguracionSistema.getInstancia();

        System.out.println("Directorio: " + config2.getDirectorioSalida());
        System.out.println("Formato por defecto: " + config2.getFormatoPorDefecto());
        System.out.println("Mostrar marca de agua: " + config2.isMostrarMarcaAgua());

        Reporte reporte = ReporteFactory.crearReporte("");
        System.out.println("\nReporte creado segun formatoPorDefecto del Singleton:");
        System.out.println(reporte.generarContenido());

    }
    
}
