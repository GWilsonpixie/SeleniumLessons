package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionHoverTest extends BaseDriver {

    @Test

    public void Test1() {

        driver.get("https://www.hepsiburada.com/");

        WebElement element =driver.findElement(By.xpath("//span[text()='Moda']"));

   new Actions(driver).moveToElement(element).build().perform();

   // yada

   //Actions aksiyonlar=new Actions(driver);
   //     Action aksiyon=aksiyonlar.moveToElement(element).build();
   //     aksiyon.perform();
   //     MyFunc.Bekle(2);


BekleKapatKodu();


    }
}
