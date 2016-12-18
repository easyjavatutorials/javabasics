package org.ejt.basics.resources;

import java.util.Properties;
import java.util.Set;

/**
 * Created by http://easyjavatutorials.in on 12/18/16.
 * <p>
 * A place to find easy java tutorials written by developers for developers.
 * <p>
 * Released under :
 * <p>
 * Apache License 2.0: http://www.apache.org/licenses/LICENSE-2.0.txt
 *
 * @Intent
 */
public class FilterJavaProperties {
    public static void main(String[] args) {
        //Keys start pattern for which properties needs to be filtered out.
        String prefixPattern = "java";

        Properties properties = System.getProperties();
        Properties filteredProperties = new Properties();
        String stringKey;
        Set<Object> propertyKeys = properties.keySet();
        for (Object key : propertyKeys) {
            stringKey = (String) key;
            if (stringKey.startsWith(prefixPattern)) {
                filteredProperties.put(stringKey, properties.getProperty(stringKey));
            }
        }
        System.out.println("Total System properties "+properties.size());
        System.out.println("Filtered properties starting with java " +filteredProperties.size());
        System.out.println("Filtered Properties "+filteredProperties);
    }
}
