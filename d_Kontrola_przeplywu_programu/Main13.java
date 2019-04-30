//#### Zadanie 13 – **dodatkowe**
//
//        W pliku `Main13.java` napisz program, który wystawi ocenę z testu.
//
//        * `0-39` pkt – ocena niedostateczna
//        * `40-54` pkt – ocena dopuszczająca
//        * `55-69` pkt – ocena dostateczna
//        * `70-84` pkt – ocena dobra
//        * `85-98` pkt – ocena bardzo dobra
//        * `99-100` pkt – ocena celująca
//
//        1. Stwórz zmienną `points`, do której będzie przypisany wynik z testu.
//        2. Na początku sprawdź, czy liczba punktów jest:
//        * większa bądź równa `0`, jeśli nie – wypisz na konsoli komunikat: `Liczba punktów mniejsza niż 0.`;
//        * mniejsza bądź równa `100`, jeśli nie – wypisz na konsoli komunikat: `Liczba punktów większa niż 100.`.
//        4. Następnie sprawdź jaka ocena odpowiada danej liczbie punktów i wypisz ją na konsoli wg wzoru: `Wynik:
//        ocena dobra`.
//        5. Rozwiąż to zadanie używając konstrukcji `if ... else if ... else`.

public class Main13 {

    public static void main(String[] args) {
        int points = 75;
        String grade;


        if (points < 0) {
            System.out.println("Liczba punktów mniejsza niż 0.");
        }

        if (points > 100) {
            System.out.println("Liczba punktów większa niż 100.");
        }

        System.out.print("Wynik: ");

        if (points>=0 && points<=39) {
            grade = "ocena niedostateczna";
            System.out.println(grade);
        }
        else if (points>=40 && points<=54) {
            grade = "ocena dopuszczająca";
            System.out.println(grade);
        }
        else if (points>=55 && points<=69) {
            grade = "ocena dostateczna";
            System.out.println(grade);
        }
        else if (points>=70 && points<=84) {
            grade = "ocena dobra";
            System.out.println(grade);
        }
        else if (points>=85 && points<=98) {
            grade = "ocena bardzo dobra";
            System.out.println(grade);
        }
        else if (points>=99 && points<=100) {
            grade = "ocena celująca";
            System.out.println(grade);
        }
    }

}