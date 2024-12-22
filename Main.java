public class Main {

    // Main "Method" for running code.
    public static void main(String[] args) {
        
        // Get a random number.
        double randomNumber = RandomNumberGenerator.getRandomNumber(0, 5);

        // Double the random number.
        double twiceRandomNumber = randomNumber * 2;

        // Display the resulting output equation.
        System.out.println("2 * " + randomNumber + " = " + twiceRandomNumber);

        // Triple the random number.
        double thriceRandomNumber = randomNumber * 3;

        // Display the resulting output equation.
        System.out.println("3 * " + randomNumber + " = " + thriceRandomNumber);
    }
}