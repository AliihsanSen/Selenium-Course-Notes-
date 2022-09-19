package Day03_LocatersMethodları;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_SinifCalismasi {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        // b. Sign in butonuna basin
        WebElement signInButton = driver.findElement(By.id("sign-in"));
        signInButton.click();

        // c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextbox = driver.findElement(By.id("session_email"));
        WebElement password = driver.findElement(By.id("session_password"));
        WebElement signin = driver.findElement(By.name("commit"));

        // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!
        emailTextbox.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signin.click();

        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement expectedUser = driver.findElement(By.className("navbar-text"));
        if (expectedUser.isDisplayed()) {
            System.out.println("Expected User testi PASSED = " + expectedUser.getText());
        } else { // Bir web elementin üzerindeki yazıyı konsoldo yazdırabilmek için get Text() methodu kullanılır.
            System.out.println("Expected User testi FAILED");
        }

        String expectedUserYazisi = "testtechproed@gmail.com";
        String actualUserYazisi = expectedUser.getText();
        if (actualUserYazisi.equals(expectedUserYazisi)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }

        // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addresses = driver.findElement(By.linkText("Addresses"));
        WebElement signOut = driver.findElement(By.linkText("Sign out"));

        if (addresses.isDisplayed()) {
            System.out.println("Adresses TESTİ PASSED");
        } else {
            System.out.println("Adresses Testi FAILED");
        }

        if (signOut.isDisplayed()) {
            System.out.println("SignOut TESTİ PASSED");
        } else {
            System.out.println("SignOut Testi FAILED");
        }

        // 3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayısı = " + linklerListesi.size());

        // 4. Linkleri yazdırın.
        for (WebElement each : linklerListesi) {
            System.out.println("Linkler : " + each.getText());
        }

        // 5. Linkleri LAMBDA ile yazdırın.
        linklerListesi.stream().forEach(k -> System.out.println(k.getText()));

        // 6. Sayfayı kapatın.
        driver.quit();

    }
}
