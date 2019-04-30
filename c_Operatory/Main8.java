//### Zadanie 8 – **dodatkowe**
//
//		W pliku `Main8.java` wykonaj następujące zadania:
//
//		1. Zdefiniuj zmienną `black` – o wartości `16`, oraz zmienną `white` – o wartości `15`.
//		2. Zdefiniuj zmienną `blackOrWhite`, która będzie przechowywać **wartość logiczną** porównania czy `black` **<** `white`.
//		3. Zdefiniuj zmienną `good` – o wartości logicznej **prawda**, oraz zmienną `bad` – o wartości logicznej **fałsz**.
//		4. Zdefiniuj zmienną `goodOrBad`, która będzie przechowywać **wartość logiczną** porównania `good` **LUB (or)** `bad`.
//		5. Zdefiniuj zmienną `comparison`, która będzie przechowywać **wartość logiczną** porównania `blackOrWhite` **I (and)** `goodOrBad`.
//		6. Wyświetl w konsoli – w nowych liniach – kolejno zmienne: `blackOrWhite` , `goodOrBad` i `comparison`.
//		7. Przeanalizuj otrzymany wynik.


public class Main8 {

	public static void main(String[] args) {
		int black = 16;
		int white = 15;
		boolean blackOrWhite = black < white;
		boolean good = true;
		boolean bad = false;
		boolean goodOrBad = good || bad;
		boolean comparison = blackOrWhite && goodOrBad;
		System.out.println("blackOrWhite = " + blackOrWhite);  	// 'false', bo 16 nie jest równe 15
		System.out.println("goodOrBad = " + goodOrBad);			// 'true', bo jedna ze stron jest 'true'
		System.out.println("comparison = " + comparison);		// 'false', bo jedna ze strona jest 'false'


	}

}
