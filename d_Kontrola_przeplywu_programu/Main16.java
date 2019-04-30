//#### Zadanie 16 – **dodatkowe**
//
//        W pliku `Main16.java` utwórz dwie zmienne: `x` i `y`, będące dodatnimi liczbami całkowitymi.
//
//        1. Napisz program wyliczający największy wspólny dzielnik (*greatest common divisor – GDC*) dwóch liczb.
//        2. Skorzystaj z opisu na tej [stronie][GDC].
//        3. Wynik wyświetl w konsoli wraz z liczbami, dla których został wyliczony, wg wzoru:
//        `Dla liczb 420 i 168 GDC to: 84`.


public class Main16 {

    public static void main(String[] args) {
        int origA, origB, A, B;
        A = origA = 420;
        B = origB = 168;
//      A = origA = Integer.parseInt(args[0]);
//      B = origB = Integer.parseInt(args[1]);
        int res = A % B;

        while(res > 0) {
            A = B;
            B = res;
            res = A % B;
        }
        System.out.println("Dla liczb " + origA + " i " + origB + " GDC to: " + B);

    }

}
