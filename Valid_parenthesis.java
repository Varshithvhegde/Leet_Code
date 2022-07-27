/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
*/
class Solution {
    public boolean isValid(String s) {
        int r=0,b=0,st=0;
        boolean ret=false;
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char chr=s.charAt(i);
            if(chr=='(')
                stack.push(chr);
            else if(chr==')')
                if(stack.empty()==false && stack.peek()=='(')
                    stack.pop();
                else
                     stack.push(chr);
                    
            else if(chr=='[')
                stack.push(chr);
            else if(chr==']'){
                
                if(stack.empty()==false && stack.peek()=='[')
                    stack.pop();
                else
                     stack.push(chr);
            }
            else if(chr=='{')
               stack.push(chr);
            else if(chr=='}')
                if(stack.empty()==false && stack.peek()=='{')
                    stack.pop();
                else
                     stack.push(chr);
        }
        if(stack.empty()==true){
            ret=true;
        }
        else {
            ret=false;
        }
        return ret;
    }
}
