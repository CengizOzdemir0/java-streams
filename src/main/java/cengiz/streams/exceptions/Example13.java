package cengiz.streams.exceptions;



import static cengiz.streams.exceptions.LambdaExceptionUtil.rethrowFunction;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Example13 {

    /*
    public List<Class> getClasses() throws ClassNotFoundException {

        List<Class> classes =
                Stream.of("java.lang.Object", "java.lang.Integer", "java.lang.String")
                        .map(className -> Class.forName(className))
                        .collect(Collectors.toList());

        return classes;
    }
    */

    public static List<Class> getClasses() throws ClassNotFoundException {

        return Stream.of("java.lang.Object", "java.lang.Integer", "java.lang.String")
                        .map(rethrowFunction(Class::forName))
                        .collect(Collectors.toList());

    }

    public static void main(String args[]) throws ClassNotFoundException {

        List<Class> list = getClasses();
        for(Class obj : list){
            System.out.println(obj.getName());
        }

    }
}
