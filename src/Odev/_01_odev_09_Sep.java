package Odev;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_odev_09_Sep extends BaseDriver {

    @Test

/*1.Soru
  1) Bu siteye gidin. -> http://demoqa.com/text-box
  2) Full Name kısmına "Automation" girin.
  3) Email kısmına "Testing@gmail.com" girin.
  4) Current Address kısmına "Testing Current Address" girin.
  5) Permanent Address kısmına "Testing Permanent Address" girin.
  6) Submit butonuna tıklayınız.
  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
*/
       public void Test1() {

        driver.get("http://demoqa.com/text-box");
        MyFunc.Bekle(2);

        WebElement fullName= driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullName.sendKeys("Automation");
        MyFunc.Bekle(1);

        WebElement eMailBtn= driver.findElement(By.xpath("//input[@class='mr-sm-2 form-control']"));
        eMailBtn.sendKeys("Testing@gmail.com");
        MyFunc.Bekle(1);

        WebElement currentAddressField= driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        currentAddressField.sendKeys("Testing Current Address");
        MyFunc.Bekle(1);

        WebElement permanentAddressField= driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddressField.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(1);

        WebElement submitBtn= driver.findElement(By.xpath("//button[@id='submit']"));
        submitBtn.click();
        MyFunc.Bekle(1);

        String TextName=driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']")).getText();
        Assert.assertTrue("Doğrulanamadı",TextName.contains("Automation"));

        String TextEmail=driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']")).getText();
        Assert.assertTrue("Doğrulanamadı",TextEmail.contains("Testing"));

BekleKapatKodu();

    }

}
