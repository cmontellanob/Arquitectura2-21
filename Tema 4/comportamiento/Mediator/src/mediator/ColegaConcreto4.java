/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author Carlos
 */
public class ColegaConcreto4 extends Colega {

    public ColegaConcreto4(IMediador m) {
        this.setMediador( m );
    }
    // -------------------------------
    @Override
     public void recibir(String mensaje)
    {
        System.out.println( "ColegaConcreto 4: " + mensaje );
    }
    
}
