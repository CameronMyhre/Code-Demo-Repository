public class Main {

    // Main "Method" for running code.
    public static void main(String[] args) {
        
        // Get a random number.
        double randomNumber = RandomNumberGenerator.getRandomNumber(0, 5);

        // Double the random number.
        randomNumber *= 2;

        // Output the sum of the two numbers.
        System.out.println("Twice the random number is: " + randomNumber);
    }
}