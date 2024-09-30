package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionMouseWheel extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.Bekle(2);

        WebElement iframe=driver.findElement(By.name("nested_scrolling_frame"));

        new Actions(driver).scrollToElement(iframe).build().perform();

BekleKapatKodu();

    }
    @Test
    public void Test2() {

        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.Bekle(2);

       new Actions(driver).scrollByAmount(0,600).build().perform();

BekleKapatKodu();

    }

}
