class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        String arr[]=text.split(" ");
        int count=0;
        for(String word:arr){
            boolean hasBroken=false;
            for(char ch:brokenLetters.toCharArray()){
                if(word.indexOf(ch)!=-1){
                    hasBroken=true;
                }
            }
            if(!hasBroken){
                count++;
            }
        }
       return (count);
    }
}