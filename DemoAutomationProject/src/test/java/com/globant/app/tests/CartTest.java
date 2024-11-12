package com.globant.app.tests;

import com.globant.app.pages.CartPage;
import com.globant.app.pages.LoginPage;
import com.globant.app.pages.ProductPage;
import org.testng.annotations.Test;

import java.util.List;

public class CartTest extends BaseTest {
    @Test public void completeRemoveFlow(){
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);


        loginPage.login("standard_user", "secret_sauce");


        List<String> addedProductIds = productPage.addThreeRandomProductsToCart();
        productPage.goToShoppingCart();



        cartPage.removeItemsFromCart(addedProductIds);
    }
}
