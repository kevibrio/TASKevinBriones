/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeatureEnvy;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class recExtra {
    private int unidad;
    private int decena;
    private int centena;
    public recExtra(int unidad, int decena, int centena){
        this.unidad = unidad;
        this.decena = decena;
        this.centena = centena;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public int getDecena() {
        return decena;
    }

    public void setDecena(int decena) {
        this.decena = decena;
    }

    public int getCentena() {
        return centena;
    }

    public void setCentena(int centena) {
        this.centena = centena;
    }
    //solucion al featureEnvy con la tecnica Move Method
    public int enviarEntero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Probemos unir tres digitos enteros para crear un valor que contenga unidad, decena y centena");
        System.out.println("Ingrese la centena");
        String centena = sc.nextLine();
        System.out.println("Ingrese la decena");
        String decena = sc.nextLine();
        System.out.println("Ingrese la unidad");
        String unidad = sc.nextLine();
        String valor = centena + decena + unidad;
        return Integer.parseInt(valor);
    }
}
