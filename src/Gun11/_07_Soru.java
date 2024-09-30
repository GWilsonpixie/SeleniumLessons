package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _07_Soru extends BaseDriver {

    @Test
    public void Test1() {

        /*
    Senaryo:
    https://google.com/ da selenium kelimesini aratınız.
    ilk çıkan sonuca tıklatıp,(selenium)
    çıkan URL yi ekrana yazdırınız.
    Beklenen url https://www.selenium.dev/  olduğunu doğrulayınız
 */

driver.get("https://google.com/");
        MyFunc.Bekle(2);

        //Bazen consent uyarı veriyor eğer uyarı sayfası cıkarsa
        //bulursan tıklat bulamazsan geç demek findElements s olunca List ekle
        List<WebElement> acceptAll=driver.findElements(By.id("L2AGlB"));
        if (acceptAll.size()>0)
            acceptAll.get(0).click();

        WebElement searchBox= driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium"+ Keys.ENTER); // \n \r
//
      //  wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
        //WebElement srcBtn= driver.findElement(By.name("btnK"));
        //srcBtn.click();

        WebElement seleniumLink= driver.findElement(By.xpath("//cite[text()='https://www.selenium.dev']"));
        seleniumLink.click();

        wait.until(ExpectedConditions.urlToBe("https://www.selenium.dev/"));
        Assert.assertTrue("Sayfaya ulasilamadı", driver.getCurrentUrl().equalsIgnoreCase("https://www.selenium.dev/"));


        BekleKapatKodu();











    }
}
