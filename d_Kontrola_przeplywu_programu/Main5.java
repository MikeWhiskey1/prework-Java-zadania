//#### Zadanie 5
//
//		1. W pliku `Main5.java` stwórz zmienną `resultFor` oraz `resultWhile` i przypisz do obu wartość `0`.
//		2. Następnie stwórz pętlę `for`, która doda do siebie liczby od 1 do 10 i zapisze wynik do zmiennej `resultFor`.
//		3. Analogicznie stwórz pętlę `while` i zapisz wynik do zmiennej `resultWhile`.
//		4. Pętle powinny – co uruchomienie (zwane także iteracją pętli) – dodawać do zmiennej `resultFor` lub `resultWhile` kolejną liczbę z podanego zakresu.
//		5. Wypisz w konsoli, w oddzielnych liniach, zmienne `resultFor` oraz `resultWhile`.

public class Main5 {

	public static void main(String[] args) {
		int resultFor = 0;
		int resultWhile = 0;

		for (int i = 1; i <= 10; i++) {
			resultFor += i;
		}

		int j = 1;
		while (j <= 10) {
			resultWhile += j;
			j++;
		}

		System.out.println("resultFor = " + resultFor);
		System.out.println("resultWhile = " + resultWhile);

	}
}