package Gun05;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02_FindingElements_Tag {
    public static void main(String[] args) {


        // amazon.com un sayfasındaki bütün linkleri istiyorum. Tıklatılabilir ve görünen yazı

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com.tr/");

       List <WebElement> Linkler=driver.findElements(By.tagName("a"));

       for (WebElement e:Linkler)
       {
           if (!e.getText().equals("") && e.getAttribute("href")!=null)
           System.out.println("e.getText() = " + e.getText());

       }

           MyFunc.Bekle(5);
       driver.quit();










    }
}
