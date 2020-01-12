/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LargeClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *Clase 'Foto' que contiene atributos y metodos de  mas que provocan el smell de Large Class
 * @author kevin
 */
public class LongClass {
    private String nombre, descripcion;
    private ArrayList<String> etiquetas;
    private ArrayList<String> personasEnFoto;
    //se pueden mover fields y methods a otra clase para reducir el codigo. Clase DatosPrincipales
    //private String ciudad;
    //private LocalDate fecha;
    //private String pais;
    // private String provincia;
    private DatosPrincipales p;
    private String url;
     public LongClass(String nombre,String descripcion, DatosPrincipales p, ArrayList<String> etiquetas, ArrayList<String> personasEnFoto, String lugar, LocalDate fecha, String url) {
        this.p = p;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.etiquetas = etiquetas;
        this.personasEnFoto = personasEnFoto;
        //this.lugar = lugar;
        //this.fecha = fecha;
        this.url = url;
    }
     public void crearFoto(){
     //...
     };
     //public void ponerDatosCiudad(){/....}
     public void etiquetarFotos(){
     //...
     };
     public void darLikes(){
     //....
     };
     public void ponerInfoAFoto(){
     //....
     };
     public void usuarioIngresaUrl(){
     //...
     };
     // otros metodos 
}
