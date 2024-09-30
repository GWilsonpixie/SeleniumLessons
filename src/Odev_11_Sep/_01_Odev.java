package Odev_11_Sep;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _01_Odev extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        Actions actions = new Actions(driver);
        MyFunc.Bekle(1);

        List<WebElement> sehirler = driver.findElements(By.xpath("//div[starts-with(@id,'a')]"));

        List<WebElement> ulkeler = driver.findElements(By.xpath("//ul[starts-with(@id,'box')]"));

        for (WebElement sehir : sehirler) {
            String sehirName = sehir.getText();

            for (WebElement ulke : ulkeler) {
                String ulkeName = ulke.getText();


                if (isCityInCountry(sehirName, ulkeName).equals("Doğru")) {

                    actions.dragAndDrop(sehir, ulke).build().perform();
                    MyFunc.Bekle(2);
                    BekleKapatKodu();
                }
            }
        }

    }

    // Şehir ve ülke eşleşmesi için metod
    public String isCityInCountry(String sehirName, String ulkeName) {
        if (sehirName.equals("Oslo") && ulkeName.equals("Norway")) return "Doğru";
        if (sehirName.equals("Stockholm") && ulkeName.equals("Sweden")) return "Doğru";
        if (sehirName.equals("Madrid") && ulkeName.equals("Spain")) return "Doğru";
        if (sehirName.equals("London") && ulkeName.equals("UK")) return "Doğru";
        if (sehirName.equals("Athens") && ulkeName.equals("Greece")) return "Doğru";
        if (sehirName.equals("Rome") && ulkeName.equals("Italy")) return "Doğru";
        if (sehirName.equals("Washington") && ulkeName.equals("USA")) return "Doğru";
        if (sehirName.equals("Kuala Lumpur") && ulkeName.equals("Malaysia")) return "Doğru";
        if (sehirName.equals("New Delhi") && ulkeName.equals("India")) return "Doğru";
        if (sehirName.equals("Santiago") && ulkeName.equals("Chile")) return "Doğru";
        if (sehirName.equals("Copenhagen") && ulkeName.equals("Denmark")) return "Doğru";
        if (sehirName.equals("Hanoi") && ulkeName.equals("Vietnam")) return "Doğru";
        if (sehirName.equals("Vienna") && ulkeName.equals("Austria")) return "Doğru";
        if (sehirName.equals("Paris") && ulkeName.equals("France")) return "Doğru";
        if (sehirName.equals("Nairobi") && ulkeName.equals("Kenya")) return "Doğru";

        return "Yanlış"; // Eşleşme yoksa "Yanlış" döndür
    }
}
