package arrayList;

import java.util.*;

/**
 * Demonstracja uzycia klasy ArrayList
 * @author epiotno
 *
 */
public class ArrayListTest 
{
	public static void main(String[] args)
	{
		//Wstawienie do listy staff trzech obiektow klasy Employee
		ArrayList<Employee> staff = new ArrayList<>();
		staff.add(new Employee("Karol Krakowski", 75000, 1987, 12, 15));
		staff.add(new Employee("Henryk Kwaitek", 50000, 1989, 10, 1));
		staff.add(new Employee("Waldemar Kowalski", 40000, 1990, 3, 15));
		
		//Zwiekszeie pensji wszystkich pracownikow o 5%
		for (Employee e : staff)
			e.raiseSalary(5);
		
		//Drukowanie informacji o wszystkich obiektach Employee
		for (Employee e : staff)
			System.out.println("name= " + e.getName() + ", salary= " + e.getSalary() + ", hireDay= " + e.getHireDay());
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