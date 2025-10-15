package Unit_2.MethodReference;

public class MethodReference1 {
//    public static void saySomething() {
//        System.out.println("Hello static world");
//
//    }
public void saySomething() {
    System.out.println("Hello static world");

}
    public static void main(String[] args) {
    MethodReference1 mMethodReference1=new MethodReference1();//because abhi humare method is not static

        Sayable sayable=mMethodReference1::saySomething;
        sayable.say();
    }
}
