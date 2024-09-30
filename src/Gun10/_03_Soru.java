package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _03_Soru extends BaseDriver {

    @Test
    // https://www.mediamarkt.com.tr/ sayfasına gidiniz.
    // Tüm Kategoriler -> Beyaz Eşya -> Kombiler click
    // tıklatma işleminden sonra URL de
    // kombi kelimesinin geçtiğini doğrulayın.

    public void Test1() {

        driver.get("https://www.mediamarkt.com.tr/");
        Actions actions = new Actions(driver);

        WebElement tumKategoriler = driver.findElement(By.xpath("//button[@id='mms-app-header-category-button']"));
        actions.click(tumKategoriler).build().perform();
        MyFunc.Bekle(2);

        WebElement beyazEsyaBtn = driver.findElement(By.id("category-197"));
        actions.moveToElement(beyazEsyaBtn).build().perform();
        MyFunc.Bekle(2);

        // Corrected XPath for 'Kombiler'
        WebElement kombiler = driver.findElement(By.xpath("//a[contains(@href, 'kombiler')]"));
        actions.click(kombiler).build().perform();
        MyFunc.Bekle(2);

        Assert.assertTrue("URL'de kombi kelimesi bulunamadı", driver.getCurrentUrl().contains("kombi"));

        BekleKapatKodu();
    }
}








