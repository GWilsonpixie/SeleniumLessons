package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_Soru extends BaseDriver {
    @Test


    public void Test1() {

//    Senaryo:
//    Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
//    Calculator'e tıklayınız.
//    İlk input'a herhangi bir sayı giriniz.
//    İkinci input'a herhangi bir sayı giriniz.
//    Calculate button'una tıklayınız.
//    Sonucu yazdırınız


        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(2);


        WebElement simpleCalculator= driver.findElement(By.cssSelector("a#calculatetest"));
        simpleCalculator.click();
        MyFunc.Bekle(2);

        WebElement inputButton1 = driver.findElement(By.cssSelector("input#number1"));
        inputButton1.sendKeys("6");
        MyFunc.Bekle(2);

        WebElement inputButton2 = driver.findElement(By.cssSelector("input#number2"));
        inputButton2.sendKeys("3");
        MyFunc.Bekle(2);


        WebElement calculateButton = driver.findElement(By.cssSelector("[value='Calculate']"));
        calculateButton.click();
        MyFunc.Bekle(2);


        WebElement sonucElementi = driver.findElement(By.id("answer"));
        String sonuc = sonucElementi.getText();
        System.out.println("Sonuç: " + sonuc);

        BekleKapatKodu();

// To Do > Assert.assetTrue(); sonucun doğruluğunu kontrol edin

    }
}



