package class20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class E5SelenumProfessional {
    public static void main(String[] args) throws InterruptedException {
        WebDriver[] arr={new ChromeDriver(),new EdgeDriver()};
        for(WebDriver d:arr){
            d.manage().window().maximize();
            Thread.sleep(2000);
            d.navigate().to("https://google.com");
            System.out.println(d.getTitle());
            Thread.sleep(2000);
            d.navigate().to("https://facebook.com");
            System.out.println(d.getTitle());
            Thread.sleep(2000);
            d.navigate().to("https://amazon.com");
            System.out.println(d.getTitle());
            Thread.sleep(2000);
            d.navigate().back();
            d.close();
        }

    }
}
