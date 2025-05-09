package Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClient {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> stream = list.stream();
        // manipulation
        // Filter or Map
        List<Integer> result = stream
                .filter(x -> x%2 == 0)
                .sorted()
                .map(x -> x * x)
                .distinct()
                .toList();
    }
}
