
public class Constants {
	public static void main (String[] args)
	{
		final double CM_PER_INCH = 2.54;		//final oznacza, ze mozna tylko jeden raz przypisac wartosc i nie bedzie mozna juz jej zmienic w programie
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("Rozmiar papieru w centymetrach: "
				+ paperWidth * CM_PER_INCH + " na " + paperHeight * CM_PER_INCH);
	}
}
