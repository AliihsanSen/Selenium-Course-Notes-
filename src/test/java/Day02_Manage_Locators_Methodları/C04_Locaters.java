package Day02_Manage_Locators_Methodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Locaters {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");

        //Amazonda "Nutella" aratiniz

        /*
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        ==> Id unique oldugu icin sorunsuz calıstı.
         */


        /*
        WebElement aramaButonu=driver.findElement(By.id("nav-search-submit-button"));
        aramaButonu.click();
         */

        /*
        WebElement aramaKutusu=driver.findElement(By.name("field-keywords"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        ==> Name unique oldugu icin sorunsuz calıstı.
         */


        /*
        WebElement aramaKutusu=driver.findElement(By.className("nav-search-field "));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        ==> Bu locater çalismadi. Locator alırken gözümüzden kaçan detaylar olabilir.
            Aldığımız locator çalışmazsa alternatif locatorlar denemeliyiz.
         */

        /*
        WebElement aramaKutusu = driver.findElement(By.linkText("Sell products on Amazon"));
        aramaKutusu.click();
         */

        /*
        driver.findElement(By.partialLinkText("products on Amazon")).click();
        ==> a tag'ındaki link isminden istedigimiz bir parçayı locatorlar denemeliyiz.
         */


    }
}
