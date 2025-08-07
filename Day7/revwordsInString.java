class Solution {
    public String reverseWords(String s) {
    //  by using String Builder class 
    //1.remmoving spaces
    String arr[]=s.trim().split("\\s+");
    StringBuilder result=new StringBuilder();
    for(int i=arr.length-1;i>=0;i--){
        result.append(arr[i]);
        if(i!=0){
            result.append(" ");
        }
    }
    return result.toString();

    }
}