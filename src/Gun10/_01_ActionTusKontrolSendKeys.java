package Gun10;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionTusKontrolSendKeys extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://demoqa.com/auto-complete");


        WebElement txtBox= driver.findElement(By.id("autoCompleteMultipleContainer"));

        new Actions(driver)
                .moveToElement(txtBox)  // kutucuğa git  shift ile mesela Ahmet yazarken Shif+A yapıyoruz ya webden
                .click()        // yazabilmek icin içine tıklat
                .keyDown(Keys.SHIFT)  //shift tusuna bas
                .sendKeys("a")      // a harfini gönder buyuk A yazmalı shiftten dolayı
                .keyUp(Keys.SHIFT)   // // shift tusunu geri bırak
                .sendKeys("hmet")   // hmet yazısını gönder küçük harflerle yazmalı
                .build()           // aksiyonu hazırla
                .perform();       // islemi gerçeklestir

        BekleKapatKodu();





    }



}
