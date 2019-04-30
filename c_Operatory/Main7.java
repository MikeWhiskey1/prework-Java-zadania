//#### Zadanie 7
//
//		W pliku `Main7.java` stwórz trzy zmienne o nazwach: `nr1, nr2, result`.
//
//		1. Do zmiennych `nr1` i `nr2` przypisz liczby odpowiednio: `7` i `4`.
//		2. Do zmiennej `result` przypisz ich sumę i wypisz ją w konsoli.
//		3. Zmodyfikuj wartość zmiennej `nr1` na `10`, ale nie usuwając poprzedniego kodu &ndash; pisz w linijkach poniżej.
//		4. Ponownie oblicz sumę `nr1` i `nr2`, i przypisz ją do zmiennej `result`. Wypisz wynik w konsoli.
//		5. Wynik jest inny niż w pkt. 2 &ndash; napisz w komentarzu dlaczego tak się stało.

public class Main7 {

	public static void main(String[] args) {
		int nr1 = 7;
		int nr2 = 4;
		int result = nr1 + nr2;
		System.out.println("'Result' przed modyfikacją: " + result);
		nr1 = 10;	// wartość zmiennej nr1 została nadpisana z 7 do 10
		result = nr1 + nr2;
		System.out.println("'Result' po modyfikacji: " + result);
	}

}
