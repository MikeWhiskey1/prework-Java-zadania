//#### Zadanie 9
//
//        W pliku `Main9.java` napisz program rysujący, na podstawie wartości zmiennej `n`, następujący schemat:
//
//        Przykład dla `n = 5`
//
//        ```
//* 2 3 4 5
//* * 3 4 5
//* * * 4 5
//* * * * 5
//* * * * *
//```
//
//        Przykład dla `n = 3`
//
//        ```
//* 2 3
//* * 3
//* * *
//```
//
//        Do stworzenia takiego zapisu, w środku zagnieżdżonej pętli, użyj wyrażenia warunkowego `if`, dzięki któremu
//        zdecydujesz czy wypisać gwiazdkę, czy licznik z zagnieżdżonej pętli.


public class Main9 {

    public static void main(String[] args) {
        int n = 5;

        for (int i=1; i<=n; i++) {
            String row = "";
            for (int j=1; j<=n; j++) {
                if (i >= j) {
                    row += "* ";
                }
                else {
                    row += j+" ";
                }

            }
            System.out.println(row);
        }

    }

}
