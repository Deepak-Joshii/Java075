package Unit_3;

public class Student implements Comparable<Student>{
    int age;
    String name;
    int rollno;

    public Student(int age, String name, int rollno) {
        this.age = age;
        this.name = name;
        this.rollno = rollno;
    }
    public int compareTo(Student st){
        if(age==st.age)return 0;
        else if(age>st.age)return 1;
        else return -1;
    }
}
