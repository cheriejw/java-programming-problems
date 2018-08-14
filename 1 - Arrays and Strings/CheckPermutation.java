public class CheckPermutation {
    public static void main(String[] args) {
        String[] testStrings = new String[]{"god", "dog", "god ", "dog", "goOd", "oogd"};

        for(int i = 0; i < testStrings.length; i+=2) {
            System.out.printf("'%s' and '%s' : %s\n", testStrings[i], testStrings[i+1], isPermutation(testStrings[i], testStrings[i+1]));
        }
    }

    private static boolean isPermutation(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        
        //you can sort and step through.
        return true;
    }
}