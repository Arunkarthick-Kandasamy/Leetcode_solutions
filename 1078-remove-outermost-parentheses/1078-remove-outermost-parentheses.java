class Solution 
{
    public String removeOuterParentheses(String s) 
    {
        String result = "";
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(stack.isEmpty() && ch == '(')
            {
                stack.push('(');
                continue;
            }
            else if(ch ==')')
            {
                stack.pop();
                if(stack.isEmpty())
                {
                    continue;
                }
            }
            if(ch == '(')
            {
                stack.push(ch);
            } 
            result = result + ch;
        }
        return result;
    }
}
class Stack1
{
    int top;
    int n;
    char[] arr;
    Stack1(int n)
    {
        this.n = n;
        this.arr = new char[n];
        top = -1;
    }
    void push(char ch)
    {
        if(! isFull())
        {
            arr[++top] = ch;
        }
        
    }
    char pop()
    {
        if(! isEmpty())
        {
            return arr[top--];
        }
        return '\0';
    }
    char peek()
    {
        if(! isEmpty())
        {
            return arr[top];
        }
        return '\0';
    }
    boolean isEmpty()
    {
        return top == -1;
    }
    boolean isFull()
    {
        return top +1 == n;
    }
}