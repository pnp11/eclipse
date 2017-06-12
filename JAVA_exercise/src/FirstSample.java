
public class FirstSample {
	public static void main(String[] args)
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
	}
}
