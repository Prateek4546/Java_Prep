package stream;

import java.util.*;

public class DIstinctExample {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1,2,3,4,5,6,2,3);
        al.stream().distinct().forEach(System.out::println);
    }
}
