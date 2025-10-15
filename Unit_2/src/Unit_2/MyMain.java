package Unit_2;

public class MyMain {
    public static void main(String[] args) {
        thread1 th1=new thread1();
        thread2 th2=new thread2();
//        th1.setPriority(10);
        th1.start();
        th2.start();
        System.out.println(th1.getName());
        th1.setName("Kiet thread");
//        System.out.println(th1.getName());
//        System.out.println(th1.getPriority());

//        System.out.println(th1.getPriority());
    }
}
