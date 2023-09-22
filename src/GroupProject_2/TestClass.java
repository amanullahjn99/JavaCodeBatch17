package GroupProject_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*Provide Implementation for the diagram below. Then create a test class in which you need to create
Objects of ChromeDriver, FirefoxDrive and SafariDriver classes and see which methods available to them.
 */
public class TestClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https:www.google.com");
        Thread.sleep(2000);
        driver.getTitle();
        driver.close();

        WebDriver driver2=new EdgeDriver();
        driver2.get("https:www.amazon.com");
        Thread.sleep(2000);
        driver2.getTitle();
        driver2.close();

    }

}
