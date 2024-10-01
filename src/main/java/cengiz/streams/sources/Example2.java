package cengiz.streams.sources;

import java.util.stream.Stream;

public class Example2 {

    public static void main(String[] args) {

        Stream.of("a1", "a2", "a3")
            .findFirst()
            .ifPresent(System.out::println);
    }

}
