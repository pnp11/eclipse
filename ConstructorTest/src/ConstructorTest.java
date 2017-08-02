import java.util.*;

/**
 * Ten program demonstruje techniki konstrukcji obiektow
 * @author epiotno
 *
 */
public class ConstructorTest {
	public static void main(String[] args)
	{
		//Wstawienie do tablic staff obiektow klasy Employee
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Hubert", 40000);
		staff[1] = new Employee(60000);
		staff[2] = new Employee();
		
		//Wydruk informacji o wszystkich obiektach klasy Employee
		for(Employee e : staff)
			System.out.println("name = " + e.getName() + ", id = " + e.getId() + ", salary = " + e.getSalary());
	}
}


class Employee
{
	private static int nextId;
	
	private int id;
	private String name = "";	//Inicjacja zmiennej skladowej obiektu
	private double salary;
	
	//Statyczny blok inicjujacy
	static
	{
		Random generator = new Random();
		//Ustawienie zmiennej nextId na losowa liczbe calkowita z przedzialu 0-9999.
		nextId = generator.nextInt(10000);
	}
	
	//Blok inicjujacy obiektow
	{
		id = nextId;
		nextId++;
	}
	
	//Trzy konstruktory przeciazone
	public Employee(String n, double s)
	{
		name = n;
		salary = s;
	}
	
	public Employee(double s)
	{
		//Wywolanie konstruktora Employee(String, double)
		this("Employee #" + nextId, s);
	}
	
	//Konstruktor domyslny
	public Employee()
	{
		//Zmienna name zainicjowana wartoscia "" - patrz nizej
		//Zmienna salary nie jest jawnie ustawiona - inicjacja wartoscia 0
		//Zmienna id jest inicjowana w blocku inicjujacym
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public int getId()
	{
		return id;
	}
}