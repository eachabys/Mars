
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.*;



public class FindingList {     
    public static void main(String[] args) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        
            e.printStackTrace();
        }
    System.out.println("Hello! Welcome back!");

    List<String> s= new ArrayList<>();
    s.add("rock");
    s.add("weird rock");
    s.add("smooth rock");
    s.add("not rock");
    
    System.out.println("Everything is downloaded.");
    System.out.println(s) ;  
    System.out.println("Something wrong with the rock collection.");
    s.remove("not rock");
    System.out.println("Perfect!");
    System.out.println(s) ;  
    try {
        Thread.sleep(1000);
        } catch (InterruptedException e) {
    
        e.printStackTrace();
        }
    
    HashMap<String, String> fossils = new HashMap<String, String>();

        // Add keys and values (Fossil,description)
        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil");
    System.out.println("Fossil data downloaded");
    try {
        Thread.sleep(700);
        } catch (InterruptedException e) {
    
        e.printStackTrace();
        }
    HashSet<String> supplies= new HashSet<String>();
        supplies.add("Lexus");
        supplies.add("Avocado");
        supplies.add("Myself");
     
    System.out.println("Supplies downloaded: "+supplies);
    supplies.remove("Myself");
    System.out.println("Actually, supplies downloaded: "+supplies);
    }
}    