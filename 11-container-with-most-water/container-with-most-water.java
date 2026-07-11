class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length-1;

        int Maxarea = 0;

        while (left < right){
            int width = right - left;

            int h = Math.min(height[right],height[left]);

            int Area = h * width;
            Maxarea = Math.max(Maxarea,Area);

            if(height[right] > height[left]){
            left ++;
            } else {
                right -- ;
            }
        

        }
        return Maxarea;
        
        
        
    }
}