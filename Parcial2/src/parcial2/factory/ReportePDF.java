/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2.factory;

/**
 *
 * @author USUARIO
 */
public class ReportePDF implements Reporte{

    @Override
    public String generarContenido() {
        return "Generando contenido en formato pdf...";
    }
    
}
