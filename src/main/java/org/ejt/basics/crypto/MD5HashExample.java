package org.ejt.basics.crypto;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * Created by http://easyjavatutorials.in on 1/1/17.
 * <p>
 * A place to find easy java tutorials written by developers for developers.
 * <p>
 * Released under :
 * <p>
 * Apache License 2.0: http://www.apache.org/licenses/LICENSE-2.0.txt
 *
 * @Intent
 */
public class MD5HashExample {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String message = "This is some string for which MD5 hash needs to be calculated";
        byte[] bytesOfMessage = message.getBytes();

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] thedigest = md.digest(bytesOfMessage);

        System.out.println("Generated message digest length is "+thedigest.length);
        System.out.println("Generated message digest is "+Base64.getEncoder().encodeToString(thedigest));
    }
}
