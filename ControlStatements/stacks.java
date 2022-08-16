
class Solution {
    public static void main(){
        
    }
    public boolean isValid(String s) {
    
         //Create a stack and add Character by Character
        Stack<Character> stack = new Stack<>();
        
        //Fix '(' and push into stack and when u encounter ')' pop out 
         for(int i = 0 ; i < s.length() ; i++)
         {
            
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
            {
                stack.push(s.charAt(i));	 
            }			 
            else if(stack.size() != 0)
            {
                if(stack.peek() == '(' && s.charAt(i) == ')' || stack.peek() == '{' && s.charAt(i) == '}' 
                  || stack.peek() == '[' && s.charAt(i) == ']')
                {
                    stack.pop();
                }
                else
                {
                    stack.push(s.charAt(i));
                }
            }
            else
            {
                stack.push(s.charAt(i));
            }
         }
         
         return stack.empty() ? true : false;       
    
    }
    }



    // Output:
    // Desired Output will be feched