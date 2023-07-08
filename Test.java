import java.util.ArrayList;
import java.util.List;

public class Test {
  
  public static String shuffle(String str) {

   String temporary = "";
   List<String> words = new ArrayList<>();
    
    for (int i = 0; i < str.length(); i++) {
      char character = str.charAt(i);
      
      if (character != ' ') {
        
        temporary = temporary + character;
        
      } else {
        int j = 0; j++;
        words.add(temporary);
        temporary = "";
        
      }
    }
     String newString = "";
    for (int i = words.size() - 1; i >= 0; i--) {
      
    }
    return null;
  }
}