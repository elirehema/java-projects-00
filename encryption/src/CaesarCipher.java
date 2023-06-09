
import java.util.Scanner;

public class CaesarCipher
/**
 *
 * @author user
 * using substitution
 */
  
{
    public static final String ALPHABET = "abcdefghijklzyxwvutsrqponm";
    
    public static String encrypt(String plainText, int shiftKey)
    {
        plainText = plainText.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(plainText.charAt(i));
            int keyVal = (shiftKey + charPosition ) % 26;
            char replaceVal = ALPHABET.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }
    
    public static String decrypt(String cipherText, int shiftKey)
    {
        cipherText = cipherText.toLowerCase();
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(cipherText.charAt(i));
            int keyVal = (charPosition - shiftKey) % 26;
            if (keyVal < 0)
            {
                keyVal = ALPHABET.length() + keyVal;
            }
            char replaceVal = ALPHABET.charAt(keyVal);
            plainText += replaceVal;
        }
        return plainText;
    }
    
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the String for Encryption: ");
            String message = new String();
            Integer shiftKey;
            message = scanner.next();
            System.out.println("Enter the ShiftKey: ");
            shiftKey = scanner.nextInt();
            System.out.println("Encrpted Message: ");
            System.out.print(encrypt(message, shiftKey));
            
            System.out.println("\n");
            System.out.println("Original Message: ");
            System.out.print(decrypt(encrypt(message, shiftKey), shiftKey));
            System.out.println("\n");
            System.out.println("\n");
            System.exit(0);
        }catch(Exception e){
        e.printStackTrace();}
    }
    
            
    

}