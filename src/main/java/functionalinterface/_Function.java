package functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment1 = incrementByOne(1);
        System.out.println(increment1);

        Integer increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        Integer multiply = multiplyByTenFunction.apply(1);
        System.out.println(multiply);


        Function<Integer,Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyByTenFunction);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

    }

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multiplyByTenFunction =
            number -> number * 10;

    private static int incrementByOne(int number) {
        return number + 1;
    }
}
