//#### Zadanie 3
//
//		1. W pliku `Main3.java` stwórz pętlę, która 10 razy wypisze w konsoli tekst: *"Lubię Javę"*.
//		2. Napisz zarówno pętlę `for` jak i pętlę `while`.
//		3. W sumie napis będzie widoczny 20 razy.

public class Main3 {

	public static void main(String[] args) {
		String text = "Lubię Javę";

		for (int i = 0; i < 20; i++) {
			System.out.println(text);
		}

		int j = 0;
		while (j < 20) {
			System.out.println(text);
			j++;
		}

	}

}
