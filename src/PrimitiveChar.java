public class PrimitiveChar {
    public static void main(String[] args){
        char Charsi = '\u0040';
        char Simbol = '@';
        char decimal = 64;
        System.out.println("simbol = " + Simbol);
        System.out.println("Character = " + Charsi);
        System.out.println("decimal = " + decimal);

        System.out.println("Simbol = Character" + (Simbol == Charsi));
        System.out.println("decimal = Character" + (decimal == Charsi));

        System.out.println("Char en bytes es = " + Character.BYTES);
        System.out.println("minimo de char es = " + Character.MIN_VALUE);
        System.out.println("maximo de char es = " + Character.MAX_VALUE);

    }
}
