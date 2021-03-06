import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Scanner;

public class FirstSample {
	public static void main(String[] args) throws IOException
	{
		System.out.println("Nie powiemy \"Witaj, swiecie\"!");
		
		//Funkcje i stale matematyczne
		double x=4;
		double y = Math.sqrt(x);	//sqrt jest nazywana metoda statyczna
		System.out.println(y);		//wynik 2.0
		
		double a = 3.0;
		System.out.println(Math.pow(y, a));	//pow - podniesienie do potegi
		
		double i = 9.997;
		int ni = (int) i;				//rzutowanie liczby zmiennoprzecinkowej na calkowita
		System.out.println(ni); 		//Wynik 9
		
		int nj = (int) Math.round(i);	//rzutowanie liczby zmiennoprzecinkowej do najblizszej liczby calkowitej
		System.out.println(nj);			//Wynik 10
		
		//Polancuch
		String greeting = "Czesc";
		System.out.println(greeting.substring(0, 3));	//Wyswietli sie "Cze"
		
		//Konkatenacja
		String expletive = "brzydkie slowo";
		String PG13 = " usunieto";
		System.out.println(expletive + PG13); 		//Wynik: "brzydkie slowo usunieto"
		
		//Modyfikacja lancucha
		greeting = greeting.substring(0, 3) + "kaj";	//Wytnie 3 pierwsze znaki ze Stringa i doklei "kaj"
		System.out.println(greeting);				//Wynik: "Czekaj"
		
		//Porownywanie dwoch lancuchow - equals, lub equalsIgnoreCase - pominiecie wielkosci liter
		String s = "jeden";
		String t = "dwa";						
		System.out.println(s.equals(t));							//Wynik: false
		System.out.println("Czekaj".equals(greeting));				//Wynik: true
		System.out.println("Czekaj".equalsIgnoreCase(greeting));	//Wynik: true
		
		//Dlugosc lancucha
		System.out.println(greeting.length());						//Wynik: 6
		
		//Rzeczywista liczba wspolrzednych kodowych znakow
		System.out.println(greeting.codePointCount(0, greeting.length()));	//Wynik: 6
		
		//Zwrocenie jednostki kodowej z podanej pozycji
		System.out.println(greeting.charAt(0));	 					//Wynik: "C"
		
		//Skladanie lancuchow
		StringBuilder builder = new StringBuilder();
		builder.append("ch");										//Dodaje jeden znak
		builder.append("str");										//Dodaje lancuch
		String completeString = builder.toString();
		System.out.println(completeString);
		
		//Odbieranie danych wejsciowych
		Scanner in = new Scanner(System.in);
		System.out.println("Jak sie nazywasz?");
		String name = in.nextLine();								//Dane wejsciowe moga zawierac spacje
		//String firstname = in.next()								//Odczytanie tylko pierwszego slowa z wprowadzonego ciagu
		//int age = int.nextInt();									//Wczytanie liczb calkowitych
		int age2 = 10;
		System.out.println("Twoje nazwisko to: " + name);
		
		//Formatowanie danych wyjsciowych
		System.out.printf("Nazywasz sie: %s i masz %d lat.", name, age2);		//wyswietlenie sformatowanego lancucha
		String message = String.format("Witaj! Nazywasz sie %s i masz %d lat.", name, age2);	//utworzenie sformatowanego lancucha
		System.out.println(); 									//pusta linia
		System.out.printf("%tc", new Date());					//wyswietlenie aktualnej daty i godziny
		System.out.println();
		System.out.printf("%1$s %2$te %2$tB %2$tY", "Data:", new Date());	//Wyswietlenie sformatowanej daty
		
		
		//Zapis i odczyt plikow
		System.out.println();
		Scanner plik = new Scanner(Paths.get("plik.txt"));			//odczyt z pliku
		PrintWriter out = new PrintWriter("mojplik.txt");			//zapis do pliku
	}
}
