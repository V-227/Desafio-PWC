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
    
    for (int i = words.size() - 1 ; i >= 0; i--) {
      newString.append(words.get(i));
      newString.append(" ");
    }
    
    return newString.toString();
  }

  public static String remDuplicate(String str) {

    char character = str.charAt(0);
    StringBuilder newString = new StringBuilder();
    newString.append(character);
    

    for (int i = 1; i < str.length(); i++) {

      boolean isDuplicate = false;
      character = str.charAt(i);
      
      for (int j = 0; j < newString.length(); j++) {
        if (character == newString.charAt(j)) {
          isDuplicate = true;
          break;
        }
      }

      if (!isDuplicate) {
        newString.append(character);
      }
    }




    return newString.toString();
  }

  public static String palindrome (String str) {

    StringBuilder newString = new StringBuilder();

    for (int i = str.length() - 1; i >= 0; i--) {
      newString.append(str.charAt(i));
    }
    
      
  
  }
}