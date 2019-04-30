//#### Zadanie 11
//
//        W pliku `Main11.java` napisz program rysujący, na podstawie wartości zmiennej `n`, następujący schemat
//        (tutaj dla ```n = 5```):
//
//        ```
//* 2 3 4 5
//* * 3 4 5
//* * * 4 5
//* * * * 5
//* * * * *
//* * * * *
//* * * * 5
//* * * 4 5
//* * 3 4 5
//* 2 3 4 5
//```
//
//        Do stworzenia takiego zapisu, w środku zagnieżdżonej pętli, użyj wyrażenia warunkowego `if`, dzięki
//        któremu zdecydujesz czy wypisać gwiazdkę, czy licznik z zagnieżdżonej pętli.


public class Main11 {

    public static void main(String[] args) {
        int n = 5;

        for (int i=1; i<n+1; i++) {
            String row = "";
            for (int j=1; j<=n; j++) {
                if (j<=i) {
                    row += "* ";
                }
                else {
                    row += j+" ";
                }
            }
            System.out.println(row);
        }
        for (int i=1; i<=n; i++) {
            String row = "";
            for (int j=1; j<=n; j++) {
                if (j<=n-i+1) {
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
