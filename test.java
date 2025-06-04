package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
    @Test
    public void testing()throws InterruptedException{
        WebDriver dr=new ChromeDriver();
        dr.manage().window().maximize();
        dr.get("https://www.google.com");
        Thread.sleep(5000);
        dr.quit();
    }

    }
