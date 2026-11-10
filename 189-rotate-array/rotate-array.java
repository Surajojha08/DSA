class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        Queue<Integer> q = new LinkedList<>();

        // Store last k elements
        for (int i = n - k; i < n; i++) {
            q.add(nums[i]);
        }

        // Shift remaining elements to right
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        // Insert queue elements at beginning
        for (int i = 0; i < k; i++) {
            nums[i] = q.poll();
        }
    }
}