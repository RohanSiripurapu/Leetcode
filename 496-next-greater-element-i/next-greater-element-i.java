import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            Stack<Integer> stack = new Stack<>();
            boolean found = false;

            for (int j = 0; j < nums2.length; j++) {

                if (nums2[j] == nums1[i]) {
                    stack.push(nums2[j]);

                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > stack.peek()) {
                            result[i] = nums2[k];
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        result[i] = -1;
                    }

                    break;
                }
            }
        }

        return result;
    }
}