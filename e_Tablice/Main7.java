
import java.util.Random;

//#### Zadanie 7 – **dodatkowe**
//
//		W pliku `Main7.java` stwórz tablicę o nazwie `randNumbers` ze 100 losowymi liczbami z zakresu `0-20`.
//
//		1. Tablicę wypełnij za pomocą pętli `for` – do otrzymania losowej liczby użyj kodu umieszczonego w pliku.
//		2. Wypisz na stronie wylosowane liczby, oddzielone od siebie przecinkiem `18,12,1,3...`.
//		3. Oblicz sumę liczb z tablicy, wynik przypisz do zmiennej `sum`.
//		4. Wypisz w konsoli (w nowej linii) sumę wg wzoru: `Suma 100 losowych liczb od 0 do 20 to: 876.`.

public class Main7 {

	public static void main(String[] args) {
		Random generator = new Random();
		generator.nextInt(21);

		int[] randNumbers = new int[100];
		int sum = 0;

		for(int i=0; i<randNumbers.length; i++) {
			randNumbers[i] = generator.nextInt(21);
			System.out.print(randNumbers[i] +",");
			sum += randNumbers[i];
		}
		System.out.println("\nSuma 100 losowych liczb od 0 do 20 to: " + sum);

	}

}
