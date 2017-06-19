import java.util.*;

public class LotteryOdds {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Ile liczb mam wylosowac? ");
		int k = in.nextInt();
		
		System.out.print("Jaka jest gorna granica przedzialu losowanych liczb? ");
		int n = in.nextInt();
		
		/*
		 * Oblicznie wpsolczynnika dwumianowego n*(n–1)*(n–2)*…*(n–k+1)/(1*2*3*…*k)
		 */
		int lotteryOdds = 1;
		for(int i = 1; i <= k; i++)
			lotteryOdds = lotteryOdds*(n-i+1)/i;
		
		System.out.println("Twoje szanse to 1 do " + lotteryOdds + ". Powodzenia!");
	}
}
