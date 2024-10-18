package activity;

import java.util.LinkedList;
import java.util.Queue;

public class labativity {

   
    public static void main(String[] args) {
   
        Queue<String> queue = new LinkedList<>();
        
        queue.add("A");
        queue.add("B"); 
        queue.add("C");
        
         String firstElement = queue.poll(); 
        String secondElement = queue.poll(); 
        
         System.out.println("Remaining elements in the queue: " + queue);
       
    }
}