package Day03_LocatersMethodları;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_XpathLocators {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //  https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //  2- Add Element butonuna basin
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        Thread.sleep(3000);

        //  Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton =driver.findElement(By.xpath("//*[text()='Delete']"));
        Thread.sleep(3000);

        if(deleteButton.isDisplayed()){
            System.out.println("Delete testi PASSED");
        }else {
            System.out.println("Delete testi FAILED");
        }

        //  Delete tusuna basin
        deleteButton.click();

        //  “Add/Remove Elements” yazisinin gorunur oldugunu test edin.
        WebElement expectedUser = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));

        if(expectedUser.isDisplayed()){
            System.out.println("ExpectedUser testi PASSED");
        }else {
            System.out.println("ExpectedUser testi FAILED");
        }

        //  Sayfayı kapatın.
        driver.quit();

    }
}
