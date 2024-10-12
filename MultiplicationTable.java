public class MultiplicationTable {

    public static void main(String[] args) {
        int number = 15;  // Hardcoded number for the multiplication table

        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
