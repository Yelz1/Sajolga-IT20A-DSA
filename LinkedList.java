 package activity;
 
import java.util.LinkedList;
public class Activity {
    
 
    public static void main(String[] args) {
       
        
        LinkedList<String> letter = new LinkedList<>();
        
        letter.add("A");
        letter.add("B");
        letter.add("C");
        letter.add("D");

         System.out.println("Linked List Letter: " + letter);
        System.out.println(letter.size());

        boolean containslion = letter.contains("A");
        System.out.println(containslion);

    }
    
}
 
    

