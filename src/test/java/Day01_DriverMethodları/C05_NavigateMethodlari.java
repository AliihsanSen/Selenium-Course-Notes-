package Day01_DriverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com");
        /*
         Driver.navigate().to() ==> methodu sayfada ileri geri yapıcaksak kullanılır.
         driver.get() ==> methodu gibi bizi istediği url'e götürür.
         */

        driver.navigate().to("https://youtube.com");

        // Tekrar amazon sayfasına dönelim.
        driver.navigate().back();

        // Tekrar youtube sayfasına geri dönelim.
        driver.navigate().forward();

        // Youtube sayfasını yeniliyelim.
        Thread.sleep(3000); // Sayfayı yenilemesi için 3 sn beklemesini istedik.
        driver.navigate().refresh();

        // Sayfayı kapatalım.
        driver.close();





    }
}
