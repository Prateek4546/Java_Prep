package stream;

import java.util.Arrays;
import java.util.List;

public class ResuceExample {

    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1, 2 , 3 , 4 , 5 , 6);
        final  Integer sum = al.stream().reduce(0 , (a ,b)-> a+b);
        System.out.println(sum);
    }
}
