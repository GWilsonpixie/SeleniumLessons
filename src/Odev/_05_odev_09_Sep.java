package Odev;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_odev_09_Sep extends BaseDriver {

    @Test
/*5-soru
Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
Fake Alerts' tıklayınız.
Show Alert Box'a tıklayınız.
Ok'a tıklayınız.
Alert kapanmalıdır.*/

    public void Test1(){

        driver.get("https://testpages.eviltester.com/styled/index.html");
        MyFunc.Bekle(1);

        WebElement alertBtn= driver.findElement(By.xpath("//a[@id='fakealerttest']"));
        alertBtn.click();
        MyFunc.Bekle(1);

        WebElement showFakeBoxBtn= driver.findElement(By.xpath("//input[@class='styled-click-button' and @id='fakealert' ]"));
        showFakeBoxBtn.click();
        MyFunc.Bekle(1);

        WebElement okBtn= driver.findElement(By.xpath("//button[@id='dialog-ok' ]"));
        okBtn.click();
        MyFunc.Bekle(1);

BekleKapatKodu();

    }

}
