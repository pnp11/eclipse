package abstractClasses;

import java.util.*;

/**Ten program demonstruje klasy abstrakcyjne
 * @author epiotno
 *
 */
public class PersonTest {
	public static void main(String[] args)
	{
		Person[] people = new Person[2];
		
		//Wstawienie do tablic people obiektow Student i Employee
		people[0] = new Employee("Henryk Kwiatek", 50000, 1989, 10, 1);
		people[1] = new Student("Maria Mrozowska", "informatyka");
		
		//Drukowanie imion i nazwisk oraz opsiow wszystkich obiektow klasy Person
		for(Person p : people)
			System.out.println(p.getName() + ", " + p.getDescription());
	}
}
