package Day01_DriverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Amazon sayfasına gidiniz
        driver.get("https://amazon.com");

        // Kaynak kodlari içinde "Gateway" kelimesinin olduğunu test ediniz.

        // 1 . YOL
        System.out.println(driver.getPageSource().contains("gateway")); // True

        // 2 . YOL
        String istenenKelime = "Gatewayasas";
        if (driver.getPageSource().contains(istenenKelime)) {
            System.out.println("PageSourse testi PASSED");
        } else {
            System.out.println("PageSourse testi FAILED");
        }

        driver.close(); // Sayfayı kapatır.
        // driver.quit(); ==> Birden fazla sayfa varsa hepsini kapatır.

    }
}
