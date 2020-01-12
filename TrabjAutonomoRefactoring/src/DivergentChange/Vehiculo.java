/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DivergentChange;

import DivergentChange.DivergentChange;
import static javafx.print.PaperSource.MANUAL;
import static DivergentChange.DivergentChange.DEPORTIVO;
import static DivergentChange.DivergentChange.RALLY;
import static DivergentChange.DivergentChange.TURISMO;

/**
 *
 * @author kevin
 */
public class Vehiculo {
    int maxPotencia;
    int rpm;
    int maxCombustible;
    int restanteCombustible;
    int velocidades;
    String name;
    String serie;
    int colorR;
    int colorG;
    int colorB;
    DivergentChange tipo;
    public Vehiculo(String nombre, String serie, int fuel, 
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
    //Si aumenta un tipo  mas se debe aumentar el codigo, por ello mejor creo una clase, y subclases que 
    //los manejen a todos.
    public void inicializar(){
      switch (this.tipo){
        case TURISMO:
            //...
        case DEPORTIVO:
            //...
        case RALLY:
            //...
        //case CASUAL:
        default:
            //...
      }
    }
}
