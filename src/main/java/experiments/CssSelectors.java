package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.Test;

public class CssSelectors {
    WebDriver driver = new ChromeDriver();

    @Test
    public void selectorsHomePage(){
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        WebElement footer = driver.findElement(By.tagName("footer"));
        System.out.println(footer.getTagName());
        pause(5);
        //WebElement divElements = driver.findElement(By.className("card-up"));
        //WebElement divElements = driver.findElement(By.cssSelector(".card-up"));
        //WebElement divElements = driver.findElement(By.cssSelector("*[class='card-up']"));
        WebElement divElements = driver.findElement(By.cssSelector("div[class='card-up']"));
        divElements.click();
        pause(5);

        //WebElement btnRadioButton = driver.findElement(By.id("item-2"));
        //WebElement btnRadioButton = driver.findElement(By.cssSelector("#item-2"));
        WebElement btnRadioButton = driver.findElement(By.cssSelector("*[id='item-2']"));
        btnRadioButton.click();

        // WebElement btnImpressive = driver.findElement(By.id("impressiveRadio"));
        WebElement btnImpressive = driver.findElement(By.cssSelector("label[for='impressiveRadio']"));
        btnImpressive.click();
        pause(5);

        //WebElement btnButtons = driver.findElement(By.id("item-4"));
        WebElement btnButtons = driver.findElement(By.cssSelector("li:nth-"));
        btnButtons.click();
        //WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));
        WebElement btnDoubleClick = driver.findElement(By.cssSelector("#doubleClickBtn"));
        btnDoubleClick.click();
        pause(5);

        driver.navigate().back();
        driver.navigate().back();
        pause(5);

        //driver.close();
        driver.quit();
    }

    public void pause(int time){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}