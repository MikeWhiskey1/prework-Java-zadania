//#### Zadanie 5
//
//		Otwórz plik `Main5.java`.
//		Spróbuj – bez uruchamiania – odpowiedzieć na pytanie jaki będzie wynik programu zawartego w pliku.
//
//		Zweryfikuj własne przypuszczenia poprzez uruchomienie programu.
//
//		Opisz w komentarzu wyjaśnienie działania programu.

public class Main5 {

	public static void main(String[] args) {
		int a = 1;
		int b;
		System.out.println(++a);  	// wypisze się 2 - preinkrementacja 'a'
		System.out.println(a++); 	// wypisze się aktualna wartość 2 (ale w wyniku postinkrementacji 'a' przyjmie wartość 3)
		System.out.println(a);	  	// wypisze się 3 - aktualna wartosc zmiennej 'a'
		b=a++;						// do 'b' przypisze się aktualna wartość 'a' czyli 3, nastepnie 'a' zwiększy wartość do 4
		System.out.println(b);		// wypisze się 3 (aktualna wartość 'b')
		b=++a;						// 'a' zwiekszy się do 5 (preinkrementacja) i wartość to zostanie przypisana do 'b'
		System.out.println(++a);	// wypisze się 6, ponieważ aktualne 'a' = 5 zwiększy się do 6
	}

}
