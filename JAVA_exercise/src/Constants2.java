
public class Constants2 {
	/**
	 * Definicja stalej klasowej na zewnatrzmetody main. W zwiazku z tym stala ta moze byc uzytwana 
	 * takze przez inne metody tej klasy. Ponadto stala jest zadeklarowana jako publiczna,
	 * dostep do niej maja takze metody innej klasy - jak w naszym przykladzie Constants2.CM_PER_INCH.
	 */
	public static final double CM_PER_INCH = 2.54; 
	
	public static void main(String[] args)
	{
		double paperWidht = 8.5;
		double paperHeight = 11;
		System.out.println("Rozmiar papieru w centymetrach: " 
				+ paperWidht * CM_PER_INCH + " na " + paperHeight * CM_PER_INCH);
	}
}
