//#### Zadanie 10
//
//        W pliku `Main10.java` napisz program rysujący na podstawie wartości zmiennej `n` następujący schemat
//        (tutaj dla ```n = 5```).
//
//        ```
//*
//* *
//* * *
//* * * *
//* * * * *
//```
//        Możesz to zadanie rozwiązać na dwa sposoby:
//
//        1. używając pętli zależnych,
//        2. używając pętli niezależnych i instrukcji warunkowej `if`.
//
//        *Wzoruj się na poprzednich zadaniach. Trzeba tutaj trochę pomyśleć i rozumieć pętle zagnieżdżone.*

public class Main10 {

    public static void main(String[] args) {
        int n = 5;

        // petla zależna

        for (int i=0; i<n; i++) {
            String row = "";
            for(int j=0; j<=i; j++) {
                row += "* ";
            }
            System.out.println(row);
        }

        // pętla niezależna

//        for (int i=0; i<n; i++) {
//            String row = "";
//            for (int j=0; j<n; j++) {
//                if (j <= i) {
//                    row += "* ";
//                }
//            }
//            System.out.println(row);
//
//        }



    }

}
