class Solution {
    public int maxDepth(String s) 
    {
        int result = 0;
        int count = 0;
        Stack1 stack = new Stack1(s.length());
        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            {
                stack.push(ch);
                count++;
            }
            if(ch ==')')
            {
                stack.pop();
                count--;
            }
            result = result < count ? count : result;
            if(stack.isEmpty())
            {
                count =0;
            }
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