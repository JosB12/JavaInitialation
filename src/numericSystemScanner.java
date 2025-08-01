import java.util.InputMismatchException;
import java.util.Scanner;

public class numericSystemScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        try{
            System.out.print("Write the decimal number that you want to calculate: ");
            num = scanner.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Error while received the number\nBe sure that you write a number");
            main(args);
            System.exit(0);
        }
        String decimalNumber = ("Decimal number result = "+ num);
        String binaryNumber = ("Binary number result = " + Integer.toBinaryString(num));
        String octaNumber= ("Octa number result = " + Integer.toOctalString(num));
        String hexNumber= ("Hex number result = " +Integer.toHexString(num));



        String results = decimalNumber;
        results += "\n"+ binaryNumber;
        results += "\n"+ octaNumber;
        results += "\n"+ hexNumber;

        System.out.println("The final result is " + results);
    }
}
