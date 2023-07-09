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

    StringBuilder strResult = new StringBuilder();
    
    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j <= str.length(); j++) {
        String substring = str.substring(i, j);
        if (isPalindrome(substring) && substring.length() > strResult.length()) {
          strResult = new StringBuilder(substring);
            }
        }
    }
    
    if (strResult.length() > 0) {
        return strResult.toString();
    } else {
        return "its not palindrome";
    }
}

private static boolean isPalindrome(String str) {
    StringBuilder reversed = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i--) {
      reversed.append(str.charAt(i));
    }
    return str.equals(reversed.toString());
}
 }