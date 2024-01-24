package homework;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    /*
    Переписать лямбда выражения из класса Main пакета our_interfaces (см.код)
    с использованием стандартных функциональных интерфейсов
     */

    public static void main(String[] args) {

        //Concatable concatable = (a, b) -> Integer.toString(a)+b;
        BiFunction<Integer, Integer, String> concate = (a, b) -> Integer.toString(a)+b;
        System.out.println(concate.apply(1,3));

        //Checkable checkable = string -> string.length() == 3;
        Predicate<String> checkTheLength = a -> a.length()==3;
        System.out.println(checkTheLength.test("abc"));
        System.out.println(checkTheLength.test("abcdef"));

        //checkable = string -> string.length()% 2 == 0;
        Predicate<String> checkIfLenghthIsEven = a -> a.length()%2 == 0;
        System.out.println(checkIfLenghthIsEven.test("abc"));
        System.out.println(checkIfLenghthIsEven.test("abcdef"));

        //Tramsformable tramsformable = string -> string.toUpperCase();
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        consumer.accept("abcdef");
        //или
        UnaryOperator<String> transform = a -> a.toUpperCase();
        System.out.println(transform.apply("abcdef"));

        //tramsformable = string -> string.length()==4 ? "****" : string;
        UnaryOperator <String> intoTheStars = a -> a.length()==4 ? "****" : a;
        System.out.println(intoTheStars.apply("abcd"));
        System.out.println(intoTheStars.apply("ab"));


    }
}
