/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package foto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Datei die Dinge mit Zahlen macht.
 * @author Lennart Hoffjann
 * @version Oct 27, 2013
 */
public class Fotohandler {

    /**
     * Liest Datei und macht Sachen
     * @param datName
     * @throws NumberFormatException
     * @throws IOException
     */
    public void ladeDatei(String datName) throws NumberFormatException, IOException {
        int Red = 0;
        int Green = 0;
        int Blue = 0;
        int Rcount = 0;
        int Gcount = 0;
        int Bcount = 0;
        int i = 0;

        String input;
        // Datei einlesen
        BufferedReader in = new BufferedReader(new FileReader(datName));
        while ((input = in.readLine()) != null) {
            String[] splitResult = input.split(" ");
            while (i < splitResult.length - 2) {

                Red = Red + Integer.parseInt(splitResult[(int) i]);
                Rcount = Rcount + 1;
                Green = Green + Integer.parseInt(splitResult[(int) (i + 1)]);
                Gcount = Gcount + 1;
                Blue = Blue + Integer.parseInt(splitResult[(int) (i + 2)]);
                Bcount = Bcount + 1;
                i = i + 3;

            }
            i = 0;
            splitResult = null;

        }
        in.close();

        System.out.println(Red / Rcount);
        System.out.println(Green / Gcount);
        System.out.println(Blue / Bcount);


    }
}
