class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1)
{
    return nums[0];
}        int left=0;
        double maxSum=Double.NEGATIVE_INFINITY;
        double sum=0;
        for(int right=0;right<nums.length;right++){
           sum += nums[right];

            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                sum -= nums[left];
                left++;
            }
        }
        return (double)(maxSum/k);
    }
}
