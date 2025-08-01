import javax.swing.*;

public class NumericSystem {
    public static void main(String[] args) {
        String message = JOptionPane.showInputDialog(null, "Escriba un numero decimal: ");
        int decimalNumber = 0;
        try {
            decimalNumber = Integer.parseInt(message);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Debe de indicar un numero decimal");
            main(args);
            System.exit(0);
        }
        String resultDecimal = ("decimalNumber = " + decimalNumber);
        System.out.println(resultDecimal);

        String resultBinaryNumber = ("decimal number in binary = " + Integer.toBinaryString(decimalNumber));
        System.out.println("resultBinaryNumber = " + resultBinaryNumber);


        String resultOctalNumber = ("decimal number in octal = " + Integer.toOctalString(decimalNumber));
        System.out.println("resultOctalNumber = " + resultOctalNumber);

        String resultHexNumber = ("decimal " + decimalNumber +" in hex = " + Integer.toHexString(decimalNumber));
        System.out.println("hexNumber = " + resultHexNumber);

        String messageResult = "\n"+ resultDecimal;
        messageResult +=  "\n"+ resultBinaryNumber;
        messageResult +=  "\n"+ resultOctalNumber;
        messageResult +=  "\n"+ resultHexNumber;

        JOptionPane.showMessageDialog(null,messageResult);

    }
}
