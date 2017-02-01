package github.com.yadavsudhir405.spring.integrations.examples.file.example;

import java.io.File;

/**
 * @author sudhir
 *         Date:1/2/17
 *         Time:3:21 PM
 *         Project:file-integratin-example
 */
public class Handler {
    public String handleString(String input) {
        System.out.println("Copying text: " + input);
        return input.toUpperCase();
    }

    public File handleFile(File input) {
        System.out.println("Copying file: " + input.getAbsolutePath());
        return input;
    }

    public byte[] handleBytes(byte[] input) {
        System.out.println("Copying " + input.length + " bytes ...");
        return new String(input).toUpperCase().getBytes();
    }
}
