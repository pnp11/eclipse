
/**
 * Ten program demonstruj przechowywanie danych tabelarycznych w tablicach dwuwymiarowych
 * @author epiotno
 *
 */
public class CompoudInterst {
	public static void main(String[] args)
	{
		final double STARTRATE = 10;
		final int NRATES = 6;
		final int NYEARS = 10;
		
		//Ustawienie stop oprocentowania na wartosci w przedziale 10-15%
		double[] interstRate = new double[NRATES];
		for(int j=0; j<interstRate.length; j++)
			interstRate[j] = (STARTRATE+j)/100.0;
	
		double[][] balances = new double[NYEARS][NRATES];
		
		//Ustawianie sald poczatkowych na 10 000.
		for(int j=0; j<balances[0].length; j++)
			balances[0][j] = 10000;
		
		//Obliczenie odsetek dla przyszlych lat
		for(int i=1; i<balances.length; i++)
		{
			for(int j=0; j<balances[i].length; j++)
			{
				//Pobranie sald z minionego roku z poprzedniego wiersza
				double oldBalance = balances[i-1][j];
				
				//Obliczenie odsetek
				double interest = oldBalance*interstRate[j];
				
				//Oblicznie tegorocznego salda
				balances[i][j] = oldBalance+interest;
			}
		}
		//Wydruk jednego wiersza stop oprocentowania
		for(int j=0; j< interstRate.length; j++)
			System.out.printf("%9.0f%%",  100*interstRate[j]);
		
		System.out.println();
		
		//Wydruk sald
		for(double[] row  : balances)
		{
			//Wydruk wiersza tabeli
			for(double b : row)
				System.out.printf("%10.2f", b);
			
			System.out.println();
		}	
	}
}
