package abstractClasses;

public class Student extends Person{
	private String major;
	/**
	 * @param n imie i nazwisko studenta
	 * @param m specjalizacja studenta
	 */
	public Student(String n, String m)
	{
		//Przekazanie n do konstruktora nadklasy
		super(n);
		major = m;
	}
	
	public String getDescription()
	{
		return "student specjalizacji " + major;
	}
}
