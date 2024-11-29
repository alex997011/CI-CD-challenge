package com.globant.app.tests;

import com.globant.app.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;



public class PurchaseTest extends BaseTest {

    @Test
    @Description("Purchase Description")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Purchase Functionality")
    public void completePurchaseFlow() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        // Login
        loginPage.login("standard_user", "secret_sauce");

        // Select and add product to cart
        productPage.addRandomProductToCart();
        productPage.goToShoppingCart();

        // Proceed to checkout
        cartPage.proceedToCheckout();

        // Fill checkout form and complete purchase
        checkoutPage.fillPersonalData("Alejandro", "Pacheco", "0901100");
        checkoutPage.completeCheckoutOne();
        checkoutPage.completeCheckoutTwo();

        Assert.assertTrue(driver.getCurrentUrl().contains("checkout-complete"));
    }
}
