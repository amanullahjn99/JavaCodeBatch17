package GroupProject_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*Provide Implementation for the diagram below. Then create a test class in which you need to create
Objects of ChromeDriver, FirefoxDrive and EdgeDriver classes and see which methods available to them.
 */
public class TestClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver[] browsers={new EdgeDriver(),new FirefoxDriver(),new ChromeDriver()};
        for(WebDriver w:browsers) {
            w.manage().window().maximize();
            Thread.sleep(2000);
            w.navigate().to("https://www.facebook.com");
            Thread.sleep(2000);
            System.out.println(w.getTitle());
            Thread.sleep(2000);
            w.close();
        }

    }

}
