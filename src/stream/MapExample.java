package stream;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        List<String> al =  Arrays.asList("adjk" , "fdks" , "oisdu");

        al.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
