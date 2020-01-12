/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeatureEnvy;

/**
 *
 * @author kevin
 */
public class FeatureEnvy {
    private String caja;
    private int valor;
    public FeatureEnvy(String caja, int valor){
        this.caja = caja;
        this.valor = valor;
    }
    //Este es el smell de FeatureEnvy, el cual llama a los atributos de otra clase, y no de su misma clase en  si
    //La solucion esta en recExtra,  mandar el metodo a esa clase
    protected void enviarEntero(recExtra ab){
        String valor = String.valueOf(ab.getCentena()) + String.valueOf(ab.getDecena()) + String.valueOf(ab.getUnidad());
        this.valor = Integer.parseInt(valor);
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
