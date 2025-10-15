package Unit_2;

public class thread2 extends Thread{
    public void run() {


        for (int i = 0; i < 100; i++) {
            try{
            Thread.sleep(2000);
        }
        catch(Exception e){
                System.out.println(e.getMessage());
            }
            if(i%2==0)System.out.println(i);
        }
    }
}
