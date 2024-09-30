package Odev;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_odev_09_Sep extends BaseDriver {

    @Test
/*3-
1) Bu siteye gidin. -> https://www.snapdeal.com/
2) "teddy bear" aratın ve Search butonuna tıklayın.
3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.*/
public void Test1() {

        driver.get("https://www.snapdeal.com/");
        MyFunc.Bekle(2);


        WebElement searchInput = driver.findElement(By.xpath(" //input[@name='keyword'and @class='col-xs-20 searchformInput keyword']"));
        searchInput.sendKeys("teddy bear");
        MyFunc.Bekle(1);

        WebElement searchBtn = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
        searchBtn.click();
        MyFunc.Bekle(1);

        String Text = driver.findElement(By.xpath("//div[@class='search-result-txt-section  marT12']/span[@style='color: #212121; font-weight: normal' and @class='nnn' and contains(text(), 'results for teddy bear')]")).getText();
        Assert.assertTrue("Doğrulama gerçekleşmedi", Text.contains("results for teddy bear"));

        BekleKapatKodu();

    }


}
