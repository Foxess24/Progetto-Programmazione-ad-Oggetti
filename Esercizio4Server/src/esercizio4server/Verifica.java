/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio4server;

/**
 *
 * @author matte
 */
public class Verifica {

    private int count = 0;

    public synchronized void incrementa() {
        count++;
    }

    public int getCount() {
        return count;
    }

}
