package org.ejt.basics.resources;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/**
 * Reading java properties from classPath.
 *
 * Created by http://easyjavatutorials.in on 11/6/16.
 * <p>
 * A place to find easy java tutorials written by developers for developers.
 * <p>
 * Released under :
 * <p>
 * Apache License 2.0: http://www.apache.org/licenses/LICENSE-2.0.txt
 * <p>
 * Happy Java Coding.
 */
public class ReadJavaProperties {
  public static void main(String[] args) {
    Properties prop = new Properties();

    try {
      prop.load(
          ReadJavaProperties.class.getClassLoader().getResourceAsStream("appConfig.properties"));
      System.out.println("Loaded properties size " + prop.size());
      System.out.println("Loaded properties " + prop);
    } catch (IOException io) {
      io.printStackTrace();
    }
  }
}
