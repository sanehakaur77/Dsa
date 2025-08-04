class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1=0;
        int ptr2=0;
        int index=0;
        int temp[]=new int[m+n];
        while(ptr1<m && ptr2<n){
            if(nums1[ptr1]<nums2[ptr2]){
            temp[index++]=nums1[ptr1++];
            }
            else{
                temp[index++]=nums2[ptr2++];
            }
        }
        while(ptr1<m){
         temp[index++]=nums1[ptr1++];
        }
        while(ptr2<n){
         temp[index++]=nums2[ptr2++];
        }
        int indx=0;
        for(int a:temp){
         nums1[indx++]=a;
        }
    }
}
