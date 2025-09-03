class Solution {
    // Binary Search implementation
    public static int BinarySearch(int nums[],int left,int right,int req){
        while(left<=right){
           int mid = left + (right - left) / 2;
            if(nums[mid]==req){
                return mid;
            }
            else if(req<nums[mid]){
             right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++){
            int req=target-numbers[i];
            int ans=BinarySearch(numbers,i+1,numbers.length-1,req);
            if(ans!=-1){
                return new int[] {i+1,ans+1};
            }
        }
        return new int[] {-1,-1};
    }
}