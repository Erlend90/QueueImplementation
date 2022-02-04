public class QueueImplementation {
    final int N = 100;
    int[] buf = new int[N];
    int end = 0;
    int start = 0;


    //For this method to start at index 0, move one space at a time up to the max (99) and then return to index 0
    //(I imagine this was the intention), I have had to modify the implementation. If I kept buf[end+1] it would start at index 1,
    //and when end reached end = 99 it would try to input into index 100 which doesn't exist. It would also never get that far, as when
    //end is 0, end % 100 will also be 0, and you would overwrite index 1 over and over. Instead, it will now count to 99
    //and then go back around to 0.
    public void put(int item){
        buf [end] = item;
        end = (end+1)%N;
    }

    public int get(){
        int item = buf[start];
        start = (start+1)%N;
        return item;
    }
}
                             