import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.InterruptedIOException;

/**
 * Created by ganesh.babar on 2/22/2017.
 */
@org.testng.annotations.Test

public class OurService_Software_Testing {
    WebDriver driver = null;
    WebElement element;

    @BeforeTest
public void SetUp () throws InterruptedException {
        //Initialise the browser
        System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.rave-tech.com/");   /* 1. open Rave Technologies*/
    }
        //2) open Rave technologies ->What we do -> Our Service -> Software Testing
@Test
    public void Run () throws InterruptedIOException {
    element = driver.findElement(By.xpath("//*[@id='menu-item-40']/a"));  // click What we do
    element.click();

    //element = driver.findElement(By.xpath("//*[@id='menu-item-44']/a")); // Click Our services
    //element.click();

    element = driver.findElement(By.xpath("//*[@id='menu-item-134']/a")); // Click Software Testing
    element.click();
}

        /*/*//*3. open Rave technologies ->Careers->Current Openings -> expand implementation engineer ->click on share now ->go back to current opening
        WebDriver driver1=new ChromeDriver();
        driver1.get("https://www.rave-tech.com/");

        element = driver1.findElement(By.xpath("/*//*[@id='menu-item-42']/a")); //Click careers
        element.click();

        element = driver1.findElement(By.xpath("/*//*[@id='menu-item-221']/a"));  //Click current opening
        element.click();

        element = driver1.findElement(By.xpath("/*//*[@id='heading3']/h4")); //Click expand implementation engineer
        element.click();
        element = driver1.findElement(By.xpath("/*//*[@id='collapse3']/div/div/div[1]/div/div/div/span/span/span")); // Click Share now
        element.click();
        driver1.navigate().back(); // Navigate back to page
        Thread.sleep(5000);
        driver1.close();

        // 4. open Rave technologies ->Search->Publishing->On Search Result ->Click Publishing Conference 2016

        WebDriver driver2= new ChromeDriver();
        driver2.get("https://www.rave-tech.com/");

        element = driver2.findElement(By.xpath("/*//*[@id='menu-header-menu']/li[7]/a")); //Click on Search
        element.click();

        element=driver2.findElement(By.xpath("/*//*[@id='menu-header-menu']/li[7]/ul/li/ul/li/div/form/input[1]"));  // Click in the input field
        element.click();
        element.sendKeys("publishing"); // Type publishing
        element=driver2.findElement(By.xpath("/*//*[@id='menu-header-menu']/li[7]/ul/li/ul/li/div/form/input[2]")); // Click on search icon
        element.click();

        element=driver2.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/div[5]/div/div/div[1]/a")); //Click on Publishing Conference 2016
        element.click();
        driver2.close();*/
@AfterTest
public void Close() {
        driver.close();
    }

}