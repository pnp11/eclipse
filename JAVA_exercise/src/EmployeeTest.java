import java.util.*;

/**
 * Ten program demonstruje dzialanie klasy Employee
 * @author epiotno
 *
 */
public class EmployeeTest {
	public static void main(String[] args)
	{
		//Wstawienie trzech obiektow pracownikow do tablicy staff
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Jaroslaw Rybiski", 7500, 1987, 12, 15);
		staff[1] = new Employee("Katarzyna Remiszewszka", 5000, 1989, 10, 1);
		staff[2] = new Employee("Krystyna Kuczynska", 4000, 1990, 3, 15);
		
		//Zwiekszenie pensji wszystkich pracownikow o 5%
		for(Employee e : staff)
			e.raiseSalary(5);
		
		//Drukowanie informacji o wszystkih obiektach klasy Employee
		for(Employee e : staff)
			System.out.println("name=" + e.getName() + ", salary=" + e.getSalary()
			+", hireDay=" + e.getHireDay());
	}
}


class Employee
{
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String n, double s, int year, int month, int day)
	{
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
		//W klasie GregorianCalendar styczen ma numer 0
		hireDay = calendar.getTime();
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public Date getHireDay()
	{
		return hireDay;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}