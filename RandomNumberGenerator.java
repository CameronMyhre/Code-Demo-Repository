public class RandomNumberGenerator {
    
    /**
     * Generates a random number in between the given maximum and minimum value,
     * 
     * @param mixNumber The minimum the generated number can be.
     * @param maxNumber The highest the randomly generated number can be.
     * @return A random number in between the given minimum and maximum values.
     */
    public static double getRandomNumber(double mixNumber, double maxNumber) {

        // Calculate a value to multiply the random number by to get the desired result. 
        double randomNumberMultiplier = maxNumber - mixNumber;

        return Math.random() * randomNumberMultiplier + mixNumber;
    }
}
