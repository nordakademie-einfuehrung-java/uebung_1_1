package uebung_1_1;

public class Quadratwurzel{
	public static void main(String[] args) {
		double p = 8;
		double q = 2;		

		double unterderwurzel = (Math.sqrt((p/2)*(p/2)-q));
		double vorderwurzel = (-p/2);
		double x1 = (vorderwurzel - unterderwurzel);
		double x2 = (vorderwurzel + unterderwurzel);
		
		System.out.println ("Die Ergebnisse:");
		System.out.println(("x1=" + x1));
		System.out.println(("x2=" +x2));
	}
}
