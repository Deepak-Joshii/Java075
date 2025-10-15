package Unit_2.Date_15_10_25;

import java.util.stream.Stream;

public class JavaStreamExample {
    public static void main(String[] args) {
        Stream.iterate(2,element->element+1)
        .filter(element->element%5==0)
                .limit(5)
                .forEach(System.out::println);
    }
}
