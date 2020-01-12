/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DivergentChange;

import static DivergentChange.DivergentChange.TURISMO;

/**
 *Solucion
 * @author kevin
 */
public class Vehic {
    protected int maxPotencia;
    protected int rpm;
    protected int maxCombustible;
    protected int restanteCombustible;
    protected int velocidades;
    protected String name;
    protected String serie;
    protected int colorR;
    protected int colorG;
    protected int colorB;
    protected DivergentChange tipo;
    public Vehic(String nombre, String serie, int fuel, 
        int power, int vel){
      this.serie =serie;
      name = nombre;
      maxCombustible = restanteCombustible = fuel;
      maxPotencia = power;
      velocidades = vel;
      colorR = colorG = colorB = 255;
      rpm = 1;
      tipo = TURISMO;
    }
}
