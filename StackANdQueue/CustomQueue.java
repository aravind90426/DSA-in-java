package StackANdQueue;

public class CustomQueue {
    private static final int defaultSize = 10;
    protected  int [] data;
    int end=0;
    public CustomQueue()
    {
        this(defaultSize);
    }
    public CustomQueue(int size)
    {
        this.data = new int[size];
    }
    public boolean push(int val)
    {
        if(isFull())
            return  false;
        data[end++] = val;
        return true;

    }
    public int pop() throws Exception
    {
        if(isEmpty())
            throw new Exception("Stack UnderFlow");
        int remove = data[0];
        for(int i=1;i<end;i++)
        {
            data[i-1]=data[i];

        }
        end--;
        return  remove;
    }
    public void display()
    {
        for(int i=0;i<end;i++)
        {
            System.out.print(data[i]+"<-");
        }
        System.out.println("END");
    }

    public boolean isFull() {
        return end== data.length;
    }
    public  boolean isEmpty(){
        return  end==0;
    }

}
