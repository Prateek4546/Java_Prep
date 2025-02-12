package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> al = Arrays.asList(
                Arrays.asList("sfkd" , "shdf"),
                Arrays.asList("isdof" , "dsfoui"),
                Arrays.asList("odsifp" , "dsfi")
        );
        al.stream().flatMap(Collection::stream)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
