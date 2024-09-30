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

public class _02_OdevWait extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://demoqa.com/browser-windows");
        MyFunc.Bekle(2);

        WebElement alertsButton = driver.findElement(By.xpath("//span[text()='Alerts']"));
        alertsButton.click();
        MyFunc.Bekle(2);

        WebElement clickMeButton = driver.findElement(By.id("timerAlertButton"));
        clickMeButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        String alertText = driver.switchTo().alert().getText();
        Assert.assertEquals("This alert appeared after 5 seconds", alertText);

        driver.switchTo().alert().accept();

        BekleKapatKodu();
    }
}
