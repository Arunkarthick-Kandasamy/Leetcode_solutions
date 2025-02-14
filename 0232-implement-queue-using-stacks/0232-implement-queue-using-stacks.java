class MyQueue 
{
    Queue<Integer> queue ;
    public MyQueue() 
    {
        queue = new LinkedList<>();        
    }
    
    public void push(int x) 
    {
        this.queue.add(x);        
    }
    
    public int pop() 
    {
        return this.queue.poll();        
    }
    
    public int peek() 
    {
        return this.queue.peek();        
    }
    
    public boolean empty() 
    {
        return this.queue.isEmpty();      
    }
}
