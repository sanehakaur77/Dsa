class Solution {
    public boolean isValid(String s) {
      Stack<Character> stack=new Stack();
      for(int i=0;i<s.length();i++){
        // if i got opening bracket then push into the stack
        if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){
            stack.push(s.charAt(i));
        }
        // if there is no opening bracket then stack will be empty then we simply return false
        else{
          if(stack.isEmpty()){
            return false;
          }
          
            char ch=stack.pop();
if(s.charAt(i)=='}' && ch!='{' ||s.charAt(i)==')' && ch!='('||s.charAt(i)==']' && ch!='[' ){
return false;
            

        }
        
      }  
     
    }
     return stack.isEmpty();
}
}
