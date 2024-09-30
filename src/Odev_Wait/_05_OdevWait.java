package Odev_11_Sep;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _05_OdevWait extends BaseDriver {

    @Test
    public void Test1() {


        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        MyFunc.Bekle(2);

        WebElement addButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement deleteButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Delete']")));

        Assert.assertTrue(deleteButton.isDisplayed());
        System.out.println("Delete butonu görünür oldu.");

        deleteButton.click();
        MyFunc.Bekle(2);

        boolean isDeleteButtonDisplayed = driver.findElements(By.xpath("//button[text()='Delete']")).size() > 0;
        Assert.assertFalse("Delete butonu hala görünüyor!", isDeleteButtonDisplayed);
        System.out.println("Delete silindi ve görünmüyor.");

        BekleKapatKodu();
    }
}
