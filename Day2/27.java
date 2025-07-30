class Solution {
    public int removeDuplicates(int[] nums) {
        //  using Linked HashSet for maintaing order
// Set<Integer> set = new LinkedHashSet<>();
//         for(int a:nums)
//         {
//             set.add(a);
//         }
//         int index=0;
//         for(int b:set){
//             nums[index++]=b;
//         }
//         return set.size();
// ------2nd appraoch
int index=1;
if(nums.length==0){
    return 0;
}
for(int i=1;i<nums.length;i++){
    if(nums[i]!=nums[i-1]){
     nums[index++]=nums[i];
    }
}
return index;
    }
}
