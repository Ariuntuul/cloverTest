package com.clover;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class test1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String url = "https://www.clover.com";

        driver.get(url);

        WebElement clover = driver.findElement(By.xpath("//a[@title='Clover']"));

        List<WebElement> allTags = driver.findElementsByTagName("a");
        System.out.println("Total tags are: " + allTags.size());

        for (int i = 0; i < allTags.size(); i++){
            System.out.println("Links on page are " + allTags.get(i).getAttribute("href"));
            System.out.println("Links on page are " + allTags.get(i).getText());
        }
    }
}
