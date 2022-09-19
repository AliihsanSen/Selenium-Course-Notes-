package Day03_LocatersMethodları;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C03_WebElementMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a. web sayfasına gidin. https://www. amazon.com/
        driver.get("https://www.amazon.com");

        // b. Search(ara) “city bike”
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

        // c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaSonucu = driver.findElements(By.className("sg-col-inner"));
        String sonucYazisi = aramaSonucu.get(0).getText();
        System.out.println(sonucYazisi);

        // d. Sadece sonuc sayısını yazdırınız.
        String[] arr = sonucYazisi.split(" ");
        System.out.println("Sonuc olarak toplam " + arr[2] + " arama sonucu bulunmaktadır.");

        // e. Sonuc sayısını LAMBDA ile yazdırın.
        Arrays.stream(sonucYazisi.split(" ")).
                limit(3).skip(2).
                forEach(t -> System.out.println("Sonuc olarak toplam : " + t + " tane bulunmaktadır."));

        // f. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        List<WebElement> ilkResim = driver.findElements(By.className("s-image"));
        WebElement ilkResimWE = ilkResim.get(0);
        ilkResimWE.click();

        // g. Sayfayı kapatınız.
        driver.quit();

    }
}
