package stream;

import java.util.*;

public class AnyMatchExample {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1,2,3,4,5,6);

        final boolean b =  al.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(b);
    }
}
