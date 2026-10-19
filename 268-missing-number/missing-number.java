class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<=n;i++){
            map.put(i,1);
        }

        for(int num : nums){
            map.remove(num);
        }

        for(int result : map.keySet()){
            return result;
        }
        return 0;
        

        
        
        
    }
}