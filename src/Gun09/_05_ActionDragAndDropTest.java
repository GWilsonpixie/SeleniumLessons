package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionDragAndDropTest extends BaseDriver {

    @Test

    public void Test1(){

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Actions aksiyonlar=new Actions(driver);
        MyFunc.Bekle(1);

        WebElement oslo= driver.findElement(By.id("box1"));
        WebElement norway=driver.findElement(By.id("box101"));

        //1.Yöntem
        //aksiyonlar.dragAndDrop(oslo,norway).build().perform();
        //osloyu al , norway e bırak , bö yöntem hızlı olduğu için site cevap veremeyebiliyor

        //2.yöntem daha saglıklı
       // aksiyonlar.clickAndHold(oslo).build().perform(); // osloyu eline al
       // aksiyonlar.moveToElement(norway).release().build().perform();//  norwayin üzerine git

        new Actions(driver).dragAndDrop(oslo,norway).build().perform();









        BekleKapatKodu();














        BekleKapatKodu();









    }


}
