/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimitiveObsession;

/**
 *
 * @author kevin
 */
public class PrimitiveObsession {
    /**
     * hay muchos datos primitivos, se puede crear una clase direccion que contenga la calle, manzana y villa
     * esto fuese el caso de que la 'direccion' fuese tratada como  un objeto porque se  va a trabajar  sobre 
     * el
     */
    
    private String colorCasa;
    private String numero;
    //private String calle;
    //private String manzana;
    //private String villa;
    private String parroquia;
    private direccion direccion;

    public PrimitiveObsession(String colorCasa, String numero, direccion Direccion, String parroquia) {
        this.colorCasa = colorCasa;
        this.numero = numero;
        //this.calle = calle;
        //this.manzana = manzana;
        //this.villa = villa;
        this.direccion = Direccion;
        this.parroquia = parroquia;
    }
    
}
