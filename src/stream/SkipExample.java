package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipExample {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1, 2 , 3 , 4 , 5 , 6);

       List<Integer> ans =  al.stream().skip(2).collect(Collectors.toList());
        System.out.println(ans);
    }
}
