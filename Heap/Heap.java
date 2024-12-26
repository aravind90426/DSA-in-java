package Heap;

public class Heap {

    public Heap()
    {

    }
    public int parent(int index)
    {
        return (index-1)/2;
    }
    public int left(int index){
        return index*2 +1;
    }
    public int right(int index){
        return index*2 +2;
    }

}
