class Solution {
    public boolean isMonotonic(int[] nums) {
        // MonoTonic Array
        boolean Increasing=true;
        boolean Decreasing=true;
        for(int i=1;i<nums.length;i++){
           if(nums[i-1]>nums[i]){
            Decreasing=false;
           }
           if(nums[i-1]<nums[i]){
            Increasing=false;
           }
        }
        return Decreasing || Increasing;

    }
}
