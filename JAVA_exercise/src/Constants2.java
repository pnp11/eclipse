
public class Constants2 {
	public static final double CM_PER_INCH = 2.54;
	
	public static void main(String[] args)
	{
		double paperWidht = 8.5;
		double paperHeight = 11;
		System.out.println("Rozmiar papieru w centymetrach: " 
				+ paperWidht * CM_PER_INCH + " na " + paperHeight * CM_PER_INCH);
	}
}
