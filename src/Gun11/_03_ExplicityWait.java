package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_ExplicityWait extends BaseDriver {

    @Test

    public void Test1() {


        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");


        WebElement btn= driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        btn.click();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBe(By.xpath("//*[text()='WebDriver']"),"WebDriver"));
        //text i WebDriver olan elementin görünen yazısı "WebDriver" olana kadar (20sn) bekle demek be komut

        WebElement demoMsj= driver.findElement(By.xpath("//*[text()='WebDriver']"));
        System.out.println("demoMsj.getText() = " + demoMsj.getText());






        BekleKapatKodu();








    }


}
