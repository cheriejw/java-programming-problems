// a\b = empty string
// as\b
// abcd\be = abce

public class BackspaceEquals {
    public boolean isEqualStack(String s1, String s2) {
        return parsed(s1).equals(parsed(s2));
    }
    
    public String parsed(String str) {
        StringBuilder sb = new StringBuilder();
        Deque<Character> stack = new Deque<>();
    
        // a\b abcd\be = 6
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '\b') {
                stack.removeFirst();
                continue;
            }
            stack.addFirst(str.charAt(i));
        }
        
        for(char c : stack) {
            sb.append(c);
        }
    
        return sb.toString();
    }
    
    //backspace
    public boolean isEqual(String s1, String s2) {
        int p1 = 0, p2 = 0;
    
            // 1 3      1 2
        while(p1 < s1.length() && p2 < s2.length()) {
            // a\ba ac
            if(p1 == s1.length-1) {
                if(s2.length-1 == p2) {
                    return true;
                }
                return false;
            }
            if(p2 == s2.length-1) {
                if(s1.length-1 == p1) {
                    return true;
                }
                return false;
            }
            if(s1.charAt(p1) == s2.charAt(p2)) {
                p1++;
                p2++;
                continue;
            }
            if(s1.charAt(p1) == '\b') {
                p2--;
                p1++;
                continue;
            }
            if(s2.charAt(p2) == '\b') {
                p1--;
                p2++;
                continue;
            }
        }
        return false;
    }
    
}