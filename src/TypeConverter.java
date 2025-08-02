public class TypeConverter {
    public static void main(String[] args) {
        int numToString = 800;
        String stringResult = Integer.toString(numToString);
        System.out.println("stringResult = " + stringResult + "\n");
        
        double doubleResult = Double.parseDouble(stringResult);
        System.out.println("doubleResult = " + doubleResult + "\n");

        float floatNumber = Float.parseFloat(stringResult);
        System.out.println("floatNumber = " + floatNumber + "\n");


        String strToBool = "TRUE";
        boolean boolResult = Boolean.parseBoolean(strToBool);
        System.out.println("boolResult = " + boolResult);
        System.out.println("");

        int castNumber = 9800;
        char charNumber = (char) castNumber;
        System.out.println("charNumber = " + charNumber);
        short shortNumber = (short) castNumber;
        System.out.println("shortNumber = " + shortNumber);

        byte byteNumber = (byte) castNumber;
        System.out.println("byteNumber = " + byteNumber);

        long longNumbers = (long) castNumber;
        System.out.println("longNumbers = " + longNumbers);

        int numChar= 200;
        String strChar = String.valueOf(numChar) ;
        System.out.println("strChar = " + strChar);

    }
}
