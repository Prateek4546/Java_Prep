package stream;

import java.util.*;
import java.util.stream.Collectors;

public class PeekExample {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1,2,3,4,5,6);
       List<Integer> ans =  al.stream()
               .peek(System.out::println)
                .map(n -> n*n)
               .peek(System.out::println)
               .collect(Collectors.toList());
    }
}
