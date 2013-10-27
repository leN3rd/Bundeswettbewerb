package rationalisierung;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rationalisierung {

    /**
     *
     * @param args
     */
    /**
     * Berechnet Bruch für Gleitkommazahl
     *
     * @param Zaehler der gegebene Z?gler
     * @param Nenner der gegebene Nenner
     * @param ggT der größte gemeinsame Teiler
     * @return gibt Bruch zurück
     */
    public static String bruch(int Zaehler, int Nenner, int ggT) {
        int ZaehlerdggT = Zaehler / ggT;
        int NennerdggT = Nenner / ggT;
        String maxkurz = String.valueOf(ZaehlerdggT) + "/" + String.valueOf(NennerdggT);
        return maxkurz;
    }

    /**
     *
     * @param Zaehler
     * @param Nenner
     * @return
     */
    public static int euclid(int Zaehler, int Nenner) {
        int a = Zaehler;
        int b = Nenner;
        // Erkl?ren
        if (a == 0) {
            return b;
        } else {
            while (b != 0) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }

        }
        System.out.print("\nDer ggT ist " + a);
        return a;
    }

    /**
     *
     * @param doublenumber
     * @return
     */
    public static int DoubletoInt(double doublenumber) {
        String x = String.valueOf(doublenumber);
        //Gleitkommazahl in String umwandeln um das Komma zu entfernen.
        String y = x.replaceAll("[^0-9]", "");
        //Entferne alle Zeichen die keine Zahlen sind.
        int Zaehler = Integer.parseInt(y);
        //L?nge des Strings ermitteln um Nenner festzulegen. 
        //String in int umwandeln
        return Zaehler;

    }

    /**
     *
     * @param Zaehler
     * @return
     */
    public static int Nennerberechnen(int Zaehler) {
        String x = String.valueOf(Zaehler);
        double i = x.length();
        double nenner = Math.pow(10, i - 1);
        int y = (int) Math.round(nenner);
        return y;
    }

    /**
     *
     * @return
     */
    @SuppressWarnings("finally")
    public static double getN() {
        System.out.print("Welche Fließkommazahl soll bearbeitet werden? ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return Double.parseDouble(br.readLine());

        } catch (Exception e) {
            throw new Error("\n Doesnt Work.", e);

        }


    }
}
