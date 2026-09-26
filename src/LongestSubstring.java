import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public Substring longestUniqueSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return new Substring("", 0);
        }

        Set<Character> seen = new HashSet<>();
        int left = 0;
        int bestStart = 0;
        int bestLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            while (seen.contains(current)) {
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(current);
            int length = right - left + 1;

            if (length > bestLength) {
                bestStart = left;
                bestLength = length;
            }
        }

        return new Substring(
                s.substring(bestStart, bestStart + bestLength),
                bestLength
        );
    }
}