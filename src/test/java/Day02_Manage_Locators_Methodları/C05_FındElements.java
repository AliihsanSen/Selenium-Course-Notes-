package Day02_Manage_Locators_Methodları;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_FındElements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayfasına gidiniz.
        driver.get("https://amazon.com");

        // Amazon sayfasındaki tag'ları link(a) olanların sayısını yazdırın.
        List<WebElement> tag = driver.findElements(By.tagName("a"));
        System.out.println("A tag'ının sayısı :" + tag.size());

        driver.quit();


    }
}
