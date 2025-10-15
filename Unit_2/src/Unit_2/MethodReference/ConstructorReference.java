package Unit_2.MethodReference;

public class ConstructorReference {
    public static void main(String[] args) {
        Messagealbe hello=Message::new;
        hello.getMessage("Hello");
    }
}
