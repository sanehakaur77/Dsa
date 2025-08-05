/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// Online Java Compiler
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static int BinarySearch(int arr[],int low,int high,int target){
    while(low<=high){
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(target>arr[mid]){
           BinarySearch( arr, mid+1, high, target);
        }
        else{
            BinarySearch( arr,low,mid-1, target);
        }
    }
    return -1;
}
    public static void main(String[] args) {
       int arr[]={1,2,41,21,1};
       int target=2;
      int res= BinarySearch( arr, 0, arr.length-1, target);
      System.out.println(res);
    }
}
