package Odev;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_odev_09_Sep extends BaseDriver {

/* 2-Soru
1) Bu siteye gidin. -> https://demo.applitools.com/
2) Username kısmına "ttechno@gmail.com" girin.
3) Password kısmına "techno123." girin.
4) "Sign in" buttonunan tıklayınız.
5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.*/

    @Test

    public void Test1 (){

        driver.get("https://demo.applitools.com/");

        MyFunc.Bekle(2);

        WebElement userName= driver.findElement(By.xpath("//input[@id='username' and @class='form-control']"));
        userName.sendKeys("ttechno@gmail.com");
        MyFunc.Bekle(2);

        WebElement password= driver.findElement(By.xpath("//input[@id='password' and @class='form-control']"));
        password.sendKeys("techno123");
        MyFunc.Bekle(2);

        WebElement signInBtn= driver.findElement(By.xpath("//a[@id='log-in']"));
        signInBtn.click();
        MyFunc.Bekle(2);

        String Text= driver.findElement(By.xpath("//h6[@id='time']")).getText();
        Assert.assertTrue("Doğrulanamadı",Text.contains("Your nearest branch closes in"));

BekleKapatKodu();

    }

}
