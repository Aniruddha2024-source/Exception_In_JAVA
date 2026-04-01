package lamda.Test;

//import lamda.service.impl.ServiceImpl;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test5 {
    public static void main(String[] args) {
//        Function<Integer, Boolean> service = num -> { return num >= 0;};
//        boolean result = service.apply(15);
//        System.out.println(result);

        // it takes something as input but return as a boolean output only
        Predicate<Integer> service = num -> { return num >= 0;};
        boolean result = service.test(15);
        System.out.println(result);
    }
}
