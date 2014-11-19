package com.gmv.cyclicstep;

import java.io.*;
import java.util.Properties;

/**
 * Created by gumovvy on 19.11.14.
 */

public class SetupStringsInGUI {

    public String setStrings(String s) {
        Properties prop = new Properties();
        String fileName = "config.properties";

        try {

            InputStream input = new FileInputStream(fileName);
            prop.load(input);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop.getProperty(s);
    }
}
