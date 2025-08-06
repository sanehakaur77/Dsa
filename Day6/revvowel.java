import java.util.*;
class revvowel{
    public static void main(String args[]){
        String name="IceCreAm";
        char arr[]=name.toCharArray();
       int left=0;
        int right=arr.length-1;
        while(left<=right){
         if("aioueAIOUE".indexOf(name.charAt(left))!=-1 && "aioueAIOUE".indexOf(name.charAt(right))!=-1){
          char temp=arr[left];
          arr[left]=arr[right];
          arr[right]=temp;
    
         }
           left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));

    }
}