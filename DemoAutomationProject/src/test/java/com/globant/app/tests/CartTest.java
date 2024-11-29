package com.globant.app.tests;

import com.globant.app.pages.CartPage;
import com.globant.app.pages.LoginPage;
import com.globant.app.pages.ProductPage;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

import java.util.List;

public class CartTest extends BaseTest {
    @Test 
    @Description("Cart Test Description")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Cart Functionality")
    
    public void completeRemoveFlow(){
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);


        loginPage.login("standard_user", "secret_sauce");


        List<String> addedProductIds = productPage.addThreeRandomProductsToCart();
        productPage.goToShoppingCart();



        cartPage.removeItemsFromCart(addedProductIds);
    }
}
