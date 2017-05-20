package org.ejt.basics.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/**
 * Created by http://easyjavatutorials.in on 1/2/17.
 * <p>
 * A place to find easy java tutorials written by developers for developers.
 * <p>
 * Released under :
 * <p>
 * Apache License 2.0: http://www.apache.org/licenses/LICENSE-2.0.txt
 *
 * @Intent
 */
public class BeanInspection {

    private static MessageDigest md;
    private static Base64.Encoder encoder;

    static {
        encoder = Base64.getEncoder();
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        POJOBean pojoBean = new POJOBean();
        String classDef = signature(pojoBean);
        System.out.println("Class definition "+classDef);
        System.out.println("Generated Signature " + generateSignature(classDef.getBytes()));
    }

    public static String signature(Object object) {
        StringBuilder sb = new StringBuilder();
        List<Field> privateFields = new ArrayList<>();
        Field[] allFields = object.getClass().getDeclaredFields();
        for (Field field : allFields) {
            sb.append(field.getName() + "=" + field.getType()+"||");
        }

        Method[] allMethods = object.getClass().getDeclaredMethods();
        for (Method method : allMethods) {
            sb.append(method.getName() + "-");
        }
        return sb.toString();
    }

    private static String generateSignature(byte[] message) {
        return encoder.encodeToString(md.digest(message));
    }
}
