package JAVA8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachWord {
    public static void main(String[] args) {

        String sentence = "Jyoti works in accenture. Jyoti is a accenture employee.";
        String[] words = sentence.toLowerCase().split("\\W+"); //this will split by non-word characters
        Map<String, Long> frequency = Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //.collect is a terminal operation

        System.out.println(frequency);

        /*
        * First split the sentence into words array using split("\\W+")
        * Convert the array of words into a stream using Arrays.stream()
        * Collectors.groupingBy will group the words based on the key provided
        * Function.identity() will return the word itself as the key in the map
        * Collectors.counting() will count the occurrences of each word
         */

    }
}
