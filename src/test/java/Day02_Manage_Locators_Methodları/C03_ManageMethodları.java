package Day02_Manage_Locators_Methodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ManageMethodları {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
        driver.quit();

        /*
        İleride wait konusunu daha geniş olarak ele alacağız.
        Bir sayfa açılırken ilk başta sayfanın içerisinde bulunan elementlere göre
        bir yükleme süresine ihtiyaç vardır veya bir web elementin kullanılabilmesi için
        zamana ihtiyac olabilir.
        implicitlyWait() ==> bize sayfanın yüklenmesi ve sayfadaki elementlere ulaşım için
        beklenecek maksimum süreyi belirleme olanağı tanır.
         */


    }
}
