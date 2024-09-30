package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _02_ScrollToBottomOfThePage extends BaseDriver {
    @Test

    public void Test1(){

        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.Bekle(5);

        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); //Tüm sayfayı scroll
        MyFunc.Bekle(2);

        js.executeScript(("window.scrollTo(0,0)")); // 0 noktasına geri dön basa git

        BekleKapatKodu();














    }
}

