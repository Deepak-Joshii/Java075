package Unit_3;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting2 {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student(20,"Depu",2));
        al.add(new Student(50,"chku",3));
        al.add(new Student(24,"billu",4));
        al.add(new Student(23,"tillu",5));
        al.add(new Student(22,"Champak",6));
        al.add(new Student(21,"Monu",7));
        Collections.sort(al);//will be sorted on the basis of age
        for(Student st:al) System.out.println("Name; "+st.name+" Age: "+st.age+" Roll No"+st.rollno);
    }
}
