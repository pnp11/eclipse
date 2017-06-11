
/**
 * Program ten wyswietla wiadomosc powitalna od autorow
 * @author epiotno
 *
 */
public class Welcome {
	public static void main(String[] args){
		String[] greeting = new String[3];
		greeting[0] = "Witaj czytelniku!";
		greeting[1] = "Pozdrowienia od Caya";
		greeting[2] = "i Gregora";
		
		for(String g : greeting)
			System.out.println(g);
	}
}
