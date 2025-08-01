public class PrimitivesFloat {
    static double numDouble = 4;
    public static void main(String[] args){
        float numFloat = 5;
        float numFloat2 = 152000000.0f;//1.52e8f
        float numFloat3 = 15.2f;
        System.out.println("numFloat = " + numFloat);
        System.out.println("numFloat2 = " + numFloat2);
        System.out.println("numFloat 3= " + numFloat3);
        System.out.println("numFloat in bites = " + Float.BYTES);
        System.out.println("min value numFloat = " + Float.MIN_VALUE);
        System.out.println("max value numFloat = " + Float.MAX_VALUE);

        System.out.println("numDouble = " + numDouble);
        System.out.println("numDouble in bites = " + Double.BYTES);
        System.out.println("min value numDouble = " + Double.MIN_VALUE);
        System.out.println("max value numDouble = " + Double.MAX_VALUE);
    }
}
