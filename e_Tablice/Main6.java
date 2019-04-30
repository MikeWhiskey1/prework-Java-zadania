//#### Zadanie 6
//
//		W pliku `Main6.java`
//
//		1. Stwórz tablicę z 10 dowolnymi liczbami, tablicę nazwij `numbers`.
//		2. Wypisz elementy tablicy od końca, używając pętli ```for``` – każdy element w nowej linii.

public class Main6 {

	public static void main(String[] args) {
		int[] numbers = {12, 23, 34, 45, 56, 67, 78, 89, 90, 123};

		for (int i=1; i <= numbers.length; i++) {
			System.out.println(numbers[numbers.length-i]);
		}

	}

}
