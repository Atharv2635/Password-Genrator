import java.security.SecureRandom;

public class PasswordGenerator {

    public static void main(String[] args) {
        int length = 12; // Length of the password
        System.out.println(generatePassword(length));
    }

    static String generatePassword(int length) {
        // Define the character set for the password
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()-_+=";

        // Combine all character sets
        String allCharacters = uppercase + lowercase + numbers + specialCharacters;

        // Use SecureRandom for better randomness
        SecureRandom random = new SecureRandom();

        // StringBuilder to build the password
        StringBuilder password = new StringBuilder();

        // Generate the password
        for (int i = 0; i < length; i++) {
            // Get a random index from the character set
            int randomIndex = random.nextInt(allCharacters.length());

            // Append the character at the random index to the password
            password.append(allCharacters.charAt(randomIndex));
        }

        return password.toString();
    }
}