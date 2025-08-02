import java.util.Scanner;

public class InvoiceDetail {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the invoice title: ");
        String title = scanner.nextLine();
        //scanner.nextLine();

        System.out.println("Write the product price n#1: ");
        double product1 = scanner.nextDouble();
//        scanner.nextDouble();
        System.out.println("Write the product price n#2: ");
        double product2 = scanner.nextDouble();
//        scanner.nextDouble();

        double resultWoTax = product1 + product2;
        double tax = resultWoTax * 0.19;
        double resultWTax = resultWoTax + tax;


        String finalResult = "Result with out taxes "+ resultWoTax+ " taxes " + tax + " w o taxes"+ resultWTax;

        System.out.println(finalResult);

    }
}
