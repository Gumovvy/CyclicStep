package com.gmv.cyclicstep;

import java.io.*;
import java.util.Properties;

/**
 * Created by gumovvy on 19.11.14.
 */
public class Main {

    public static void main(String[] args) {
        //Read from file.
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

        System.out.println("Try: " + prop.getProperty("hello"));

        //Write to file

        try {
            OutputStream output = new FileOutputStream(fileName);
            prop.setProperty("AddedInfo", "Added Info");
            prop.store(output, null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
