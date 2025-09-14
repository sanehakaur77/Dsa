import java.util.*;

class Saneha{
    public static void main(String[] args) {
        String s="lEetcOde";
        int ptr=0;
     List<Character> list=new ArrayList<>();

        
        for(char c:s.toCharArray()){
          if(c=='a'||c=='e'|c=='i'|c=='o'|c=='u' || c=='A'||c=='E'|c=='I'|c=='O'|c=='U'  ){
         list.add(c);
        }
       
    }
    Collections.sort(list);
    System.out.println(list);
//  String res=new String(arr);
//  System.out.println(res);
// String res1="";
// for(int i=0;i<s.length();i++){
//     if(s.charAt(i)=='a'||s.charAt(i)=='e'|s.charAt(i)=='i'|s.charAt(i)=='o'|s.charAt(i)=='u' || s.charAt(i)=='A'||s.charAt(i)=='E'|s.charAt(i)=='I'|s.charAt(i)=='O'|s.charAt(i)=='U'  )

// {
//     res1+=arr[i];
// }
// else{
//     res1+=s.charAt(i);
// }
// }
// System.out.println(res1);
    
}
}