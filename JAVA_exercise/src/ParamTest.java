/**
 * Program demostruje przekazanie parametrow w Javie
 * @author epiotno
 *
 */
public class ParamTest {
	public static void main(String[] args)
	{
		/*
		 * Test 1. Metody nie moga modyfikowac parmaetrow liczbowych
		 */
		System.out.println("Testowanie tripleValue: ");
		double percent = 10;
		System.out.println("Przed: percent = " + percent);
		tripleValue(percent);
		System.out.println("Po: percent = " + percent);
		
		/*
		 * Test 2. Metody moga zmieniac stan parametrow bedacych obiektami
		 */
		System.out.println("\nTestowanie tripleSlary: ");
		Employee_Test harry = new Employee_Test("Grzegorz", 5000);
		System.out.println("Przed: salary = " + harry.getSalary());
		tripleSalary(harry);
		System.out.println("Po: salary = " + harry.getSalary());
		
		/*
		 * Test 3. Metody nie moga dodawac nowych obiektow do parametrow obiektowych
		 */
		System.out.println("\nTestowanie swap: ");
		Employee_Test a = new Employee_Test("Alicja", 7000);
		Employee_Test b = new Employee_Test("Grzegorz", 60000);
		System.out.println("Przed: a = " + a.getName());
		System.out.println("Przed: b = " + b.getName());
		swap(a, b);
		System.out.println("Po: a = " + a.getName());
		System.out.println("Po: b = " + b.getName());
	}


	public static void tripleValue(double x)			//nie dziala
	{
		x = 3 * x;
		System.out.println("Koniec metody: x = " + x);
	}
	
	public static void tripleSalary(Employee_Test harry)			//nie dziala
	{
		harry.raiseSalary(200);
		System.out.println("Koniec metody: salary = " + harry.getSalary());
	}
	
	public static void swap(Employee_Test x, Employee_Test y)
	{
		Employee_Test temp = x;
		x = y;
		System.out.println("Koniec metody: x = " + x.getName());
		System.out.println("Koniec metody: y = " + y.getName());
	}
}

class Employee_Test		//uproszczona klasa Employee_Test
{
	private String name;
	private double salary;
	
	public Employee_Test(String n, double s)
	{
		name = n;
		salary = s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}