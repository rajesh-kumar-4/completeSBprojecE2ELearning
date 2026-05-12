import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class IBMMQJMSMessageIDDecoding{

            public static void main(String[] args) {
                String input = "HKID20241024144956430433";

                try {
                    // Step 1: Create a MessageDigest instance for SHA-1
                    MessageDigest md = MessageDigest.getInstance("SHA-1");

                    // Step 2: Pass the input string to the digest
                    byte[] hashedBytes = md.digest(input.getBytes());

                    // Step 3: Convert the resulting bytes to hexadecimal
                    StringBuilder hexString = new StringBuilder();
                    for (byte b : hashedBytes) {
                        hexString.append(String.format("%02X", b));
                    }

                    // Truncate the hex string to the first 16 characters (8 bytes, 64 bits)
                    String finalHex = hexString.toString().substring(0, 16);

                    // Step 4: Output the result
                    System.out.println("Hexadecimal hash: " + finalHex);

                } catch (NoSuchAlgorithmException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }