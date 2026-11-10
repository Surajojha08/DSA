class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int Maxlen = 0;
        int len = 0;
        int length = nums.length;

        if(length == 0){
            return 0;
        }

        for(int i = 0;i<length;i++){
            if(nums[i] == 1){
                len ++;
            }

            if(nums[i] == 0){
                len =0;
                
            }
            Maxlen = Math.max(len,Maxlen);
            
        }
        return Maxlen;
        
    }
}