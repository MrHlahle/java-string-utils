import java.util.Arrays; // This must be at the VERY TOP of the file

public class Main {
    /**
     * Reverses the characters in a string
     * @param s The input string to reverse
     * @return The reversed string, or null if input is null
     */
    public static String reverse(String s) {
        if (s == null) return null;
        String clean = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return new StringBuilder(clean).reverse().toString();
    }

    /**
     * Checks if a string is a palindrome
     * @param s The input string to check
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        String clean = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return clean.equals(reverse(clean));
    }

    /**
     * Checks if two strings are anagrams
     * @param a First string
     * @param b Second string
     * @return true if anagrams, false otherwise
     */
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

    public static void main(String[] args) {
        // String reversal tests
        System.out.println("Reversal Tests:");
        System.out.println(reverse("Hello World")); // dlrow olleh
        System.out.println(reverse("RaceCar!")); // racecar
        System.out.println(reverse("")); // (empty)
        System.out.println(reverse("a")); // a
        System.out.println(reverse("racecar")); // racecar
        System.out.println(reverse("12345")); // (empty)
        System.out.println(reverse(null)); // null

        // Palindrome tests
        System.out.println("\nPalindrome Tests:");
        System.out.println(isPalindrome("RaceCar!")); // true
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("hello")); // false
        System.out.println(isPalindrome(null)); // false
        System.out.println(isPalindrome("12321")); // true
        System.out.println(isPalindrome("Race123Car")); // false
        System.out.println(isPalindrome("Was it a car or a cat I saw?")); // true

        // Anagram tests
        System.out.println("\nAnagram Tests:");
        System.out.println(areAnagrams("listen", "silent")); // true
        System.out.println(areAnagrams("hello", "world")); // false
        System.out.println(areAnagrams("Debit card", "Bad credit")); // true
    }
}
