package class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*@here Create a property file to store following configurations:
browser=chrome
url=https://facebook.com
username
password
Read file and extract values of browser & url
   */
public class HOMEWork {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\ahmad\\IdeaProjects\\Main\\Files\\PropertyFIle_HW.properties";
        FileInputStream fis = new FileInputStream(path);
        Properties load1 = new Properties();
        load1.load(fis);
        System.out.println(load1.getProperty("Browser"));
        System.out.println(load1.getProperty("URL"));
        System.out.println(load1.getProperty("username"));
        System.out.println(load1.getProperty("password"));


    }

}
