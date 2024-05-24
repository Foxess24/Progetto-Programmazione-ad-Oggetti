/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio4server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matte
 */
public class Esercizio4Server {

    /**
     * @param args the command line arguments
     */
    protected static final int PORT = 3000;

    public static void main(String[] args) {
        ServerSocket server = null;

        try {
            server = new ServerSocket(PORT);
            System.out.println("Server up...");
        } catch (IOException ex) {
            Logger.getLogger(Esercizio4Server.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Random r = new Random();
            int N = r.nextInt(10);
            Verifica C = new Verifica();
            for (;;) {
                Socket A = server.accept();
                ServerThread B = new ServerThread(A, C, N);
                B.start();
            }

        } catch (IOException ex) {
            Logger.getLogger(Esercizio4Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
