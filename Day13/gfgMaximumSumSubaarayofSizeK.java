class Solution {
    public int maxSubarraySum(int[] arr, int k) {
   
   int left=0,right=0;
   int sum=0,maxSum=Integer.MIN_VALUE;
   while(right<arr.length){
       sum+=arr[right];
       while(right-left+1>k){
           sum-=arr[left];
           left++;
       }
       if(right-left+1==k){
           maxSum=Math.max(sum,maxSum);
       }
       right++;
   }
   return maxSum;
        
    }
}