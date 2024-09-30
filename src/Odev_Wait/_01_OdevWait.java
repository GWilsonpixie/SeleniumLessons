package Odev_11_Sep;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class _01_OdevWait extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        MyFunc.Bekle(2);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement firstNumberInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("number1Field")));
        System.out.println("Sayfa yüklendi.");

        for (int i = 1; i <= 5; i++) {
            System.out.println("--------- " + i + ". İşlem Başlıyor ---------");

            Random rand = new Random();
            int num1 = rand.nextInt(100);
            int num2 = rand.nextInt(100);

            System.out.println("Üretilen Sayı 1: " + num1);
            System.out.println("Üretilen Sayı 2: " + num2);

            firstNumberInput.clear();
            firstNumberInput.sendKeys(String.valueOf(num1));

            WebElement secondNumberInput = driver.findElement(By.id("number2Field"));
            secondNumberInput.clear();
            secondNumberInput.sendKeys(String.valueOf(num2));

            List<String> operations = Arrays.asList("Add", "Subtract", "Multiply", "Divide");

            for (String operation : operations) {
                if (operation.equals("Divide") && num2 == 0) {
                    System.out.println("Bölen sıfır olduğundan " + operation + " işlemi atlanıyor.");
                    continue;
                }
                performOperation(operation);
            }

            System.out.println("--------- " + i + ". İşlem Tamamlandı ---------");
        }

        BekleKapatKodu();
    }

    private void performOperation(String operation) {
        WebElement operationDropdown = driver.findElement(By.id("selectOperationDropdown"));
        operationDropdown.sendKeys(operation);

        WebElement calculateButton = driver.findElement(By.id("calculateButton"));
        calculateButton.click();

        WebElement resultField = driver.findElement(By.id("numberAnswerField"));
        String resultText = resultField.getAttribute("value");
        System.out.println(operation + " işlemi sonucu: " + resultText);
    }
}
