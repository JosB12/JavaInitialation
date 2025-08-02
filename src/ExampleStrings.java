public class ExampleStrings {
    public static void main(String[] args) {
        String name = "Josue";
        String name2 = new String("josue");

        boolean isEqual = name.equals(name2);
        System.out.println("name.equals(name2) = " + isEqual);

        isEqual = (name == name2);
        System.out.println("name == name2 = " + isEqual);

        String name3 = "Josue";
        isEqual = (name == name3);
        System.out.println("name == name3 = " + isEqual);

        isEqual = name.equalsIgnoreCase(name2);
        System.out.println("name.equalsIgnoreCase(name2) = " + isEqual);

    }
}
