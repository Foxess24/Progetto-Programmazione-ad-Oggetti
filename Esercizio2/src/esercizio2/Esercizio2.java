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
public class Esercizio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista L = new Lista(5);

        try {
            boolean b = L.andIterativo();
            System.out.println(b);
        } catch (ValoreNonAmmesso ex) {
            System.out.println(ex.getMessage());
        }

        try {
            boolean c = L.andRicorsivo();
            System.out.println(c);
        } catch (ValoreNonAmmesso ex) {
            System.out.println(ex.getMessage());
        }
    }

}
