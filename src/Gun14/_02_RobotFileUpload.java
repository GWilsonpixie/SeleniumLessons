package Gun14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _02_RobotFileUpload extends BaseDriver {
    @Test
    public void Test1() throws AWTException {

        driver.get("https://demo.guru99.com/test/upload/");
        MyFunc.Bekle(2);

        Robot rbt=new Robot();

        for (int i = 1; i <15 ; i++) {
            rbt.keyPress(KeyEvent.VK_TAB); // taba bas
            rbt.keyRelease(KeyEvent.VK_TAB); //tab dan cık

        }
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
        MyFunc.Bekle(2);

// stringi hafızaya kopyalama yöntemi
        StringSelection dosyaYolu= new StringSelection("C:\\Users\\wilso\\OneDrive\\Masaüstü\\Unutma_Egrisi");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);
        // ctrl+c, panoya gitti , panoya kopyalandı
        //Ctrl+V dosya yolunu yapıstırma islemi
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

        rbt.keyRelease(KeyEvent.VK_V);
        rbt.keyRelease(KeyEvent.VK_CONTROL);

        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        MyFunc.Bekle(2);
        for (int i = 0; i <2 ; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
        }// CHECK BOX A GELDİM

        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_SPACE);// // CHECK BOX I CHEKLEDİM
        rbt.keyRelease(KeyEvent.VK_SPACE);
        MyFunc.Bekle(1);
        for (int i = 0; i <2 ; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);// SUBMIT BUTONA GELDİM

        }
          MyFunc.Bekle(2);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);//Submit butona bastım

        WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'successfully uploaded')]")));
        System.out.println("File upload completed, waiting for success message.");


        Assert.assertTrue(msg.isDisplayed());// assert
        MyFunc.Bekle(5);






BekleKapatKodu();


    }

}
