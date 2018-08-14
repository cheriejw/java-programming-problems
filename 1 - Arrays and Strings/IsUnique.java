import java.util.*;

public class IsUnique {
    public static void main(String[] args) {
        String[] input = new String[]{"qwertyuiop", "qwertyuiopq"};

        System.out.println("O(n) space, O(n) time");
        for(String str : input) {
            System.out.printf("%s: %s\n", str, isUniqueChars(str));
        }

        System.out.println("\nO(1) space, O(nlogn) time");
        for(String str : input) {
            System.out.printf("%s: %s\n", str, isUniqueCharsSpace(str));
        }
    }

    // o(n) space, o(n) time.
    // just a boolean array would be better to save space & time... can use Character.getNumbericValue()
    private static boolean isUniqueChars(String str) {
        Set<Character> dictionary = new HashSet<>();
        
        for(char c : str.toCharArray()) {
            if(dictionary.contains(c)) {
                return false;
            }
            dictionary.add(c);
        }

        return true;
    }

    // o(1) space, o(nlogn) time.
    private static boolean isUniqueCharsSpace(String str) {
        //Some sorting on the String directly...

        for(int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                return false;
            }
        }

        return true;
    }
}