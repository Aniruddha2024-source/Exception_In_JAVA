package lamda.Test;

import exception.ZeroInputException;
import lamda.service.Service;

import java.util.function.Function;


public class Test4 {
    public static void main(String[] args) {
//        Service service = (num) -> {
//                System.out.println("You are learning java - " + num);
//        };
//        service.print(21);
//        try {
//            Service service = (num1, num2) -> {
//                if(num2 == 0) {
//                    throw new ZeroInputException("can not " + num1 + " divided by " + num2);
//                }
//                return num1/num2;
//            };
//            int result = service.divide(10, 0);
//            System.out.println(result);
//        }catch (ZeroInputException exception) {
//            System.out.println(exception.getMessage());
//        }

        Function<Integer, Integer> service = num -> { return ++num;};
        int result = service.apply(15);
        System.out.println(result);



    }
}
