package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _05_AlertPart1 extends BaseDriver {
    @Test

    public void Test1() {

        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        MyFunc.Bekle(2);

        WebElement clickMe= driver.findElement(By.id("alert"));
        clickMe.click();
        MyFunc.Bekle(2);

        // su anda alert cıkmıs oldu

        driver.switchTo().alert().accept(); // Alertin OK butonuna bas demek
        BekleKapatKodu();

    }

        @Test

        public void Test2() {

            driver.get("https://www.selenium.dev/selenium/web/alerts.html");
            MyFunc.Bekle(2);

            WebElement prompt= driver.findElement(By.id("prompt"));
            prompt.click();
            MyFunc.Bekle(2);

            driver.switchTo().alert().dismiss(); // dismiss cancel tusuna basmak
            // basınca altta cıkan Null yada uyarı kelimesine gitmek için de

            WebElement text= driver.findElement(By.id("text"));
            Assert.assertTrue("Mesaj bulunamadı", text.getText().equalsIgnoreCase("null"));

            BekleKapatKodu();

        }


           @Test

            public void Test3() {

        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        MyFunc.Bekle(2);

        WebElement promptHappen= driver.findElement(By.id("prompt"));
        promptHappen.click();
        MyFunc.Bekle(2);

        driver.switchTo().alert().sendKeys("GULUMSER");
        driver.switchTo().alert().accept();
        MyFunc.Bekle(2);

        WebElement textMesaj= driver.findElement(By.id("text"));
               // eğer scrool alta insin yazıyı göstersin istersen
               new Actions(driver).scrollToElement(textMesaj).build().perform();
               MyFunc.Bekle(2);

               Assert.assertTrue("Mesaj bulunamadı" , textMesaj.getText().equalsIgnoreCase("gulumser"));


BekleKapatKodu();



        }

        @Test
        public void Test4() {
// bu da get text alert
            driver.get("https://www.selenium.dev/selenium/web/alerts.html");
            MyFunc.Bekle(2);

            WebElement promptDefault= driver.findElement(By.id("prompt-with-default"));
            promptDefault.click();
            MyFunc.Bekle(2);

            String okunanYazi=driver.switchTo().alert().getText();
            driver.switchTo().alert().accept();

            System.out.println("okunanYazi = " + okunanYazi);


            Assert.assertTrue("Mesaj bulunamadı" , okunanYazi.contains("Enter")); //promptun ustundeki acıklama baslıgına dikkat et onu alıcaksın

            BekleKapatKodu();


        }
        }

