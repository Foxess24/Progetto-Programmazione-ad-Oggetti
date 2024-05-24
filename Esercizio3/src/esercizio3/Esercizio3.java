/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author matte
 */
public class Esercizio3 {

    /**
     * @param file
     * @param s
     * @param args the command line arguments
     * @return 
     */
    public static int verifica(String file, String s) {
        int count = 0;
        try ( FileReader F = new FileReader(file);  BufferedReader in = new BufferedReader(F)) {
            String linea;
            while ((linea = in.readLine()) != null) {
                if (linea.equalsIgnoreCase(s)) {
                    count++;
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(verifica("File.txt", "ciao"));
    }
    
}
