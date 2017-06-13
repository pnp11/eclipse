import java.util.*;

public class InputTest {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		//Pobieranie pierwszej porcji danych
		System.out.print("Jak sie nazywasz? ");
		String name = in.nextLine();
		
		//Pobieranie drugiej porcji danych
		System.out.println("Ile masz lat? ");
		int age = in.nextInt();
		
		//Wydruk danych w konsoli
		System.out.println("Witaj " + name + ". W przyszlym roku bedziesz miec "
				+ (age + 1) + " lat.");
		System.out.printf("Witaj, %s. W przyszlym roku bedziesz miec lat %d", name, age);
	}
}