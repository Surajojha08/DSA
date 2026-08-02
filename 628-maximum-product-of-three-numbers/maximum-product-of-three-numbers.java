class Solution {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;
        int max =Integer.MIN_VALUE;
        for(int i = 0; i < n;i++){
            int j=i+1,k=n-1;
            while(j<k)
            {
                int product = nums[i]*nums[j]*nums[k];
                max = Math.max(product,max);
                j++;
                k--;
            }
        }
        return max;

        
        
    }
}