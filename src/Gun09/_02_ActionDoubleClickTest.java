package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionDoubleClickTest extends BaseDriver {

    @Test

public void Test1(){


        driver.get("http://demoqa.com/buttons");

        WebElement btnClick= driver.findElement(By.id("doubleClickBtn"));
        MyFunc.Bekle(1);

        Actions aksiyonlar=new Actions(driver);

        new Actions(driver).doubleClick(btnClick).build().perform();




BekleKapatKodu();





    }





}
