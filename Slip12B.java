public class Slip12B {
    public static void main(String[] args) {
        String[] stringArray = {"Dream big", "Hello World", "Java Programming"};

        for (String str : stringArray) {
            String reversedStr = new StringBuilder(str).reverse().toString();
            System.out.println("Original string: " + str);
            System.out.println("Reversed string: " + reversedStr);
        }
    }
}
