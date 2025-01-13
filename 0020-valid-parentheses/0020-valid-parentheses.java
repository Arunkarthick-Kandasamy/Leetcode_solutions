import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // Using a stack to store the opening brackets
        Stack<Character> stack = new Stack<>();
        
        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // If the current character is an opening bracket, push it onto the stack
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                stack.push(currentChar);
            } 
            // If the current character is a closing bracket
            else if (currentChar == ')' || currentChar == ']' || currentChar == '}') {
                // If the stack is empty or the top of the stack does not match the closing bracket
                if (stack.isEmpty()) {
                    return false; // Unmatched closing bracket
                }
                
                char top = stack.pop();
                // Check if the popped character matches the current closing bracket
                if (currentChar == ')' && top != '(' ||
                    currentChar == ']' && top != '[' ||
                    currentChar == '}' && top != '{') {
                    return false; // Mismatched pair
                }
            }
        }
        
        // If the stack is empty, all brackets were matched; otherwise, it's invalid
        return stack.isEmpty();
    }
}