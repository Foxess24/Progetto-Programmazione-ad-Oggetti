/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

/**
 *
 * @author matte
 */
public class Vegetali extends Reperto {

    boolean sempreverdi;

    public Vegetali(boolean sempreverdi, String nomescientifico, int Data) {
        super(nomescientifico, Data);
        this.sempreverdi = sempreverdi;
    }

    @Override
    double costo() {
        return 2 * getDatazione() + (!sempreverdi ? 10 : 0);
    }

}
