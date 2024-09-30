package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _02_ImplicityWait extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // find elements icin mühlet verme kodu

        WebElement btn= driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        btn.click();


        WebElement msj= driver.findElement(By.xpath("//*[text()='WebDriver']"));
        System.out.println("msj.getText() = " + msj.getText());

        BekleKapatKodu();


        























    }
}
