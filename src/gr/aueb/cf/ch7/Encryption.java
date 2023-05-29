package gr.aueb.cf.ch7;

public class Encryption {
    /** Encrypt a given String. The formula of the encryption is
     *  substituting every character of the String with the next one in ASCII
     *  It prints the new characters
     * @param s The given String that will be encrypted
     */
    public static void encryption (String s) {
        char[] characters = new char[s.length()];
        for (int i = 0; i < s.length(); i++){
            characters[i] = (char)((int)(s.charAt(i)) + 1);
            System.out.print(characters[i]);}
    }
    /** Decrypt a given String. The formula of the encryption is
     *  substituting every character of the String with the next one in ASCII
     *  It prints the new characters
     * @param s The given String that will be decrypted
     */
    public static void decryption (String s) {
        char[] characters = new char[s.length()];
        for (int i = 0; i < s.length(); i++){
            characters[i] = (char)((int)(s.charAt(i)) - 1);
            System.out.print(characters[i]);}
    }
}

