package StackANdQueue;

public class CircularQueue {

    private static final int defaultSize = 10;
    protected  int [] data;
    int front =0;
    int rear =0;
    private  int size=0;

    public CircularQueue(int Size) {
        this.data = new int[Size];
    }


    public CircularQueue()
    {
        this(defaultSize);
    }

    public boolean isFull() {
        return size== data.length;
    }
    public  boolean isEmpty(){
        return  size==0;
    }
    public boolean push(int val) throws Exception
    {
        if(isFull())
            throw new Exception("queue overFlow");
        data[rear++] = val;
        rear%= data.length;
        size+=1;
        return true;

    }

    public int pop() throws Exception
    {
        if(isEmpty())
            throw new Exception("Stack UnderFlow");
        int remove = data[front++];

        front%= data.length;
        size--;
        return  remove;
    }

    public void display()
    {int i=front;
        do{
            System.out.print(data[i++]+"->");
            i%=data.length;
        }while(i!=rear);
        System.out.println("END");
    }

}
