package class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
        // located the file
       // String path="C:\\Users\\ahmad\\IdeaProjects\\Main\\Files\\Config.properties";
        String path=System.getProperty(("user.dir"))+"\\Files\\Config.properties";//if we want to share with someone else
        // Moves the file from permanent storage into the RAM
        FileInputStream fis=new FileInputStream(path);
        //That one class/software that will assist us to read Write data from the file.
        Properties properties=new Properties();
        //Loads the data from txt file into the properties object
        properties.load(fis);
        System.out.println(properties.get("userName"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URL"));
// this line here gives the location of your intellij project on your computer
        System.out.println(System.getProperty("user.dir"));



    }
}
