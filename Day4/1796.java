class one{
    public static void main(String args[]){
        class Solution {
    
    //     ArrayList<Integer> list =new ArrayList<>();
       
    //    for(int i=0;i<s.length();i++){
    //     if(Character.isDigit(s.charAt(i))){
    //       list.add(s.charAt(i)-'0');
    //     }
    //    } 
    //     if(!list.isEmpty()){
    //         int largest=list.get(0);
    //     int slargest=-1;
    //    for(int a:list){
    //       if(a>largest){
    //         slargest=largest;
    //         largest=a;

    //       }
    //       else if(a<largest && a>slargest){
    //          slargest=a;
    //       }
    //    }
    //    return slargest;
    //     }
    //     return -1;
    int largest=-1;
    int slargest=-1;
    for(int i=0;i<s.length();i++){
        if(!Character.isDigit(s.charAt(i))){
            continue;
        }
        if(s.charAt(i)-'0' >largest){
         slargest=largest;
         largest=s.charAt(i)-'0';
        }
        else if(s.charAt(i)-'0'<largest && slargest<s.charAt(i)-'0'){
         slargest=s.charAt(i)-'0';
        }
    }
    return slargest ;
    }
}
    }
