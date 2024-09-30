package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_Soru extends BaseDriver {
    @Test

    public void Test() {
//        Senaryo
//        1- https://www.saucedemo.com/
//        2- login işlemini yapınız.
//        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
//        4- Sonra geri dönün (Back to products e tıklatın)
//        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
//        6- sepete tıklatın
//        7- CheckOut a tıklatın
//        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
//        9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//        Item total e eşit olup olmadığını Assert ile test ediniz.
//
//        Bu soruda tamamen XPATH kullanılacaktır.
        //    Assert.assertTrue(urunFiyatToplamlam == itemTotal)



        //1 https://www.saucedemo.com/ yapıldı
        driver.get("https://www.saucedemo.com/");
        MyFunc.Bekle(2);

        //2 login işlemini yapıldı
        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement passwordButton = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        MyFunc.Bekle(2);

        userName.sendKeys("standard_user");
        passwordButton.sendKeys("secret_sauce");
        MyFunc.Bekle(2);
        loginButton.click();

        // 3- Sauce Labs Backpack  a tıklandı

        WebElement sauceLabBackpack = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        sauceLabBackpack.click();
        MyFunc.Bekle(2);

        // "Add to cart" butonunu bulunup tıklandı
        WebElement addCart = driver.findElement(By.xpath("//button[contains(@class, 'btn_inventory') and contains(@id, 'add-to-cart')]"));
        addCart.click();
        MyFunc.Bekle(2);

        //4- Sonra geri dönüldü ve  (Back to products a tıklandı)
        WebElement backToProductButton = driver.findElement(By.xpath("//button[contains(@class,'btn btn_secondary back btn_large inventory_details_back_button')]"));
        backToProductButton.click();
        MyFunc.Bekle(2);

        //5- Sauce Labs Bolt T-Shirt  a tıklandı ve sepete eklendi.
        WebElement sauceBoldTshirtButton= driver.findElement(By.xpath("//div[contains(@class,'inventory_item_name') and text()='Sauce Labs Bolt T-Shirt']"));
        sauceBoldTshirtButton.click();
        MyFunc.Bekle(2);

        WebElement addCartTshirtButton= driver.findElement(By.xpath("  //button[contains(@class, 'btn_inventory') and contains(@id, 'add-to-cart')]"));
        addCartTshirtButton.click();
        MyFunc.Bekle(2);

       // 6- sepete tıklatıldı
        WebElement shoppinCartButton= driver.findElement(By.xpath("   //a[@class='shopping_cart_link']"));
        shoppinCartButton.click();
        MyFunc.Bekle(2);

       //7- CheckOut a tıklandı
        WebElement checkOutButton= driver.findElement(By.xpath("  //button[contains(@class,'btn btn_action btn_medium checkout_button')]"));
        checkOutButton.click();
        MyFunc.Bekle(2);

       //8- kullanıcı bilgileri girildi Continue ya tıklatıldı

        WebElement firstNameButton  = driver.findElement(By.xpath("//input[@id='first-name']"));
        WebElement lastNameButton   = driver.findElement(By.xpath("//input[@id='last-name']"));
        WebElement postalCodeButton = driver.findElement(By.xpath("//input[@id='postal-code']"));

        firstNameButton.sendKeys("Gulumser");
        lastNameButton.sendKeys("Wilson");
        postalCodeButton.sendKeys("T8N555");
        WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
        continueButton.click();
        MyFunc.Bekle(2);





       // Assert.assertTrue(urunFiyatToplamlam == itemTotal);  YAPAMADIM!!


BekleKapatKodu();









    }










}
