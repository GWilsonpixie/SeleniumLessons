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

public class _04_OdevWait extends BaseDriver {

    @Test
    public void Test1() {


        driver.get("https://demoqa.com/dynamic-properties");
        MyFunc.Bekle(2);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement visibleButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));

        Assert.assertTrue(visibleButton.isDisplayed());

        System.out.println("Buton görünür oldu.");

        BekleKapatKodu();
    }
}
