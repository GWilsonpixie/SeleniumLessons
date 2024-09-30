package Gun08;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ElemaninStatusu extends BaseDriver {


    @Test
    public void Test1(){

driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement sali=driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
        System.out.println("sali.isDisplayed() = " + sali.isDisplayed()); // gözükür durumda mı sali tıkı
        System.out.println("sali.isEnabled() = " + sali.isEnabled());  // etkin durumda mı
        System.out.println("sali = " + sali.isSelected());// cekli ve secilmis durumda mı

        sali.click(); // sali ceklendi tıklandı
        System.out.println("sali.isSelected() = " + sali.isSelected()); // true

        WebElement cumartesi= driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));
        System.out.println("cumartesi.isDisplayed() = " + cumartesi.isDisplayed());
        System.out.println("cumartesi.isEnabled() = " + cumartesi.isEnabled());
        System.out.println("cumartesi.isSelected() = " + cumartesi.isSelected());


        Assert.assertTrue(cumartesi.isDisplayed()==true);

        BekleKapatKodu();






    }











}
