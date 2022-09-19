package Day04_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TestCase {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        // 2- Add Element butonuna basin
        // 3- 10 kez Add element butonuna basildigini test edini
        // 4- Delete butonu gorunmeyene kadar basiniz
        // 5- Delete butonunun gorunmedigini test ediniz
        // 6- Sayfayi Kapatiniz

    }
}
