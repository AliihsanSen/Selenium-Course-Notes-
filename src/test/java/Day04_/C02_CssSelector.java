package Day04_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_CssSelector {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //   a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");

        //   b. Locate email textbox
        WebElement email = driver.findElement(By.cssSelector("#session_email"));

        //   c. Locate password textbox ve
        WebElement password = driver.findElement(By.cssSelector("#session_password"));

        //   d. Locate signin button
        WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit']"));

        //   e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //      i. Username : testtechproed@gmail.com
        email.sendKeys("testtechproed@gmail.com");

        //      ii. Password : Test1234!
        password.sendKeys("Test1234!");

        //      iii. sign in düğmesini tıklayın
        signInButton.click();

        //   f. Sayfayı kapatınız.
        driver.quit();


    }
}
