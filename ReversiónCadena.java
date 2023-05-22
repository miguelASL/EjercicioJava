package Ejercicio5;

public class ReversiónCadena {
        public static String reverseString(String str) {
            StringBuilder reversed = new StringBuilder(str);
            return reversed.reverse().toString();
        }

        public static void main(String[] args) {
            String originalString = "hola mundo";
            String reversedString = reverseString(originalString);
            System.out.println("Original String: " + originalString);
            System.out.println("Reversed String: " + reversedString);
        }
}
