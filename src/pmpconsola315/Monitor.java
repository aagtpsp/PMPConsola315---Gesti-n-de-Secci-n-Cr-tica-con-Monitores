/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmpconsola315;

import java.util.ArrayList;

/**
 *
 * @author ifhprof01
 */
public class Monitor {
    private ArrayList lista;

    public Monitor() {
        this.lista = new ArrayList();
    }
    
    public Monitor(ArrayList lista) {
        this.lista = lista;
    }
    
    public void anadir(Object o) {
        lista.add(o);
    }
    
    public void sacar() {
        lista.remove(lista.size() - 1);
    }

    public ArrayList getLista() {
        return lista;
    }

    @Override
    public String toString() {
        return "Monitor{" + "lista=" + lista + '}';
    }
    
}
