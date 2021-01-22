package WorkWithServer;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Encoder {
    private final byte[] _key = {0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16};

    public static IvParameterSpec generateIv() {
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);
        return new IvParameterSpec(iv);
    }
    public byte[] Encryption(String message) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, InvalidAlgorithmParameterException {
        IvParameterSpec ivParameterSpec = generateIv();
        byte[] res = new byte[message.getBytes().length+ivParameterSpec.getIV().length];
        for(int i= 0;i<ivParameterSpec.getIV().length;i++){
            res[i]=ivParameterSpec.getIV()[i];
        }
        Cipher cipher = Cipher.getInstance("AES");
        Key key = new SecretKeySpec(_key, "AES");
        cipher.init(Cipher.ENCRYPT_MODE, key,ivParameterSpec);
        for(int i= 16;i<res.length;i++){
            res[i]=cipher.doFinal(message.getBytes())[i-16];
        }
        return res;
    }

    public String Decryption(byte[] message) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES");
        byte[] ivParameterSpec =  new byte[16];
        byte[] ms =  new byte[message.length-16];
        for(int i= 0;i<16;i++){
            ivParameterSpec[i]=message[i];
        }
        for(int i= 16;i<message.length;i++){
            ms[i]=message[i];
        }
        IvParameterSpec  iv =  new IvParameterSpec(ivParameterSpec);
        Key key = new SecretKeySpec(_key, "AES");
        cipher.init(Cipher.DECRYPT_MODE, key,iv);
        return new String(cipher.doFinal(message));
    }
}
