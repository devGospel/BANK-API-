package utils;

import java.util.Random;


public class Generator {
    public static String generateUUID() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder uuid = new StringBuilder(30);

        for(int i = 0; i < 30; i++) {
            int index = random.nextInt(characters.length());
            uuid.append(characters.charAt(index));
        }
        return uuid.toString();      
    }
    
    public static String generateAccountNumber() {
        String characters = "0123456789";
        Random random = new Random();
        StringBuilder accountNumber = new StringBuilder(10);

        for(int i = 0; i < 10; i++) {
            int index = random.nextInt(characters.length());
            accountNumber.append(characters.charAt(index));
        }
        return accountNumber.toString();

    }

    public static String generateAccountId() {
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder accountId = new StringBuilder(10);

        for(int i = 0; i < 16; i++) {
            int index = random.nextInt(characters.length());
            accountId.append(characters.charAt(index));
        }
        return accountId.toString();
        


    }

}