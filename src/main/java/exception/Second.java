package exception;

import java.util.Arrays;
import java.util.List;

public class Second {

    public static void main(String[] args) {
        addLetterToString("Hello", 'a');
        addLetterToString("Hello", '1');
        divideByZero(5.5, 0.0);
        divideByZero(5.5, 2.0);
        NonEmptyList(Arrays.asList(1), 0);
        NonEmptyList(Arrays.asList(1,2,3), 0);

    }

    public static String addLetterToString(String s, Character ch) throws IllegalArgumentException {
        if (!Character.isLetter(ch)){
            throw new IllegalArgumentException("It is not a letter");
        }
        return s + ch;
    }

    public static Double divideByZero(Double x, Double y) throws ArithmeticException{
        if (y == 0.0){
            throw new ArithmeticException("Division by zero");
        }
        return x/y;
    }

    public static void NonEmptyList(List<Integer> l, int index) throws IllegalArgumentException{
        if (l.isEmpty() || l.size() == 1){
            throw new IllegalArgumentException("NO");
        }
        l.remove(index);
    }

}
