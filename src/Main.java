public class Main {

    public static void main(String[] args) {

        int sumTwo = add(3, 8);

        System.out.println("Sum of two integers: " + sumTwo);

        int sumFour = add(3, 8, 4, 9);

        System.out.println("Sum of four integers: " + sumFour);

        String morningGreet = morningGreeting("Toby Fox");

        System.out.println("Morning Greeting: " + morningGreet);

        String afternoonGreet = afternoonGreeting("Mac Miller");

        System.out.println("Afternoon Greeting: " + afternoonGreet);

        String tripledString = triple("oohbaby");

        System.out.println("Tripled String: " + tripledString);

        double halfValue1 = half(8);

        System.out.println("Half of 8: " + halfValue1);

        double halfValue2 = half(17);

        System.out.println("Half of 17: " + halfValue2);

        int roundedPositive1 = roundPositiveValueToNearestInteger(8.5);

        System.out.println("Rounded 8.5: " + roundedPositive1);

        int roundedPositive2 = roundPositiveValueToNearestInteger(8.49);

        System.out.println("Rounded 8.49: " + roundedPositive2);

        int roundedNegative1 = roundNegativeValueToNearestInteger(-8.5);

        System.out.println("Rounded -8.5: " + roundedNegative1);

        int roundedNegative2 = roundNegativeValueToNearestInteger(-8.49);

        System.out.println("Rounded -8.49: " + roundedNegative2);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to add four integers using the add method for two integers
    public static int add(int num1, int num2, int num3, int num4) {
        return add(add(num1, num2), add(num3, num4));
    }

    // Method to return a morning greeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    // Method to return an afternoon greeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    // Method to triple a string
    public static String triple(String input) {
        return input + input + input;
    }

    // Method to return half of an integer as a double
    public static double half(int num) {
        return num / 2.0;
    }

    // Method to round a positive double to the nearest integer
    public static int roundPositiveValueToNearestInteger(double value) {
        return (int) Math.round(value);
    }

    // Method to round a negative double to the nearest integer
    public static int roundNegativeValueToNearestInteger(double value) {
        return (int) Math.round(value);
    }
}


