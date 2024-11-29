package com.globant.app.tests;

import com.globant.app.pages.LoginPage;
import com.globant.app.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class LogoutTest extends BaseTest{

    @Test
    @Description("Logout Test Description")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Logout Functionality")
    public void completeLogoutFlow (){

        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);


        loginPage.login("standard_user", "secret_sauce");


        productPage.TryToLogout();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.saucedemo.com/"));
    }

}
