import java.util.*;


public class Retirement2 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Ile pieniedzy rocznie bedziesz wplcac?  ");
		double payment = in.nextDouble();
		
		System.out.print("Stopa oprocentowania w %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int year = 0;
		
		String input;
		
		//Aktualizacja stanu konta, kiedy uzytkownik nie jest gotowy do przejscia na emeryture
		do
		{
			//Dodawanie tegorocznych platnosci i odestek
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			
			year++;
			
			//Drukowanie aktualnego stanu konta
			System.out.printf("Po uplywie %d lat stan Twojego konta wyniesie %,.2f%n", year, balance);
			
			//Zaytanie o gotowosc do przejscia na emeryture i pobranie danych
			System.out.print("Chcesz przejsc na emeryture? (T/N) ");
			input = in.next();
		}
		while(input.equals("N"));
	}
}
