//#### Zadanie 4
//
//		1. W pliku `Main4.java` stwórz pętlę, która wypisze w konsoli liczby od 1 do 100, jedna w jednej linii.
//		2. Napisz zarówno pętlę `for` jak i pętlę `while`.
//		3. W sumie zostanie wypisanych 200 liczb.

public class Main4 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}

		int j = 1;
		while (j < 101) {
			System.out.println(j);
			j++;
		}

	}

}
