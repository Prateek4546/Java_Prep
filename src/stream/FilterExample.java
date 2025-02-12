package stream;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1 , 2 , 3 , 4 , 5 , 6);

        al.stream().filter((n) -> n % 2 == 0).forEach(System.out::println);
    }
}
