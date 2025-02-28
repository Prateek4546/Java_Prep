package stream;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // what is stream ??
        // stream in java is  sequence of element on which we can perform functional or declarative programming

        // how to use stream?
       // Source intermediate operation and terminal
        List<Integer> numbers = Arrays.asList(1,25,56,3, 45 ,2, 55);
        System.out.println( numbers.stream().filter(n->n % 2 == 0).count());
    }
}
