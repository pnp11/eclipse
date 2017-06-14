
public class petle {
	public static void main(String[] args)
	{
		int yourSales = 3000;
		int target = 2000;
		
		//instrukcje petli if
		if(yourSales  >= 2 * target )
		{
			String performance = "Zankomicie";
			int bonus = 1000;
			System.out.println(performance);
		}
		else if(yourSales  >= 1.5 * target )
		{
			String performance = "Niezle";
			int bonus = 500;
			System.out.println(performance);
		}
		else if(yourSales  >= target )
		{
			String performance = "Srednio";
			int bonus = 100;
			System.out.println(performance);
		}
		else
		{
			System.out.println("Jestes zwolniony");
		}
	}
}
