import java.util.ArrayList;
import java.util.List;

public class Test {
  
  public static String shuffle(String str) {

   String temporary = "";
   List<String> words = new ArrayList<>();
    
    for (int i = 0; i < str.length(); i++) {
      
      char character = str.charAt(i);
      temporary = temporary + character;
      
      if (character == ' ') { 
        words.add(temporary);
        temporary = "";
      }
      
    }

      if (!temporary.isEmpty()) {
        words.add(temporary);
      }
    
    StringBuilder newString = new StringBuilder();
    System.out.println(words);
    
    for (int i = words.size() - 1 ; i >= 0; i--) {
      newString.append(words.get(i));
      newString.append(" ");
    }
    
    return newString.toString();
  }

  public static String remDupicate(String str) {
    
  }
}