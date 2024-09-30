package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_selectClass extends BaseDriver {

    @Test

    public void Test1(){
// bu eleman eğer SELECT tag ile baslayan web elementi ise
        // bu Select nesnesine CAST yap ve öyle kullan

        driver.get("https://www.amazon.com.tr/");

        WebElement webSelect= driver.findElement(By.id("searchDropdownBox"));

        Select javaSelect=new Select(webSelect);


        javaSelect.selectByIndex(2);  // ister bu sekilde secebilirsin : indexle
        MyFunc.Bekle(2);
        javaSelect.selectByValue("search-alias=electronics");//ister bu sekilde secebilirsin : value ile
        MyFunc.Bekle(2);
        javaSelect.selectByVisibleText("Evcil Hayvan Malzemeleri"); // ister bu sekilde görünen string ile seçebilirsin
        MyFunc.Bekle(2);

        System.out.println("ddMenu.getOptions().size() = " + javaSelect.getOptions().size());

        for                                   (WebElement secenek: javaSelect.getOptions())
            System.out.println("secenek.getText() = " + secenek.getText());

        BekleKapatKodu();




















    }










}
