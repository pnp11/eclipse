package inheritance;


/**
 * Ten program demonstruje dziedziczenie
 * @author epiotno
 *
 */
public class ManagerTest {
	public static void main(String[] args)
	{
		//Tworzenie obiektu klasy Manager
		Manager boss = new Manager ("Karol Parol", 80000, 1987, 12, 15);
		boss.setBonus(5000);
	
		Employee[] staff = new Employee[3];
	
		//Wstawianie obiektow klas Manager i Employee do tablicy satff
		staff[0] = boss;
		staff[1] = new Employee("Henryk Kwaitek", 50000, 1989, 10, 1);
		staff[2] = new Employee("Artur Kwaitkowski", 40000, 1990, 3, 15);
	
		//Wyswietlenie informacji o wszystkich obiektach klasy Employee
		for(Employee e : staff)
			System.out.println("name = " + e.getName() + ", salry = " + e.getSalary());
	}
}
