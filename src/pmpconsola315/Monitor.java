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
public class Monitor {
    private int[] lista;
    
    public Monitor() {
        lista = new int[10];
        for (int i = 0; i<10; i++) lista[i] = 0;
    }
    
   
    /**
     * Incrementa todas las posiciones del vector con un mismo valor
     * @param valor Valor con el que incrementar todas las posiciones del vector
    */
    public void incrementar(int valor) {
        for (int i = 0; i<10; i++) {
            lista[i] = lista[i] + valor;
        }
    }
    
    /**
     * Decrementa todas las posiciones del vector con un mismo valor
     * @param valor Valor con el que decrementar todas las posiciones del vector
    */
    public void decrementar(int valor) {
        for (int i = 0; i<10; i++) {
            lista[i] = lista[i] - valor;
        }
    }
    
    /**
     * Muestra todas las posiciones del vector
    */
    public void mostrar() {
        for (int i = 0; i<10; i++) System.out.print(lista[i] + "-");
        // Probar con esta sentencia para comprobar que no siempre se incrementa
        // y decrementa hilo a hilo
        // for (int i = 0; i<10; i++) if (lista[i] > 9) System.out.print(lista[i] + "-");
        System.out.println("Fin");
    }
}
