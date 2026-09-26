import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public Substring longestUniqueSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return new Substring("", 0);
        }

        int max = 0;
        String maxSubstring = "";
        for (int i = 0; i < s.length(); i++) {
            int length = 0;
            String sub = "";
            Set<Character> seen = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (!seen.contains(s.charAt(j))) {
                    seen.add(s.charAt(j));
                    sub += s.charAt(j);
                    length++;
                } else {
                    break;
                }
            }
            if (length > max) {
                max = length;
                maxSubstring = sub;
            }
        }

        return new Substring(maxSubstring, max);
    }
}
