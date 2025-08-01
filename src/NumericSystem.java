public class NumericSystem {
    public static void main(String[] args) {
        int decimalNumber = 30;
        System.out.println("decimalNumber = " + decimalNumber);
        System.out.println("decimal number in binary = " + Integer.toBinaryString(decimalNumber));

        int binaryNumber = 0b1001011000;   //0b when number is binary
        System.out.println("binaryNumber = " + binaryNumber);


        System.out.println("decimal number to octal = " + Integer.toOctalString(decimalNumber));
        int octalNumber = 01130; // 0 in front when number is octal

        System.out.println(octalNumber);

        System.out.println("decimal " + decimalNumber +" in hex = " + Integer.toHexString(decimalNumber));
        int hexNumber = 0x1e; //0x when is an hex number
        System.out.println("hexNumber = " + hexNumber);
    }
}
