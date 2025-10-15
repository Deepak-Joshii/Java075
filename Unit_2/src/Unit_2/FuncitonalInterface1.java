package Unit_2;

import java.util.*;
import java.util.function.*;

public class FuncitonalInterface1 {
    public static void main(String[] args) {
        Predicate<Integer> isEven= n->n%2==0;
        System.out.println(isEven.test(97));
        Function<Integer,Integer> square=n-> n*n;
        System.out.println(square.apply(5));
        Consumer<String> display=msg-> System.out.println(msg);
        display.accept("Yo Hi there!");
        Supplier<Double> randomValue=() -> Math.random();
        System.out.println(randomValue.get(


        ));
    }
}
