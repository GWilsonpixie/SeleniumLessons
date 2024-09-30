package Odev_11_Sep;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_OdevWait extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://demoqa.com/dynamic-properties");
        MyFunc.Bekle(2);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement enableButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));

        Assert.assertTrue(enableButton.isEnabled());

        System.out.println("Buton enable oldu.");

        BekleKapatKodu();
    }
}
