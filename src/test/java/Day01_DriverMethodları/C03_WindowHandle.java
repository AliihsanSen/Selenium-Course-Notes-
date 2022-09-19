package Day01_DriverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");

        System.out.println(driver.getWindowHandle()); // CDwindow-C5EE94F1F64373C23E77021D80DD5D05
        // Farklı pencereler arasında gezinebilmek için getWindowHandle() method'unu kullanırız.


    }
}
