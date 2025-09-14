class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack=new Stack<>();
       for(int i=0;i<s.length();i++){
        //  if it is opening bracket push into stack
        if(s.charAt(i)=='{' || s.charAt(i)=='[' ||s.charAt(i)=='('){
            stack.push(s.charAt(i));
        }
        else{
            if(stack.isEmpty()){
                return false;
            }
            //  then pop an element from stack and check it with the current closing racket if it matches or not
            char ch=stack.pop();
            if(s.charAt(i)=='}' && ch!='{' || s.charAt(i)==')' && ch!='(' || s.charAt(i)==']' && ch!='['){
                return false;
            }
        }
       } 
       return stack.isEmpty();
    }
}