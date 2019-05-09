package qa3.fasttrackit.org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends PageObject {

    @FindBy(css = ".product-name a")
    private WebElementFacade product;//product name

    @FindBy(css = ".remove")
    private  WebElementFacade  remove;//link remove product

    @FindBy(css = "button[name='update_cart']")
    private WebElementFacade update;//update button

    @FindBy(css = "input[step='1']")
    private  WebElementFacade quantity;//field input quantity

    @FindBy(css = ".restore-item")
    private WebElementFacade undo;//button restore product deleted

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade messageUpdate;


    public void checkProduct(String productName){
        product.shouldContainText(productName);
    }

    public void clickProduct(){
        clickOn(product);
    }
    public void clickRemove(){
        clickOn(remove);
    }

    public void clickUpdate(){
        clickOn(update);
    }
    public void addQuantity(String qty){
        typeInto(quantity,qty);
    }

    public void clickUndo(){
        clickOn(undo);
    }
    public void checkRemove(){
        element(undo).shouldBeVisible();
    }

    public void checkUpdate(String message){
      element(messageUpdate).shouldContainText(message);

    }
    public void checkUpdate1(String qty){
        quantity.getValue().equals(qty);

    }


}
