/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmpconsola315;

/**
 *
 * @author ifhprof01
 */
public class PMPConsola315 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Monitor m = new Monitor();
        
        m.incrementar(7);
        m.incrementar(5);
        m.incrementar(3);
        m.mostrar();
        m.decrementar(32);
        m.mostrar();
    }
    
}
