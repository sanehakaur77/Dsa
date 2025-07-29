class DayOne{
    public static void main(String args[]){
        //  Longest substring without repeat charcaters
        String s="achgjhgj";
    HashSet<Character> set=new HashSet<>();
        int left=0;
        int maxLen=0;
        for(int right=0;right<s.length();right++){
            
          
        while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
              set.add(s.charAt(right));
            maxLen=Math.max(right-left+1,maxLen);



        }
      System.out.println(maxLen);
    }
}