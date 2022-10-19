import java.util.Hashtable;

public class LongestSubstringNonRepeating {

    public static void main(String[] args) {
        String s = "abcabcdbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    private static  int lengthOfLongestSubstring(String s) {
        Hashtable<Character, Integer> chars = new Hashtable<>();

        int startIndex = 0;
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (chars.containsKey(c)) {
                startIndex = Math.max(startIndex, chars.get(c) + 1);
            }
            chars.put(c, i);
            maxLength = Math.max(maxLength, i - startIndex + 1);
        }

        return maxLength;
    }
}
