package stream;

import java.util.*;

public class SumExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1 , 2 , 3 , 4 , 5);
       final long sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }

}
