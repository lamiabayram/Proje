import okhttp3.internal.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;
public class proje {

    //static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.n11.com/");



        //login

        driver.findElement(By.className("btnSignIn")).click();
        driver.findElement(By.id("email")).sendKeys("lamiabayram@gmail.com");
        driver.findElement(By.id("password")).sendKeys("hlamia6991");
        driver.findElement(By.id("loginButton")).click();

        //arama

        driver.findElement(By.id("searchData")).sendKeys("bilgisayar");
        driver.findElement(By.className("searchBtn")).click();

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 6000);");

        //ikinci sayfaya git

        driver.findElement(By.xpath("//*[@id=\"contentListing\"]/div/div/div[2]/div[4]/a[2]")).click();


        //ürün seç

        driver.findElement(By.className("productName")).click();


        //sepete ekle


        driver.findElement(By.xpath("//*[@id=\"contentProDetail\"]/div/div[3]/div[2]/div[3]/div[3]/a[2]")).click();


        //sepete git
        driver.findElement(By.className("myBasket")).click();


        //Sepetteki ürün sayısını arttır
        driver.findElement(By.xpath("//*[@id=\"newCheckout\"]/div/div[1]/div[2]/div[1]/section/table[2]/tbody/tr/td[3]/div[1]/div/span[1]")).click();


        //Sepetten sil
        driver.findElement(By.xpath("//*[@id=\"newCheckout\"]/div/div[1]/div[2]/div[1]/div/section/table[2]/tbody/tr/td[1]/div[3]/div[2]/span[1]"));

        Thread.sleep(5000);
        driver.quit();




    }


}