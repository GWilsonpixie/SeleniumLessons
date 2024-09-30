package Odev;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_odev_09_Sep extends BaseDriver {

    @Test
   /* 6-soru
Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html
Fake Alerts'e tıklayınız.
Show modal dialog buttonuna tıklayınız.
Ok'a tıklayınız.
Alert kapanmalıdır.*/

    public void Test1() {

        driver.get("https://testpages.eviltester.com/styled/index.html");
        MyFunc.Bekle(1);

        WebElement fakealertBtn = driver.findElement(By.xpath("//a[@id='fakealerttest']"));
        fakealertBtn.click();
        MyFunc.Bekle(1);

        WebElement showModaltBtn = driver.findElement(By.xpath("//input[@class='styled-click-button' and @id='modaldialog']"));
        showModaltBtn.click();
        MyFunc.Bekle(1);

        WebElement okBtn = driver.findElement(By.xpath("//button[@id='dialog-ok']"));
        okBtn.click();


        BekleKapatKodu();


    }
}