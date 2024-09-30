package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class _01_ScrollToBy extends BaseDriver {
    @Test
    public void Test1(){
driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.Bekle(2);

        //Actions actions1=new Actions(driver);
        JavascriptExecutor js=(JavascriptExecutor)driver; // driverdan bir tane javascript calistirici olusturdum actions gibi
        MyFunc.Bekle(2);

        js.executeScript("window.scrollTo(0,500)"); // dikey yönde 500px scrool yap

        MyFunc.Bekle(2);
        js.executeScript("window.scrollBy(0,500)");  // bulunduğun yerden itibaren dikey yönde 500 px yap


        MyFunc.Bekle(2);
        js.executeScript("window.scrollBy(0,-500)"); //- yani bulunduğun yerden geri al
        BekleKapatKodu();







    }
}
