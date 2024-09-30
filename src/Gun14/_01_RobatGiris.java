package Gun14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class _01_RobatGiris extends BaseDriver {
    @Test

    public void Test1() throws AWTException {

        driver.get("https://www.selenium.dev/");
        MyFunc.Bekle(2);

        Robot robot = new Robot();
        //Yeni pencere acma islemi robotla klavyedeki Ctrl+T tab gibi

        robot.keyPress(KeyEvent.VK_CONTROL); //ctrl tusuna bas
        robot.keyPress(KeyEvent.VK_T); // ctr basılı idi T tusuna bas
        // Eger böyle bırakırsan tuslar basılı kalıyor tusu bıraktırman lazım
        robot.keyRelease(KeyEvent.VK_T); // T tusunu bırak
        robot.keyRelease(KeyEvent.VK_CONTROL); // ctrl tusunu bırak
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl()); // su anda hala 1.sayfada

        Set<String> idler=driver.getWindowHandles();
        Iterator gosterge=idler.iterator();
        String birinciPencereID=gosterge.next().toString();
        String ikinciPencereID=gosterge.next().toString();

        driver.switchTo().window(ikinciPencereID); // 2.pencere yeni taba gectim
        System.out.println("driver.getTitle() = " + driver.getTitle());
        driver.get("https://www.facebook.com/");

        MyFunc.Bekle(2);
        BekleKapatKodu();


    }
}
