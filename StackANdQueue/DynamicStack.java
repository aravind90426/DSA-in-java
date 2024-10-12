package StackANdQueue;

public class DynamicStack extends CustomStack {
    public DynamicStack()
    {
        super();
    }
    public DynamicStack(int size)
    {
        super(size);
    }
    public boolean push(int val) throws Exception {
        if(isfull())
        {
            int temp[] = new int[data.length*2];
            for(int i=0;i< data.length;i++)
            {
                data[i]=temp[i];
            }
            data=temp;
        }
        return  super.push(val);
    }
}
