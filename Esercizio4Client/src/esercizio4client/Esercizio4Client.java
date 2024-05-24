/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio4client;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matte
 */
public class Esercizio4Client {

    /**
     * @param args the command line arguments
     */
    protected static final int PORT = 3000;

    public static void main(String[] args) {
        Socket S = null;
        PrintWriter out = null;

        try {
            S = new Socket("localhost", PORT);
            out = new PrintWriter(new OutputStreamWriter(S.getOutputStream()));

            Random r = new Random();
            int M = r.nextInt(100);
            int i = 0;

            while (i < M) {
                out.println("Stringa" + i);
                out.flush();
                i++;
            }
            out.println("Bye");
            out.flush();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (out != null) {
                out.close();
            }
            if (S != null) {
                try {
                    S.close();
                } catch (IOException ex) {
                    Logger.getLogger(Esercizio4Client.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
