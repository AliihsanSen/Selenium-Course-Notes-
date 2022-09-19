package Day03_LocatersMethodları;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_GetMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // -Amazon sayfasına gidiniz
        driver.get("https://amazon.com");

        // -Arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        // -Arama kutusunun tagName'inin input olduğunu test ediniz
        String expectedTagName = "input";
        String actualTagName = aramaKutusu.getTagName();

        if (actualTagName.equals(expectedTagName)) {
            System.out.println("TagName Testi PASSEDD : " + actualTagName);
        } else {
            System.out.println("TagName Testi FAILED");
        }

        // -Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        String expectedAtributeName = "field-keywords";
        String actualAtributeName = aramaKutusu.getAttribute("name");

        if (actualAtributeName.equals(expectedTagName)) {
            System.out.println("Atribute testi PASSED : " + actualAtributeName);
        } else {
            System.out.println("Atribute testi FAILED");
        }

        // -Arama Kutusunun konumunu yazdırın.
        System.out.println("Arama kutusu konumu : "+ aramaKutusu.getLocation());

        // -Sayfayı kapatınız
        driver.quit();

    }
}
