package qa3.fasttrackit.org.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import qa3.fasttrackit.org.steps.CartSteps;

@RunWith(SerenityRunner.class)
public class CartTest {

    @Managed(uniqueSession = true)
    private WebDriver webDriver;

    @Steps
    private CartSteps cartSteps;

    @Test
    public void addProductToCart(){
        cartSteps.navigateToShopPage();
        cartSteps.addProductToCart();
        cartSteps.navigateToCartPage();
        cartSteps.checkIfProductIsAddedToCart("Beanie");
    }

    @Test
    public void removeProductFromCart(){
        cartSteps.navigateToShopPage();
        cartSteps.addProductToCart();
        cartSteps.navigateToCartPage();
        cartSteps.clickRemoveButton();
        cartSteps.checkIfProductWasDeleted();
    }

    @Test
    public void undoProductThatWasRemoved(){
        cartSteps.navigateToShopPage();
        cartSteps.addProductToCart();
        cartSteps.navigateToCartPage();
        cartSteps.clickRemoveButton();
        cartSteps.clickOnUndoButton();
        cartSteps.checkIfProductIsAddedToCart("Beanie");

    }

    @Test
    public void updateProductQuantity(){
        cartSteps.navigateToShopPage();
        cartSteps.addProductToCart();
        cartSteps.navigateToCartPage();
        cartSteps.insertNewQuantity("2");
        cartSteps.clickUpdateButton();
        cartSteps.checkUpdateQuantity("Cart updated.");
    }
    @Test

    public void updateProductQuantityFromProductPage(){
        cartSteps.navigateToShopPage();
        cartSteps.addProductToCart();
        cartSteps.navigateToCartPage();
        cartSteps.clickProductName();
        cartSteps.insertNewQuantity("2");
        cartSteps.clickAddButton();
        cartSteps.navigateToCartPage();
        cartSteps.checkUpdateFromProductPage("3");
    }




}
