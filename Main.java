class Main {
  public static void main(String[] args) {
    
    String input1 = "Hello, World! OpenAI is amazing.";
    String input2 = "Hello, World!";
    String input3 = "babad";
    String input4 = "hello. how are you? i'm fine, thank you.";
    String input5 = "racecar";
    System.out.println(Test.shuffle(input1));
    System.out.println(Test.remDuplicate(input2));
    System.out.println(Test.palindrome(input3));
    System.out.println(Test.capitalize(input4));
    System.out.println(Test.anagram(input5));

    
  }
}