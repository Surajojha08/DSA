
import java.util.*;

class Solution {

    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Store all elements
        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 0;

        // Traverse the set
        for (int num : set) {

            // Start only from the beginning of a sequence
            if (!set.contains(num - 1)) {

                int length = 1;
                int current = num;

                // Find consecutive elements
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                maxLen = Math.max(maxLen, length);
            }
        }

        return maxLen;
    }
}
