package qa3.fasttrackit.org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends PageObject {

    @FindBy(css = ".product-name a")
    private WebElementFacade productText;//product name

    @FindBy(css = ".remove")
    private  WebElementFacade  removeLink;//link remove product

    @FindBy(css = "button[name='update_cart']")
    private WebElementFacade updateButton;//update button

    @FindBy(css = "input[step='1']")
    private  WebElementFacade quantityField;//field input quantity

    @FindBy(css = ".restore-item")
    private WebElementFacade undoLink;//button restore product deleted

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade messageUpdate;


    public void checkProduct(String productName){
        productText.shouldContainText(productName);
    }

    public void clickProduct(){
        clickOn(productText);
    }
    public void clickRemove(){
        clickOn(removeLink);
    }

    public void clickUpdate(){
        clickOn(updateButton);
    }
    public void addQuantity(String qty){
        typeInto(quantityField,qty);
    }

    public void clickUndo(){
        clickOn(undoLink);
    }
    public void checkRemove(){
        element(undoLink).shouldBeVisible();
    }

    public void checkUpdate(String message){
      element(messageUpdate).shouldContainText(message);

    }

    /////
    public void checkUpdate1(String qty) {
    quantityField.shouldContainElements(qty);

    }


}
