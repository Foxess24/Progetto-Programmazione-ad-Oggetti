/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

/**
 *
 * @author matte
 */
public class Elemento {

    String stringa;
    Elemento next;

    public Elemento(String stringa, Elemento next) {
        this.stringa = stringa;
        this.next = next;
    }

}
