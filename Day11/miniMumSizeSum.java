class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0,right=0;
        int sum=0,minLen=Integer.MAX_VALUE;
        while(right<nums.length){
            sum+=nums[right];
            while(sum>=target){
                sum-=nums[left];
                minLen=Math.min(minLen,right-left+1);
                left++;
            }
            right++;
            

        }
        return minLen==Integer.MAX_VALUE  ? 0 :minLen;
          
    }
}