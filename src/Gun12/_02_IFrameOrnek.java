package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _02_IFrameOrnek extends BaseDriver {
    @Test
    public void Test1() {


        driver.get("http://demo.automationtesting.in/Frames.html");
        MyFunc.Bekle(2);


        driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();

        // İframe'e geçiş yap
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Iframe with in an Iframe")));
        WebElement iframeElement = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
        iframeElement.click();

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@src='SingleFrame.html']")));

        WebElement txtBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
        txtBox.sendKeys("Merhaba");
        BekleKapatKodu();

// not bu sayfada problem var locator bulmuyor



















    }
}
