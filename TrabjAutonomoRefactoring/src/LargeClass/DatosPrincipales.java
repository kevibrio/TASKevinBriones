/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LargeClass;

import java.time.LocalDate;

/**
 *
 * @author kevin
 */
public class DatosPrincipales {
    private String ciudad;
    private LocalDate fecha;
    private String pais;
    private String provincia;
    //Solucion (Se pueden aplicar mas metodos para evitar el smell de Large Class)
    public DatosPrincipales(String ciudad, LocalDate fecha, String pais, String provincia) {
        this.ciudad = ciudad;
        this.fecha = fecha;
        this.pais = pais;
        this.provincia = provincia;
    }
    
    public void ponerDatosCiudad(){
    //...
    }
}
