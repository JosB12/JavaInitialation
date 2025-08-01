public class Primitives {
    public static void main(String[] args){
        //byte
        byte byteNumber = 3; // since -128 until 127
        System.out.println("byteNumber = " + byteNumber);

        System.out.println("tipe byte in byte = " + Byte.BYTES);
        System.out.println("tipe byte in bytes = " + Byte.SIZE);
        System.out.println("Max value tipe byte = " + Byte.MAX_VALUE);
        System.out.println("Min value tipe byte = " + Byte.MIN_VALUE);
        System.out.println("");
        //Short
        short shortNumber = 4; //since -32768 until 32767
        System.out.println("shortNumber = " + shortNumber);
        System.out.println("tipe Short in byte = " + Short.BYTES);
        System.out.println("tipe Short in bytes = " + Short.SIZE);
        System.out.println("Max value tipe Short = " + Short.MAX_VALUE);
        System.out.println("Min value tipe Short = " + Short.MIN_VALUE);
        System.out.println("");

        int intNumber = 32768;
        System.out.println("intNumber = " + intNumber);
        System.out.println("tipe int/Integer in byte = " + Integer.BYTES);
        System.out.println("tipe int/Integer in bytes = " + Integer.SIZE);
        System.out.println("Max value tipe int/Integer = " + Integer.MAX_VALUE);
        System.out.println("Min value tipe int/Integer = " + Integer.MIN_VALUE);
        System.out.println("");

        long longNumber = 2147483648L;
        System.out.println("longNumber = " + longNumber);
        System.out.println("tipe long in byte = " + Long.BYTES);
        System.out.println("tipe long in bytes = " + Long.SIZE);
        System.out.println("Max value tipe long = " + Long.MAX_VALUE);
        System.out.println("Min value tipe long = " + Long.MIN_VALUE);
        System.out.println("");
    }
}
