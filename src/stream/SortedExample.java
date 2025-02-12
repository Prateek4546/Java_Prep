package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(5 ,4,3,2,6,1);
        al.stream().sorted().forEach(System.out::println );
        List<String> st = Arrays.asList("apple" , "couw" , "newj");
        st.stream().sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }
}
