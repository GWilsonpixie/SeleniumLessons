package Gun09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionRightClickTest extends BaseDriver {

    @Test


    public void Test1(){


        driver.get("http://demoqa.com/buttons");

        WebElement rightClickBtn=driver.findElement(By.id("rightClickBtn"));

        Actions aksiyonlar=new Actions(driver);
new Actions(driver).contextClick(rightClickBtn).build().perform();


BekleKapatKodu();











    }
}
