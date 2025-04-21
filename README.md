# Java String Utilities

Basic Java string operations including reversal, palindrome checking, and anagram detection.

## How to Use
1. Compile: `javac Main.java`
2. Run: `java Main`

## Features
- **Reverse strings**  
  `reverse("hello")` → `"olleh"`
- **Check palindromes**  
  `isPalindrome("racecar")` → `true`
- **Check anagrams**  
  `areAnagrams("listen", "silent")` → `true`

## Example Output
```java
// Reverse a string
System.out.println(reverse("Helloworld")); // "dlrowolleH"

// Check palindrome 
System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true

// Check anagrams
System.out.println(areAnagrams("Debit card", "Bad credit")); // true

Full code example
public class Main {
    public static void main(String[] args) {
        // Reverse demonstration
        System.out.println(reverse("Helloworld")); // "dlrowolleH"
        
        // Palindrome check
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        
        // Anagram check
        System.out.println(areAnagrams("listen", "silent")); // true
    }
    
    public static String reverse(String s) {
        if (s == null) return null;
        String clean = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return new StringBuilder(clean).reverse().toString();
    }
    
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        String clean = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return clean.equals(reverse(clean));
    }
    
    public static boolean areAnagrams(String a, String b) {
        if (a == null || b == null) return false;
        a = a.replaceAll("[^a-zA-Z]", "").toLowerCase();
        b = b.replaceAll("[^a-zA-Z]", "").toLowerCase();
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        Arrays.sort(aChars);
        Arrays.sort(bChars);
        return Arrays.equals(aChars, bChars);
    }
}


Created by [Obakeng Hlahle]
