package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Test;

public class _04_Navigating_Yeni extends BaseDriver{

@Test
    public void Test1(){





driver.navigate().to("https://testpages.eviltester.com/styled/index.html");
MyFunc.Bekle(3);

WebElement Link=driver.findElement(By.id("alerttest"));
Link.click();
MyFunc.Bekle(2);

driver.navigate().back();
        MyFunc.Bekle(2);

        driver.navigate().forward();

    //      if (driver.getCurrentUrl().equals("https://testpages.eviltester.com/styled/index.html"));
    //      System.out.println("Test passed");
    //      else
    //      System.out.println("Test Failed);

    Assert.assertTrue("Beklenen sayfaya ulasılamadı",driver.getCurrentUrl().equals("1https://testpages.eviltester.com/styled/index.html"));
    // eğer failed değilse bana göstermene gerek yok failed ise göster demek







        BekleKapatKodu();



}














    }