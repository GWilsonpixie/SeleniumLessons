package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {

    public static void main(String[] args) {

//        1-id = By.id
//        2-name = By.name
//        3-class= By.classname
//        4-SADECE a tagleri için: linkText (Sadece a tagli elemanlar icin kullanılır
//        5-SADECE a tagleri için: partialLinkText= By.Partiallinktext (Sadece a tagli elemanlar için kullanılır
//        6-
//        7-

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        WebElement siparislerimLinki=driver.findElement(By.linkText("Siparişlerim"));
        //link gorunen texti Siparislerim olan a tagli ELEMANI BUL

        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText());

        WebElement link2=driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println("link2.getText() = " + link2.getText());

        MyFunc.Bekle(3); // Bu driver üzerinden açılmıs bütün tarayaıcıları kapatır
        driver.quit(); // driver.close()  // bu driver üzerinden açılmsa o anda olan tarayaıcıyı kapatır




    }
}
