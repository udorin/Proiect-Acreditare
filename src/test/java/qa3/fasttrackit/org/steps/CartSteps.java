package qa3.fasttrackit.org.steps;


import net.thucydides.core.annotations.Step;
import qa3.fasttrackit.org.pages.CartPage;
import qa3.fasttrackit.org.pages.Homepage;
import qa3.fasttrackit.org.pages.ProductPage;
import qa3.fasttrackit.org.pages.ShopPage;

public class CartSteps{

   private  ShopPage shopPage;
   private Homepage homepage;
   private CartPage cartPage;
   private ProductPage productPage;

   @Step
    public void navigateToShopPage(){
       shopPage.open();

   }
   @Step
    public void addProductToCart(){
       shopPage.clickAddToCart();
   }
   @Step
    public void navigateToCartPage(){
       homepage.clickCart();
   }
   @Step
    public void checkIfProductIsAddedToCart(String productName){
       cartPage.checkProduct(productName);
   }
    @Step
    public void clickOnUndoButton(){
       cartPage.clickUndo();
    }
    @Step
    public void checkIfProductWasDeleted(){
       cartPage.checkRemove();
    }
    @Step
    public void clickRemoveButton(){
       cartPage.clickRemove();
    }
    @Step
    public void checkProductWasRemove(){
       cartPage.checkRemove();
    }

    @Step
    public void insertNewQuantity(String qty){
       cartPage.addQuantity(qty);
    }
    @Step
    public void clickUpdateButton(){
       cartPage.clickUpdate();
    }
    @Step
    public void checkUpdateQuantity(String message){
       cartPage.checkUpdate(message);
    }

    @Step
    public void clickProductName(){
       cartPage.clickProduct();
    }

    @Step
    public void clickAddButton(){
       productPage.clickAddButton();
    }


}