import java.util.*;

/**
 * @author epiotno
 *
 */
public class CollectionsTask {
    private static Map<List<Character>, Integer> ALPHABET_SCORE = new HashMap<>();
    static{
        List<Character> letters;
        letters = Arrays.asList(new Character[]{'a', 'f', 'i', 'm', 'n', 's', 'u', 'x' });
        Collections.shuffle(letters);
        ALPHABET_SCORE.put(letters, 22);
        letters = Arrays.asList(new Character[]{'b', 'c', 'k', 'l', 'q', 't', 'v' });
        Collections.shuffle(letters);
        ALPHABET_SCORE.put(letters, 11);
        letters = Arrays.asList(new Character[]{'d', 'g', 'h', 'o', 'r', 'w' });
        Collections.shuffle(letters);
        ALPHABET_SCORE.put(letters, 8);
        letters = Arrays.asList(new Character[]{'e', 'j', 'p', 'z', 'y'});
        Collections.shuffle(letters);
        ALPHABET_SCORE.put(letters, 4);        
    }
    
    /**
     * Zadanie:
     * Podana ni\u017cej funkcja przyjmuj\u0119 SLOWO oraz map\u0119 KOSZT_LITERY
     * Trzeba obliczy\u0107 koszt ca\u0142ego s\u0142owa
     * @param word 
     * @param alphabet 
     * @return 
     */

public static int getWordScore(String word, Map<List<Character>, Integer> alphabet){ 
    String word2 = (word.replace(" ", "")).toLowerCase();    //zamiana na male litery
    System.out.println(word2);
    Integer dlugosc2 = word2.length();                        //obliczenie dlugosci stringa dla word2
//    System.out.println(dlugosc2);    
    System.out.println("==========================="); 
    
    
    System.out.println("===========================");
    int score = 0;   
  
    for(int i = 0; i < dlugosc2; i++)
    {
        //System.out.println(word2.charAt(i));
        for(Map.Entry<List<Character>, Integer> key : ALPHABET_SCORE.entrySet())
        {
            //System.out.println(key);
            if(key.getKey().contains(word2.charAt(i)))
            {
                score = score + key.getValue();
                System.out.println(key.getKey() + " = " + key.getValue());
                System.out.println("Suma = " + score); 
                System.out.println("--------------------"); 
            } 
        }
    }
    return score;
}


/**
 * @param args
 */
public static void main (String[] args){
    System.out.println(ALPHABET_SCORE);
    String word = "JCAT jest fajnym frameworkiem";
    System.out.println(word);

    System.out.println(getWordScore(word, ALPHABET_SCORE));   
    } 
}
