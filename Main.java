public class Main {  // Class names should be capitalized by convention
    /**
     * Reverses the characters in a string
     * @param s The input string to reverse
     * @return The reversed string, or null if input is null
     */
  public static String reverse (String s) {
      if (s == null) return null;
      String clean = s.toLowerCase().replaceAll("[^a-z0-9]","");
      return new StringBuilder(clean).reverse().toString();
    }
    public static boolean isPalindrome (String s) {
        if ( s == null ) return false;
        String clean = s.toLowerCase().replaceAll("[^a-z0-9]","");
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }
    
    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println(reverse(input));
        System.out.println(reverse("RaceCar!"));
        System.out.println(reverse(""));       // Empty string
        System.out.println(reverse("a"));      // Single character
        System.out.println(reverse("racecar")); // Palindrome
        System.out.println(reverse("12345"));   // Numbers
        System.out.println(reverse(null));     // Null case
        // Add new palindrome tests:
    System.out.println(isPalindrome("RaceCar!"));        // true
    System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
    System.out.println(isPalindrome("hello"));           // false
    System.out.println(isPalindrome(null));              // false
    System.out.println(isPalindrome("12321"));         // true (with number support)
   System.out.println(isPalindrome("Race123Car"));   // false
   System.out.println(isPalindrome("Was it a car or a cat I saw?")); // true
    }
}