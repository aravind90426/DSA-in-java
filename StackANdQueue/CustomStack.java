package StackANdQueue;

public class CustomStack {
    private static final int defaultSize = 10;
    protected  int [] data;
    int ptr =-1;
    public CustomStack()
    {
        this(defaultSize);
    }
    public CustomStack(int size)
    {
        this.data = new int[size];
    }
    public boolean push(int val) throws Exception
    {
        if(isfull())
        {
            throw  new Exception("stack is full");

        }
        ptr++;
        data[ptr]=val;
        return true;
    }

    public boolean isfull() {
        return  ptr== data.length-1;
    }
    public boolean isEmpty(){
        return ptr== -1;
    }
    public int pop() throws  Exception
    {
        if(isEmpty())
        {
            throw  new Exception("stack is empty");
        }
        int remove = data[ptr];
        ptr--;
        return remove;
    }

    public int peek() throws  Exception
    {
        if(isEmpty())
        {
            throw  new Exception("stack is empty");
        }
        return  data[ptr];
    }


}
