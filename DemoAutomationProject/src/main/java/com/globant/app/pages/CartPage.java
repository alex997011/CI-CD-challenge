package com.globant.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class CartPage extends BasePage {
    private static final Logger log = LoggerFactory.getLogger(CartPage.class);



    @FindBy(id = "checkout")
    private WebElement checkoutButton;


    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }


    public void proceedToCheckout() {
        checkoutButton.click();
        log.info("Checkout: Your Information");
    }

}