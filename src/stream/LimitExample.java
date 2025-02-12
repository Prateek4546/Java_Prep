package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitExample {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1 , 2 , 3 , 4 , 5 , 6);

       List<Integer> ans =  al.stream()
                                 .limit(5)
                                 .toList();
        System.out.println(ans);
    }
}
