package JAVA8;

import java.util.List;

public class MultipleOfFive {
    public static void main(String[] args) {

        List<Integer> list = List.of(10, 23, 45, 60, 77, 90, 33, 50);
        List<Integer> multiples = list.stream().filter(i -> i%5 == 0).toList();
        System.out.println(multiples);
    }
}
