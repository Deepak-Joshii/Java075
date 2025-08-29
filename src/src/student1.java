abstract class student1 {
    String name;//abstract class has no object means no object can be created out of it
    int roll_no;

    public student1(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    abstract void attend_class();
    abstract void give_exam();
}
