
public class Fakultaet {
	public static void main(String[] args) {

	int eingabe = 7;
	int loesung = 1;

	for (int zaehler = 2; zaehler <= eingabe; zaehler++) {
		loesung = loesung * zaehler;
	}
	System.out.println(
		"Die Fakultät von " + eingabe + " ist " + loesung + "."
	);
	}
}
