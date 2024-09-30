package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindingByName {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        //By.Name ()


 WebElement LabelFirstName = driver.findElement(By.name("q8_name[first]"));
 LabelFirstName.sendKeys("Gulumser");
        MyFunc.Bekle(2);

        WebElement LabelLastName = driver.findElement(By.name("q8_name[last]"));
        LabelLastName.sendKeys("Wilson");
        LabelLastName.clear();  // kutucuğu temizler burada kullanılmasaydı GulumserWilson yan yana yazardı
        LabelLastName.sendKeys("Wilson1");



        WebElement Submit = driver.findElement(By.id("input_2"));
        Submit.click();


        MyFunc.Bekle(5);
        driver.quit();















    }
}
