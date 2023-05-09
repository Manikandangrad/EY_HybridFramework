package day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        System.out.println(System.getProperty("user.dir"));
        prop.load(new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\day15\\global.properties"));
        System.out.println(prop.getProperty("env"));
    }
}
