package Unit_3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class properties {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:\\JAVA\\JAVA_PROJECTS\\src\\src\\Unit_3\\db.properties");
            Properties p=new Properties();
            p.load(fr);
            System.out.println(p.getProperty("user1" ));
            System.out.println(p.getProperty("coupon"));
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
