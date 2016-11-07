package org.ejt.basics.resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
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
public class ReadFileProperties {
  public static void main(String[] args) {
    Properties prop = new Properties();
    InputStream input = null;
    try {
      input = new FileInputStream("C:/appConfig.properties");
      prop.load(input);
      System.out.println("Loaded properties size " + prop.size());
      System.out.println("Loaded properties " + prop);
    } catch (IOException io) {
      io.printStackTrace();
    }
  }
}
