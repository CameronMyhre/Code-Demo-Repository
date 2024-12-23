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

        // Quadruple the random number.
        double fourTimesRandomNumber = randomNumber * 4;

        // Display the resulting output equation.
        System.out.println("4 * " + randomNumber + " = " + fourTimesRandomNumber);

        // Quintuple the random number.
        double fiveTimesRandomNumber = randomNumber * 5;

        // Display the resulting output equation.
        System.out.println("5 * " + randomNumber + " = " + fiveTimesRandomNumber);
    }
}