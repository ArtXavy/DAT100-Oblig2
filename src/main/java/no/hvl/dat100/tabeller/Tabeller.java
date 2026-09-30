package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int tall : tabell){
			System.out.println(tall);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String nyTabell = "[";

		for (int i = 0; i < tabell.length; i++){

			nyTabell += tabell[i];

			if(i < tabell.length - 1){
				nyTabell += ",";
			}
		}
		nyTabell += "]";

		return nyTabell;

	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {
		if (tabell == null) {
			return null;
		}
		int[] nyTabell = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			nyTabell[i] = tabell[tabell.length - 1 - i];
		}
		return nyTabell;
	}
		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");


	// g)
	public static boolean erSortert(int[] tabell) {
if (tabell == null) {
	return false;
}
for (int i = 0; i < tabell.length - 1; i++) {
	if (tabell[i] > tabell[i + 1]) {
		return false;
	}
}
return true;
}
		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int nyLengde = tabell1.length + tabell2.length;
		int [] tabell3 = new int[nyLengde];
		for (int i = 0; i < tabell1.length; i++){
			tabell3[i] = tabell1[i];
		}
		for (int j=0; j < tabell2.length; j++){
			tabell3[tabell1.length+j] = tabell2[j];
		}
		return tabell3;
	}

}
