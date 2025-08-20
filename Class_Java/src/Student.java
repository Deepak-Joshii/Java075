public class Student {
    //data member=instance member
    int roll_no;
    String name;
    Student(int x,String n){
        roll_no=x;
        name=n;
    }
    Student(){
        System.out.println("I am default constructor");
    }
    public void display()
    {
        System.out.println("Roll No "+roll_no);
        System.out.println("Name is "+name);
    }
}
