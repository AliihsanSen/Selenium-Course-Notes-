package Day02_Manage_Locators_Methodları;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_Managemethodları {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        // Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Pencere konumu : " + driver.manage().window().getPosition()); // Sayfanın konumunu istedigimiz sekilde ayarlar.
        System.out.println("Pencere olculeri " + driver.manage().window().getSize()); // Sayfanın olculerini istedigimiz sekilde ayarlar.

        // Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(20,20));
        driver.manage().window().setSize(new Dimension(600,300));

        // Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("Yeni Pencere konumu : " + driver.manage().window().getPosition());
        System.out.println("Yeni Pencere olculeri " + driver.manage().window().getSize());

        // 8. Sayfayi kapatin
        driver.close();
    }
}
