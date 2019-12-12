package com.pages;

import com.abstractPages.AbstractMain;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage extends AbstractMain {
    public static By Cookie = By.cssSelector(".cookie__btn");
    public String Title = "WSET home | Wine & Spirit Education Trust";


    public void goToHomePage() throws InterruptedException {
        driver.get(BASE_URL);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),Title);   // Check Title displayed
        Thread.sleep(5000);
        action.clickElement(Cookie);                    // accept cookies
        Thread.sleep(5000);

    }

    public void verifyHeader(){
        action.isElementPresent(Header);       //Check Header displayed


    }
    public void verifyFooter(){
        action.isElementPresent(Footer);          // Check footer displayed
        action.isElementPresent(LowerFooter);




    }


}
