import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

    public static void main(String[] args) {
        String input = "¦ &\\\u001B/ö»";

        // Here we assume a hashing or transformation function that will give us the desired output
        String hexValue = convertToHex(input);

        // Print the outputz
        System.out.println("hrx: " + hexValue);
    }

    private static String convertToHex(String input) {
        try {
            // Create a MessageDigest instance for SHA-1 or MD5 depending on your needs
            MessageDigest md = MessageDigest.getInstance("SHA-1"); // Change to "SHA-1" if needed

            // Pass the input string to the digest
            byte[] hashedBytes = md.digest(input.getBytes());

            // Convert the resulting bytes to hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashedBytes) {
                hexString.append(String.format("%02X", b));
            }

            // Truncate to get the desired length (you may need to adjust this depending on the output)
            return hexString.toString().substring(0, 16); // Example: Getting the first 16 characters

        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }

    }
}
