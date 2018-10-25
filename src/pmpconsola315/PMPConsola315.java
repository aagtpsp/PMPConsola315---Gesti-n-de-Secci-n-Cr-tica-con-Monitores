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
        
        m.anadir(7);
        m.anadir(5);
        m.anadir(3);
        System.out.println(m);
        m.sacar();
        System.out.println(m);
    }
    
}
