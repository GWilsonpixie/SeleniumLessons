package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Navigating extends BaseDriver {
    public static void main(String[] args) {

        //driver.get("https://testpages.eviltester.com/styled/index.html");
        driver.navigate().to("https://testpages.eviltester.com/styled/index.html"); // siteye git aç
        System.out.println("driver.getTitle= " + driver.getTitle()); // su andaki title
        System.out.println("driver.getCurrentUrl= " + driver.getCurrentUrl()); // su andaki url, adres
        MyFunc.Bekle(3);

        WebElement link=driver.findElement(By.id("alerttest"));
        link.click(); //yeni sayfaya gidildi
        System.out.println("driver.getTitle= " + driver.getTitle());
        System.out.println("driver.getCurrentUrl= " + driver.getCurrentUrl());
        MyFunc.Bekle(3);

        driver.navigate().back();  // önceki sayfaya dön, geri okuna basılmıs gibi
        System.out.println("driver.getTitle= " + driver.getTitle());
        System.out.println("driver.getCurrentUrl= " + driver.getCurrentUrl());
        MyFunc.Bekle(2);

        driver.navigate().forward(); //bir ileri sayfaya git
        System.out.println("driver.getTitle= " + driver.getTitle());
        System.out.println("driver.getCurrentUrl= " + driver.getCurrentUrl());

        BekleKapatKodu();








  }
}
