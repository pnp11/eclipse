import java.util.Scanner;

public class Retirement {
	public static void main(String[] args)
	{
		//Wczytanie danych
		Scanner in = new Scanner(System.in);
		
		System.out.print("Ile pieniedzy potrzebujsz, aby przejsc na emeryture? ");
		double goal = in.nextDouble();
		
		System.out.print("Ile pieniedzy bedziesz rocznie bedziesz wplacac? ");
		double payment = in.nextDouble();
		
		System.out.print("Stopa procentowa w %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;
		
		//Aktualizacja salda konta jesli cel nie zostanie osogniety
		while (balance < goal)
		{
			//Dodanie tegorocznych platnosci o odestek
			balance += payment;
			double interest = balance * interestRate / 100;
			
			balance += interest;
			years++;
		}
		System.out.println("Mozesz przejsc na emeryture za " + years + " lat.");
	}
}
