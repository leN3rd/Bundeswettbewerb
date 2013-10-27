import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Rationalisierung {
	public static void main (String[] args ){
		double N = 0;
		int zaehler = 0;
		int nenner = 0;
		int ggT = 0;
		String ergebnis = "";
		N = getN();
		System.out.print("Bruch für " + N + " wird berechnet.");
		zaehler = DoubletoInt(N);
		nenner = Nennerberechnen(zaehler);
		ggT = euclid(zaehler, nenner);
		ergebnis = bruch(zaehler, nenner, ggT);
		System.out.println("\nDer entgültige Bruch ist: " + ergebnis);
		
	}
	
	public static String bruch (int Zaehler, int Nenner, int ggT ){
		int ZaehlerdggT = Zaehler/ggT;
		int NennerdggT = Nenner/ggT;
		String maxkurz = String.valueOf(ZaehlerdggT)+"/"+String.valueOf(NennerdggT);
		
		
		
		return maxkurz;
	}
	
	
	
	
	public static int euclid(int Zaehler, int Nenner){
		int a = Zaehler;
		int b = Nenner;
		
		if ( a == 0 ){
			return b;
		}else{
			while (b != 0){
				if (a>b){
					a = a-b;
				}else{
					b = b -a;
				}
			}
			
		}
		System.out.print("\nDer ggT ist " +a);
		return a;
	}
	
	
	
	
	public static int DoubletoInt(double doublenumber){
		String x = String.valueOf(doublenumber);//Gleitkommazahl in String umwandeln um das Komma zu entfernen.
		
		String y = "";  
		y = x.replaceAll("[^0-9]",""); //Entferne alle Zeichen die keine Zahlen sind.
		int Zaehler =  Integer.parseInt(y);
		
		
			
		
					//Länge des Strings ermitteln um Nenner festzulegen. 
					//Sting in int umwandeln
		
		
		return Zaehler;
		
	}
	
	
	
	public static int Nennerberechnen(int Zaehler){
		String x = String.valueOf(Zaehler);
		double i = x.length();
		double nenner = Math.pow(10, i-1);
		int y = (int) Math.round(nenner);
		
		
		
		
		return y;
	}
	

	@SuppressWarnings("finally")
	public static double getN(){
		double x = 0;
		System.out.print("Welche Fließkommazahl soll bearbeitet werden? ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		try {
			x = Double.parseDouble(br.readLine());
			
		}catch(Exception e) {
			System.out.print("\n Doesnt Work.");
			System.exit(0);
			
		}finally{
			return x;
	}
	

}
	
	

}

