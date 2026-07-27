class Solution {
    public int maxProduct(int[] nums) {

        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        return (nums[right]-1)*(nums[right-1]-1);
        
    }
}