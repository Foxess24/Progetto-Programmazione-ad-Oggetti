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
public class Animali extends Reperto {

    int zampe;

    public Animali(int zampe, String nomescientifico, int Data) {
        super(nomescientifico, Data);
        this.zampe = zampe;
    }

    @Override
    double costo() {
        return 3 * getDatazione() + (zampe > 4 ? 50 : 0);
    }

}
