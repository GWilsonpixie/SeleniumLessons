package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _03_IFrameOrnek extends BaseDriver {
    @Test

    public void Test1() {

        driver.get("https://demoqa.com/nestedframes");

        driver.switchTo().frame(0);  // dısardakı ilk framein içine gir

        driver.switchTo().frame(0); // icerdeki frame e girildi

        WebElement lblYazi = driver.findElement(By.id("//p[text()='Child Iframe']"));
        System.out.println("lblYazi.getText() = " + lblYazi.getText());

        driver.switchTo().parentFrame(); // bir geri gelmis oulurum, dısardaki frame in içindeyim
        System.out.println(driver.getPageSource()); // bulunduğum sayfanın html kodlarını yazdır

        driver.switchTo().parentFrame(); // anasayfaya gidildi
        //driver.switchTo().defaultContent();//anasayfaya gidildi diğer yol

        WebElement anaSayfaBaslik = driver.findElement(By.xpath("//h1[text()='Nested Frames']"));
        System.out.println("anaSayfaBaslik.getText() = " + anaSayfaBaslik.getText());


BekleKapatKodu();















    }


}
