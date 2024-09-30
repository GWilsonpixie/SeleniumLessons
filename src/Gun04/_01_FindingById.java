package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _01_FindingById {

    public static void main(String[] args) {

// Senaryo :
        // 1: https://form.jotform.com/221934510376353 sayfasını açınız
        // 2: isim kutucuğuna "Gulumser" yazdırınız
        // 3- soyad kutucuğuna "Wilson" yazdırınız

        // id= first_8

        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement isimkutusu = driver.findElement(By.id("first_8"));        // Id si first_8 olan elementi bul

        isimkutusu.sendKeys("Gulumser");

        MyFunc.Bekle(5);

        WebElement soyadkutusu = driver.findElement(By.id("last_8"));        // Id si last_8 olan elementi bul

        soyadkutusu.sendKeys("Wilson");



        MyFunc.Bekle(5);
        driver.quit();









        
    }
}
