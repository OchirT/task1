import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> {
        if (y > 0) {
            return x / y;
        } else throw new ArithmeticException("Ошибка! На 0 делить нельзя.") {

        };// c return вылазит ошибка, или что должно возвращаться? не совсем понимаю!
    };
    //BinaryOperator<Integer> devide = (x, y) -> y > 0 ? x / y : y * -1; // тернарный оператор
    // (верная реализация?)


    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;


    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

}
