package Odev_11_Sep;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.security.PublicKey;
import java.util.List;

public class _03_Odev extends BaseDriver {
    @Test

    public void Test1(){

         driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
       MyFunc.Bekle(2);

        List<WebElement> cities = driver.findElements(By.cssSelector("#dhtmlgoodies_dragDropContainer .dragableBox"));

        List<WebElement> countries = driver.findElements(By.cssSelector(".dragDropSmallBox"));

        Actions action = new Actions(driver);
        MyFunc.Bekle(2);

        for (WebElement city : cities) {
                for (WebElement country : countries) {
                      if (city.getText().contains(country.getText())) {
                                action.clickAndHold(city).moveToElement(country).release().perform();
                 MyFunc.Bekle(5);
                }
            }
        }

           driver.quit();
    }
}


