package Odev_11_Sep;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _02_Odev extends BaseDriver {
    @Test
    public void Test2() {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        Actions actions = new Actions(driver);
        MyFunc.Bekle(1);

        List<WebElement> ogrenciler = driver.findElements(By.xpath("//ul[@id='allItems']/li"));

        List<WebElement> kutular = driver.findElements(By.xpath("//div[@class='dragDropSmallBox']"));

        int currentBox = 0; // Mevcut kutunun index'i


        for (WebElement ogrenci : ogrenciler) {

            while (currentBox < kutular.size()) {
                WebElement kutu = kutular.get(currentBox);


                if (kutu.findElements(By.tagName("li")).size() == 0) {
                    actions.dragAndDrop(ogrenci, kutu).build().perform();
                    MyFunc.Bekle(1);
                    break;
                } else {

                    currentBox++;
                }
            }


            if (currentBox >= kutular.size()) {
                System.out.println("Tüm kutular doldu.");
                break;
            }
        }

        BekleKapatKodu();
    }
}


















