package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _06_DragAndDropBy extends BaseDriver{

    @Test

    public void Test1() {

        driver.get("https://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php#google_vignette");
        MyFunc.Bekle(2);

        Actions aksiyonlar=new Actions(driver);
        WebElement solSurgu= driver.findElement(By.xpath("//div[@id='slider-range' ]//span[1]"));
        WebElement sagSurgu= driver.findElement(By.xpath("//div[@id='slider-range' ]//span[2]"));

      //  new Actions(driver).dragAndDropBy(solSurgu,100,0).build().perform();
        MyFunc.Bekle(1);

        new Actions(driver).dragAndDropBy(solSurgu,200,0).build().perform();






BekleKapatKodu();
// ToDo: sol sürgüyü 200$ sag surguyu 400$ kaydırın

        // Not : bir webelementin uzunluğunu(genisliğin) nasıl alırsın
        // int genislik=cubuk.getSize().witdh;






    }
    }

