/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio4server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matte
 */
public class ServerThread extends Thread {

    Socket S;
    Verifica C;
    int N;

    public ServerThread(Socket S, Verifica C, int N) {
        this.S = S;
        this.C = C;
        this.N = N;
    }

    @Override
    public void run() {
        BufferedReader in = null;

        try {
            in = new BufferedReader(new InputStreamReader(S.getInputStream()));
        } catch (IOException ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            String linea;
            while (!(linea = in.readLine()).equalsIgnoreCase("BYE")) {
                if (linea.length() == N) {
                    C.incrementa();
                }
            }
            System.out.println("Tutti i client hanno inserito " + C.getCount() + " stringhe di lunghezza " + N + ".");
        } catch (IOException ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (S != null) {
                try {
                    S.close();
                } catch (IOException ex) {
                    Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
