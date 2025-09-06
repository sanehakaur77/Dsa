class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int count1=0;
      int maxCount=Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            count1++;
            maxCount=Math.max(count1,maxCount);
        }
        else{
            count1=0;
        }
      }   
      return (maxCount==Integer.MIN_VALUE) ? 0 :maxCount; 
      //  sliding window approach to find max consecutive ones
       //int maxLen=Integer.MIN_VALUE;
    // int left=0,right=0;
    // while(right<nums.length){
    //     if(nums[right]==0){
    //         left=right+1;
    //     }
    //     maxLen=Math.max(right-left+1,maxLen);
    //     right++;
    // }
    // return maxLen==Integer.MIN_VALUE ? 0 :maxLen;
    }
}