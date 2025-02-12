package stream;

import java.util.*;

public class CountExample {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1,2,3,4,5,6);
       final  long count =   al.stream().count();
        System.out.println(count);
    }
}
