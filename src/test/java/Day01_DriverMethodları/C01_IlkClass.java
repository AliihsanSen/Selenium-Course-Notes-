package Day01_DriverMethodları;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {

    public static void main(String[] args) {

        /*
        ==> En temel haliyle bir otomasyon yapmak için Class'ımıza otomasyon için gerekli
        olan webdriver'in yerini göstermemiz gerekir.

        ==> Bunun için java kutuphanesinden System.setProperty() method'unu kullanırız ve
        method'un içine ilk olarak driver'i yazarız.

        ==> İkinci olarak onun fiziki yolunu kopyalarız.
         */

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        System.out.println("Actual Title : "+ driver.getTitle()); // Gidilen sitenin başlığını yazdırır.

        System.out.println("Actual url : "+ driver.getCurrentUrl()); // Gidilen sayfanın url'sini getirir.

        System.out.println(driver.getPageSource()); // Gidilen sayfanın kodlarını yazdırır.
    }
}
