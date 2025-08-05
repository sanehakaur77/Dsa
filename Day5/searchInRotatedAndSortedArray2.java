class Solution {
    public static boolean BinarySearch(int nums[],int low,int high,int target){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return true;
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low+=1;
                high-=1;
                continue;
            }
            //  left half is sorted
            else if(nums[low]<=nums[mid]){
             if(nums[low]<=target && nums[mid]>=target){
               high=mid-1;
             }
             else{
                low=mid+1;
             }
            }
            else{
                if(nums[mid]<=target && nums[high]>=target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }

            }
        }
        return false;
    }
    public boolean search(int[] nums, int target) {
    boolean flag= BinarySearch( nums,0,nums.length-1,target);
    return flag;
    }
}
