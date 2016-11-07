package org.ejt.basics.resources;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
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
public class WriteJavaProperties {
  public static void main(String[] args) {
    Properties prop = new Properties();
    OutputStream output = null;

    try {
      output = new FileOutputStream("appConfig.properties");
      prop.setProperty("propKey1", "propVal1");
      prop.setProperty("propKey2", "propVal2");
      // Stores property file in the root of the project.
      prop.store(output, "This is comment we need to add on property file.");
      System.out.println("Properties file written into file successfully.");
    } catch (IOException io) {
      io.printStackTrace();
    } finally {
      if (output != null) {
        try {
          output.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }

    }
  }
}
