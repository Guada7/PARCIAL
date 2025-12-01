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
public abstract class ReporteDecorador implements Reporte{
    
    protected Reporte reporte;
    
    public ReporteDecorador(Reporte reporte){
        this.reporte = reporte;
    }
    
    @Override
    public abstract String generarContenido();
    
}
