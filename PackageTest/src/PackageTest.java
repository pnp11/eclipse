import com.horstmann.corejava.*;
//W powyzszym pakiecie znajduja sie definicje klasy Employee

import static java.lang.System.*;
/**
 * Ten program demonstruje uzycie pakietow
 * @author epiotno
 *
 */
public class PackageTest {
	public static void main(String[] ags)
	{
		//Dzieki instrukcji import nie ma koniecznosci stosowania pelnej nazwy
		//com.hostmann.corejava.Employee
		Employee harry = new Employee("Huber Kowalski", 50000, 1989, 10, 1);
		
		harry.raiseSalary(5);
		
		//Dzieki instrukcji import static nie ma koniecznosci pisac System.out.
		out.println("name = " + harry.getName() + ", salary = " + harry.getSalary());
	}
}
