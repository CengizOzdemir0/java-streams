package cengiz.streams.exceptions;

import java.util.Arrays;

public class Example11 {

    public static void main(String[] args) {

        String[][] data = new String[][]{{"a", "b"}, {"c", "d","a"}, {"e", "f"}};

        try {
            Arrays.stream(data)
                .flatMap(Arrays::stream)
                .filter(x -> "a".equals(x.toString()))
                .forEach(a -> {
                    if(a.equals("a")){
                        throw new IllegalArgumentException("demo");
                    }
                });
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
