package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _06_Soru extends BaseDriver {




    @Test

    public void Test1() {

/*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */


driver.get("https://www.demoblaze.com/index.html");
        MyFunc.Bekle(2);

        WebElement elementSamsung= driver.findElement(By.linkText("Samsung galaxy s6"));
        elementSamsung.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add to cart']")));

        WebElement btnClick= driver.findElement(By.xpath("//a[text()='Add to cart']"));
        btnClick.click();

        wait.until(ExpectedConditions.alertIsPresent()); // alert gözükene kadar bekle

        driver.switchTo().alert().accept();

        WebElement productBtn= driver.findElement(By.id("nava"));
        productBtn.click();

        Assert.assertTrue("Ana Sayfaya dönülemedi" , driver.getCurrentUrl().equalsIgnoreCase("https://www.demoblaze.com/index.html"));





BekleKapatKodu();




    }
}
