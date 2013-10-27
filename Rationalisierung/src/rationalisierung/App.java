/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rationalisierung;



/**
 *
 * @author jhoffjann
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rationalisierung ratio = new Rationalisierung();
        
        double N = ratio.getN();
        
        System.out.print("Bruch f?r " + N + " wird berechnet.");
        
        int zaehler = ratio.DoubletoInt(N);
        int nenner = ratio.Nennerberechnen(zaehler);
        int ggT = ratio.euclid(zaehler, nenner);
        System.out.println("\nDer entg?ltige Bruch ist: " + ratio.bruch(zaehler, nenner, ggT));

    }
}
