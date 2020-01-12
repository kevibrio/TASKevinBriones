/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabjautonomorefactoring;

import FeatureEnvy.recExtra;
import FeatureEnvy.FeatureEnvy;

/**
 *
 * @author kevin
 */
public class RefusedRequest extends FeatureEnvy{
    /**
     * En este caso, esta clase no  tendria que extender de  FeatureEnvy, ya que no es necesario el metodo
     * enviarEntero, solo le envia a la empresa la caja a enviar.
     * @param caja
     * @param valor 
     */
    String empresa;
    public RefusedRequest(String caja, int valor) {
        super(caja, valor);
    }
    
    public void indicarCajaaEmpresa(RefusedRequest s){
        this.empresa = s.getCaja();
    }
    //se borraria este metodo
    protected void enviarEntero(recExtra ab){
        String valor = String.valueOf(ab.getCentena()) + String.valueOf(ab.getDecena()) + String.valueOf(ab.getUnidad());
        System.out.println(Integer.parseInt(valor));
    }
}
