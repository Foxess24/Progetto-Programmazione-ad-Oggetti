/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

import java.util.Random;

/**
 *
 * @author matte
 */
public class Lista {

    Elemento testa = null;

    public Lista(int n) {
        Elemento ultimo = null;
        Random r = new Random();
        if (testa == null) {
            testa = new Elemento((r.nextInt(1) == 1 ? "vero" : "falso"), null);
            ultimo = testa;
        }
        for (int i = 0; i < n - 1; i++) {
            ultimo.next = new Elemento((r.nextInt(1) == 1 ? "vero" : "falso"), null);
            ultimo = ultimo.next;
        }
    }

    public boolean andIterativo() throws ValoreNonAmmesso { 
        for (Elemento e = testa; e != null; e = e.next) {
            if (e.stringa.equalsIgnoreCase("falso")) {
                return false;
            } else if (e.stringa.equalsIgnoreCase("vero")) {
                //CONTINUA
            } else {
                throw new ValoreNonAmmesso();
            }
        }
        return true;
    }

    private boolean andRicorsivo(Elemento e) throws ValoreNonAmmesso {
        if (e == null) {
            return true;
        } else {
            if (e.stringa.equalsIgnoreCase("vero")) {
                return andRicorsivo(e.next);
            } else if (e.stringa.equalsIgnoreCase("falso")) {
                return false;
            } else {
                throw new ValoreNonAmmesso();
            }
        }
    }

    public boolean andRicorsivo() throws ValoreNonAmmesso {
        return andRicorsivo(testa);
    }
}
