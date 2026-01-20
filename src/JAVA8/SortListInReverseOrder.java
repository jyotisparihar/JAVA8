package JAVA8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListInReverseOrder {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> reverseList = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Reversed number list : " + reverseList);

        List<String> names = Arrays.asList("Mango", "Banana", "Apple", "Pineapple");
         names.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


    }

}
