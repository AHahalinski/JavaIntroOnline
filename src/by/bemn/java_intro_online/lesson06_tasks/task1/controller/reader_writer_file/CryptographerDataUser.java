package by.bemn.java_intro_online.lesson06_tasks.task1.controller.reader_writer_file;


import java.util.Random;

public class CryptographerDataUser {

    static byte[] encrypt(String dataUser) {
        byte key = (byte)(new Random().nextInt(128));
        byte[] encryptData = new byte[dataUser.length()+1];
        encryptData[0]=key;
        try {
            byte[] dataUserByte = dataUser.getBytes();
            for (int i = 1; i < dataUserByte.length; i++) {
                encryptData[i] = (byte) (dataUserByte[i-1]+key);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return encryptData;

    }

    static String decrypt(String encrypted) {
        byte[] decryptData = null;
        String decrypt = "";
        try {
            byte[] inStringEncryptedData = encrypted.getBytes();
            decryptData = new  byte[inStringEncryptedData.length];
            byte key = inStringEncryptedData[0];
            for (int i = 0; i < inStringEncryptedData.length; i++) {
                decryptData[i] = (byte)(inStringEncryptedData[i+1] - key);
            }
            decrypt = new String(decryptData);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return decrypt;
    }
}
