/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

import java.util.Random;

/**
 *
 * @author matte
 */
public class Esercizio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Museo M = new Museo(30);
        Random r = new Random();
        int n = r.nextInt(2000);
        System.out.println("Il costo medio dei reperti con datazione > di " + n + " è--> " + M.media(n));
    }

}
