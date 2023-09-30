package class27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2ConfigProperties {
    public static void main(String[] args) {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";
        String userName="Admin";
        String password="Hum@nhrm123";

        WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
        //going to navigate to the URL
        driver.get(url);
//Locate the text field
        WebElement userNameField=driver.findElement(By.id("textUsername"));
        //enter the text into the field
        userNameField.sendKeys(userName);

        WebElement passwordField=driver.findElement(By.id("textPassword"));
        passwordField.sendKeys(password);

        WebElement loginBtn=driver.findElement(By.id("btnLogin"));
        loginBtn.click();

    }
}
