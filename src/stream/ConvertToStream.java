package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertToStream {
    public static void main(String[] args) {
        int[] primitivArray = {1 , 2 , 3 , 4 , 5};
        final IntStream intStream = Arrays.stream(primitivArray);
        intStream.forEach(System.out::println);
        Integer[] arr = {1 , 2 , 3 , 4 , 5};

        final Stream<Integer> obj = Stream.of(arr);

        obj.forEach(System.out::println);

        List<Integer> al = Arrays.asList(1,2,3,4,5);
        al.stream().forEach(System.out::println);


    }
}
