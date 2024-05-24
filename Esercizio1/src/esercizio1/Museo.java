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
public class Museo {

    Reperto V[];

    public Museo(int n) {
        V = new Reperto[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            if (r.nextBoolean()) {//se vero aggiungo reperto animale
                V[i] = new Animali(r.nextInt(4), "Identificativo Animali " + i, r.nextInt(1500));
            } else {//se falso aggiungo reperto vegetale
                V[i] = new Vegetali(r.nextBoolean(), "Identificativo Vegetali " + i, r.nextInt(2000));
            }
        }
    }

    public double media(int n) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < V.length; i++) {
            if (V[i].getDatazione() > n) {
                count++;
                sum += V[i].costo();
            }
        }
        return sum / count;
    }

}
