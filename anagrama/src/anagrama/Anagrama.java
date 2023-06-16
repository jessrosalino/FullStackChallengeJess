package anagrama;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author macbook
 */
public class Anagrama {

   public static void main(String[] args) {
    
    //test case 
    String word1 = "Tom Marvolo Riddle";
    String word2 = "I am Lord Voldemort";
        int count; 
    boolean response =  anagrama(word1,word2);
    System.out.println("The response is: "+ response);    
    
    }
    public static boolean anagrama(String s1, String s2) {
        
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();
        
        char[] array1 = null;
        char[] array2 = null;
        array1 = s1.toCharArray();
        array2 = s2.toCharArray();
        
        Arrays.sort(array1);
        Arrays.sort(array2);
       
        return new String(array1).equals(new String(array2));

        
    }
    
}
