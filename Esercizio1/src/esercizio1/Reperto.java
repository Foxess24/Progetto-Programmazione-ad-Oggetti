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
public abstract class Reperto {

    String nomescientifico;
    private int Datazione;

    public Reperto(String nomescientifico, int Data) {
        this.nomescientifico = nomescientifico;
        this.Datazione = Data;
    }

    public void Riassegna(int Datazione) {
        if (Datazione > 0) {
            this.Datazione = Datazione;
        }
    }

    public int getDatazione() {
        return Datazione;
    }
    
    abstract double costo();

}
