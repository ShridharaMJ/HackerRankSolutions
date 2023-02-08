package com.practice.strings;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class CreateFile {

    public static void main(String[] args) throws IOException {
        String property = System.getProperty("user.dir");
        System.out.println(property);
        Path path = Paths.get(property + "/target/config.properties");
        Files.createFile(path);
        Properties properties=new Properties();
        InputStream inputStream = Files.newInputStream(path);
        properties.load(inputStream);
        properties.setProperty("browser","chrome");
        properties.setProperty("browser version","103.89.72");
        properties.setProperty("browser version","103.89.72");
        properties.setProperty("OS",System.getProperty("os.name"));
        inputStream.close();

    }

}
