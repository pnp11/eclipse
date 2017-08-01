import java.text.DateFormatSymbols;
import java.util.*;

/**
 * Kalendarz gregorianski
 * @author epiotno
 *
 */
public class CalendarTest {
	public static void main (String[] main)
	{
		Locale.setDefault(Locale.ENGLISH);
		//Konstrukcja i ustawienie obiektu d oraz jego inicjacja aktualna data
		GregorianCalendar d = new GregorianCalendar();

		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH);		
		//System.out.println(today + " " + month);	//wyswieltnie aktualnego dnia oraz miesiaca
		
		//Ustawienie d na pozatke miesiaca
		d.set(Calendar.DAY_OF_MONTH, 1);
		
		int weekday = d.get(Calendar.DAY_OF_WEEK);
		//System.out.println(weekday);
		
		//Pobranie pierwszego dnia tygodnia
		int firstDayOfWeek = d.getFirstDayOfWeek();
		//System.out.println(firstDayOfWeek);
				
		//Okreslenie odpowiedniego wciecia pierwszego wiersza
		int indent = 0;
		while(weekday != firstDayOfWeek)
		{
			indent++;
			d.add(Calendar.DAY_OF_MONTH, -1);
			weekday=d.get(Calendar.DAY_OF_WEEK);
		}
		
		//Drukowanie nazw dni tygodnia
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
		do
		{		
			System.out.printf("%4s", weekdayNames[weekday]);
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		}
		while(weekday != firstDayOfWeek);
		System.out.println();
		
		for(int i=1;i<=indent;i++)
			System.out.print("    ");
				
		d.set(Calendar.DAY_OF_MONTH, 1);
		do
		{
			//Drukowanie dnia
			int day=d.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);
			
			//Oznaczenie biezacego dnia znakiem *
			if(day == today)
				System.out.print("*");
			else
				System.out.print(" ");
			
			//Ustawienie d na kolejny dzien
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday=d.get(Calendar.DAY_OF_WEEK);
			
			//Rozpoczecie nowego wiersza na poczatek tygodnia
			if(weekday == firstDayOfWeek)
				System.out.println();
			
		}
		while(d.get(Calendar.MONTH) == month);
		//Petla konczy dzialanie, jesli d jest pierwszym dniem miesiaca
		
		//Wydruk koncowego znaku nowego wiersza w razie potrzeby
		if(weekday != firstDayOfWeek)
			System.out.println();		
	}
}
