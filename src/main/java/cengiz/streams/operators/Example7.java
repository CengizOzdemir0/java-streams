package cengiz.streams.operators;

import java.util.List;
import java.util.stream.Stream;

public class Example7 {

    public static void main(String[] args) {

        List<String> list = Stream.of("d2", "a2", "b1", "b3", "c")
            .map(String::toUpperCase).toList();
      System.out.println(list);
    }

}
