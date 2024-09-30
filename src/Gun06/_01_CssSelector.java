package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector extends BaseDriver {
    @Test
// 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
// 2- Business i çekleyin.
// 3- discover XYZ ye tıklatın ve online Advertising i seçin
// 4- Every day i seçin
// 5- Good u seçin
// 6- using XYZ yi tıklatın ve 3.seçeneği seçin
// css selector
// her bir tıklatma vs işlemin arasına MyFunc.Bekle(2);

    //input[type='radio'][value='Business']


    public void Test1() {



        driver.get("https://formsmarts.com/form/yu?mode=h5");
        MyFunc.Bekle(2);


        WebElement busines = driver.findElement(By.cssSelector("input[type='radio'][value='Business']"));
        busines.click();
        MyFunc.Bekle(2);


        WebElement dropDownDiscover = driver.findElement(By.cssSelector("[id$='_4588']"));
        dropDownDiscover.click();
        MyFunc.Bekle(2);

        WebElement optionOnlineAdvertising = driver.findElement(By.cssSelector("[id$='_4588'] > :nth-child(4)"));
        optionOnlineAdvertising.click();
        MyFunc.Bekle(2);

        WebElement everyDayRAdio = driver.findElement(By.cssSelector("input[type='radio'][value='Every Day']"));
        everyDayRAdio.click();
        MyFunc.Bekle(2);

        WebElement experienceGood = driver.findElement(By.cssSelector("input[type='radio'][value='Good']"));
        experienceGood.click();
        MyFunc.Bekle(2);


        WebElement dropDownHowLong = driver.findElement(By.cssSelector("select[id='u_H0K_4597']"));
        dropDownHowLong.click();
        MyFunc.Bekle(2);

        WebElement option3 = driver.findElement(By.cssSelector("select[id='u_H0K_4597']>:nth-child(4)"));
       option3.click();
        MyFunc.Bekle(2);

experienceGood.click();

        BekleKapatKodu();












    }


}
