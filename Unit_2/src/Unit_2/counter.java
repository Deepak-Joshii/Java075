package Unit_2;
public class counter {
    private int count=0;
    public  synchronized void increment(){
        count++;
    }
    public int getcount(){
        return count;
    }
}
