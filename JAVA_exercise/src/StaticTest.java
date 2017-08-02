/**
 * Niniejszy program demonstruje uzycie metod statycznych.
 * 
 */
public class StaticTest
{
   public static void main(String[] args)
   {
      // Wstawienie do tablicy staff trzech obiektów reprezentujacych pracowników.
      Pracownicy[] staff = new Pracownicy[3];

      staff[0] = new Pracownicy("Tomasz", 40000);
      staff[1] = new Pracownicy("Dariusz", 60000);
      staff[2] = new Pracownicy("Grzegorz", 65000);

      // Drukowanie informacji o wszystkich obiektach klasy Pracownicy.
      for (Pracownicy e : staff)
      {
         e.setId();
         System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
               + e.getSalary());
      }

      int n = Pracownicy.getNextId();   // Wywolanie metody statycznej.
      System.out.println("Next available id=" + n);
   }
}

class Pracownicy
{
   private static int nextId = 1;

   private String name;
   private double salary;
   private int id;
   
   public Pracownicy(String n, double s)
   {
      name = n;
      salary = s;
      id = 0;
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

   public void setId()
   {
      id = nextId;                        // Ustawienie identyfikatora na kolejny dostepny numer.
      nextId++;
   }

   public static int getNextId()
   {
      return nextId;                      // Zwrocenie pola statycznego.
   }

   public static void main(String[] args) // test jednostkowy
   {
      Pracownicy e = new Pracownicy("Grzegorz", 50000);
      System.out.println(e.getName() + " " + e.getSalary());
   }
}