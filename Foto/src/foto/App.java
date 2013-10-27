/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package foto;

/**
 * App Klasse die FotoHandler aufruft
 * @author Lennart Hoffjann
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pfad relativ machen und Datei in Projekt einbinden.
        String dateiName = "C:/Users/Dachboden/Documents/BundeswettbewerbInformatik2013/Kamera1/Kamera1/K1Bild1.txt";
        Fotohandler foto = new Fotohandler();
        try{
            foto.ladeDatei(dateiName);
        }
        catch(Exception ex){
            throw new Error("Das sollte nicht passieren", ex);
        }
        
    }
}
