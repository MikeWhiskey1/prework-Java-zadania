//#### Zadanie 5
//
//		W pliku `Main5.java`
//
//		1. Stwórz tablicę z 10 dowolnymi liczbami, tablicę nazwij `numbers`.
//		2. Stwórz zmienną  ```max``` i przypisz do niej `0`.
//		3. Za pomocą pętli ```for``` znajdź liczbę, która jest największa, przypisz ją do zmiennej ```max```
//		i wypisz na konsoli.
//		4. Aby to zrobić przeiteruj tablicę i sprawdź czy dany element jest większy od aktualnej wartości `max`
//		– jeśli tak, zaktualizuj zmienną `max`.
//		5. Sprawdź czy Twój kod będzie działał poprawnie jeśli w tablicy znajdą się **tylko** liczby ujemne.
//		6. Spróbuj zmodyfikować kod, aby działał on uniwersalnie (podpowiedź: wystarczy zmodyfikować 1 linię kodu).

public class Main5 {

	public static void main(String[] args) {
		int[] numbers = {-21, -23, -34, -45, -99, -67, -78, -78, -48, -10};
		int max = numbers[0]; //po modyfikacji pierwotnego zapisu: int 'max = 0'

		for (int i=0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println(max);

	}

}
