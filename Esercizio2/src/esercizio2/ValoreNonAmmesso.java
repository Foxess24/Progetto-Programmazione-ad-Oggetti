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
public class ValoreNonAmmesso extends Exception {

    public ValoreNonAmmesso() {
        super("EXCEPTION: Valore non ammesso --> (!= falso) && (!=vero) .");
    }
}
