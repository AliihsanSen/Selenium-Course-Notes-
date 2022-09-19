package Day01_DriverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_Tekrar_IlkYol {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");

        // Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle()); // Amazon.com. Spend less. Smile more.

        // Sayfa basliginin "Amazon" icerdigini test edin
        System.out.println(driver.getTitle().contains("Amazon")); // true

        // Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl()); // https://www.amazon.com/

        // Sayfa url'inin "amazon" icerdigini test edin.
        System.out.println(driver.getCurrentUrl().contains("amazon")); // true

        // Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle()); // CDwindow-B8CE3B30B82A30BF6C07FBAD426D6983

        // Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        System.out.println(driver.getPageSource().contains("Gateway")); // true

        // Sayfayi kapatin.
        driver.close();
    }
}
