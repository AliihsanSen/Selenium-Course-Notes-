package Day01_DriverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 1. YOL
        // Amazon sayfasına gidiniz.
        driver.get("https://amazon.com");

        // Başlığın "Amazon" içerdiğini test ediniz.
        System.out.println(driver.getTitle().contains("Amazon")); // true

        // url'nin "amazon" içerdiğini test ediniz.
        System.out.println(driver.getCurrentUrl().contains("amazon")); // true

        // Sonrasında da sayfayı kapatınız.
        driver.close();

        /*
         2. YOL
        driver.get("https://amazon.com");
        String testTitle = driver.getTitle();
        String expectedTitle = "Amazon";

        if (testTitle.contains(expectedTitle)) {
            System.out.println(expectedTitle + " bulundu, Test PASSED");
        } else {
            System.out.println(expectedTitle + " bulunamadi, Test FAILED");
        }
        String actualURL = driver.getCurrentUrl();
        String expectedUrl = "Amazon";
        if (actualURL.contains(expectedUrl)) {
            System.out.println(expectedUrl + " icerir,Test PASSED");
        } else {
            System.out.println(expectedUrl + " bulunmadi.Test FAILED");
        }

         */


    }
}
