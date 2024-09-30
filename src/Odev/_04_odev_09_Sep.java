package Odev;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_odev_09_Sep extends BaseDriver {

    @Test
/*4-soru
Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
Calculate'e tıklayınız.
İlk input'a herhangi bir sayı giriniz.
İkinci input'a herhangi bir sayı giriniz.
Calculate button'una tıklayınız.
Sonucu alınız.
Sonucu yazdırınız.*/


    public void Test1(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(1);

        WebElement calculator= driver.findElement(By.xpath("//a[@id='calculatetest']"));
        calculator.click();
        MyFunc.Bekle(1);

        WebElement label1= driver.findElement(By.xpath("//input[@type='text' and @id='number1' ]"));
        label1.sendKeys("6");
        MyFunc.Bekle(1);

        WebElement label2= driver.findElement(By.xpath("//input[@type='text' and @id='number2' ]"));
        label2.sendKeys("5");
        MyFunc.Bekle(1);

        WebElement clickBtn= driver.findElement(By.xpath("//input[@class='styled-click-button' ]"));
        clickBtn.click();
        MyFunc.Bekle(1);
        
        WebElement sonucElement= driver.findElement(By.xpath("//p[contains(text(), 'Answer ')]"));
        String sonuc=sonucElement.getText();
        System.out.println("sonuc = " + sonuc);

BekleKapatKodu();

    }
}
