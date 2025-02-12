package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1,2,3,4,5,6);

        List<Integer> ans = al.stream().filter(x-> x %2 == 0)
                .map(x -> x*x)
                .collect(Collectors.toList());
        System.out.println(ans);
    }
}
