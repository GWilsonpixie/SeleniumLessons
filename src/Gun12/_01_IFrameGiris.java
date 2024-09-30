package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseDriver {
    @Test

    public void Test1(){

        driver.get("http://demo.automationtesting.in/Frames.html");

        // önce iliglii Webelementin bulunduğu iframe e gecmen lazın
        // id=singleframe  , name =singleframe  index=0, WebElement olarak

        driver.switchTo().frame(0); // index ini vererek geçebilirisin
        //driver.switchTo().frame("singleframe"); // id sini vererek geçebilirsin
        //driver.switchTo().frame("singleframe"); // name vererek geçebilirsin


       // WebElement iframe1= driver.findElement(By.id("singleframe"));
       // driver.switchTo().frame(iframe1);


        WebElement txtBox= driver.findElement(By.xpath(("//input[@type='text']")));
        txtBox.sendKeys("Merhaba");
        //bu noktada hangi sayfadayım : iframe in içindeyim
        // peki Ana syfaya nasıl dönnerim?

        //1.yol 1 geri git paranteze git

        driver.switchTo().parentFrame(); //1 adım geri olan sayfaya git

        //2yol. direk Anasayfaya git
        driver.switchTo().defaultContent(); // direk anasayfaya git
        // bu noktada anasayfadayım

        BekleKapatKodu();








    }
}
