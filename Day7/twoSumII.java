class Solution {
    public static int BinarySearch(int arr[],int left,int right,int target){
     while(left<=right){
        int mid=left+(right-left)/2;
        if(arr[mid]==target){
           
            return mid;
        }
        else if(arr[mid]<target){
            left=mid+1;
        }
        else{
            right=mid-1;
        }
     }
     return -1;
    }
    public int[] twoSum(int[] numbers, int target) {
       for(int i=0;i<numbers.length;i++){
        int req=target-numbers[i];
         int res=BinarySearch(numbers,i+1,numbers.length-1,req);
        if(res!=-1){
           
            if(res!=-1){
                numbers[res]=-1;
            }
         return new int[] {i+1,res+1};
        }
       } 
       return new int[] {-1,-1};
    }
}
