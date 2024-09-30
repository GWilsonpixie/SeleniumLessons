package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _04_Soru extends BaseDriver {

    @Test

    public void Test1() {

//        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz

        driver.get("https://www.facebook.com/");
        MyFunc.Bekle(2);


        WebElement createBtn = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createBtn.click();
        MyFunc.Bekle(2);

        WebElement firstnameButton = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstnameButton.sendKeys("Gulumser");
        MyFunc.Bekle(2);

        WebElement lastNameBtn = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastNameBtn.sendKeys("Wilson");
        MyFunc.Bekle(2);

        WebElement mobileEmailBtn = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']"));
        mobileEmailBtn.sendKeys("5557865");
        MyFunc.Bekle(2);

        WebElement newPasswordBtn = driver.findElement(By.xpath("//input[@aria-label='New password']"));
        newPasswordBtn.sendKeys("****");
        MyFunc.Bekle(2);

        WebElement genderClickBtn = driver.findElement(By.xpath("//input[@type='radio' and @class='_8esa' and @id='sex' and @name='sex' and @value='1']"));
        genderClickBtn.click();
        MyFunc.Bekle(2);

        WebElement webDay = driver.findElement(By.id("day"));
        WebElement webMonth = driver.findElement(By.id("month"));
        WebElement webYear = driver.findElement(By.id("year"));


        Select dayMenu = new Select(webDay);
        Select monthMenu = new Select(webDay);
        Select yearMenu = new Select(webDay);

        //dayMenu.selectByValue(05)

        //WebElement dayDD = driver.findElement(By.id("day"));

        //Select selectDay = new Select(dayDD);
        //selectDay.selectByValue("5");
        //MyFunc.Bekle(2);

        //WebElement yearDD = driver.findElement(By.id("year"));

       // Select selectYear = new Select(yearDD);
       // selectYear.selectByValue("1976");
       // MyFunc.Bekle(2);


        BekleKapatKodu();


    }


}
