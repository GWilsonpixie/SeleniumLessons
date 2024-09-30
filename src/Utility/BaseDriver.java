package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class BaseDriver {

    public static WebDriver driver ;//tearStart ingilizcesi
    public static Actions actions;
    public static WebDriverWait wait;
    public static JavascriptExecutor js;

    static // tear start
     {

       driver=new ChromeDriver();
       wait=new WebDriverWait(driver, Duration.ofSeconds(20));
       js=(JavascriptExecutor)driver;

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20sn mühlet:; sayfayı yükleme süresi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // 20 sn mühlet : elementi bulma mühleti





    }
     public static void BekleKapatKodu()  { // tearDown ingilizcesi


        MyFunc.Bekle(5);
        driver.quit();


     }


}
