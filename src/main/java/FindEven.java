

import java.util.Scanner;
import java.util.function.Function;

public class FindEven {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a value");
        long input = scanner.nextLong();
//        lambda expression that will return an even value
        Function<Long, Long> evenNumber= num -> num + 2 - (num%2);

//        Here we call the method with long value
        long evenNum = evenNumber.apply(input);
        System.out.println("Entered value:"+input+"\nNext even: "+evenNum);
    }
}
