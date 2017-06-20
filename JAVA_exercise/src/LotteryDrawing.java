import java.util.*;

/**
 * Ten program demonstruje zastosowanie tablic
 * @author epiotno
 *
 */
public class LotteryDrawing {
	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		
		System.out.print("Ile liczb musisz wylosowac? ");
		int k = in.nextInt();
		
		System.out.print("Jaka jest najwieksza liczba? ");
		int n = in.nextInt();
		
		//Zapelnienie tablicy liczbami 1 2 3 ... n
		int[] numbers = new int[n];
		for(int i=0; i<numbers.length; i++)
			numbers[i] = i+1;
		
		//Losowanie k liczb i zapisanie ich w drugiej tablicy
		int[] result = new int[k];
		for(int i=0; i<result.length; i++)
		{
			//Losowanie indeksu z z zakresu od 0 do n-1
			int r=(int) (Math.random()*n);
			
			//Pobieranie elementu z losowanej lokalizacji
			result[i] = numbers[r];
			
			//Przenisienie ostatniego elementu do losowej lokalizacji
			numbers[r] = numbers[n-1];
			n--;
		}
		//Wydruk zapisanej tablicy
		Arrays.sort(result);
		System.out.println("Postaw na nastepujace liczby, Dzieki nim wygrasz!");
		for(int r : result)
			System.out.println(r);
	}

}
