package qa3.fasttrackit.org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckOutPage extends PageObject {

    @FindBy(css = ".woocommerce-notice")
    private WebElementFacade checkoutField;//checkout was successfully

    @FindBy(css = "#billing_first_name")
    private WebElementFacade firstNameField;//field first name

    @FindBy(css = "#billing_last_name")
    private WebElementFacade lastNameField;

    @FindBy(css = "input[name='billing_address_1']")
    private WebElementFacade streetAdressField;//input field street address

    @FindBy(css = "input[name='billing_city']")
    private WebElementFacade cityField;//input field city name

    @FindBy(css = "input[name='billing_postcode']")
    private WebElementFacade zipCodeField;//input field zip code

    @FindBy(css = "input[name='billing_phone']")
    private WebElementFacade phoneField;//input field for phone number

    @FindBy(css = "input[name='billing_email']")
    private WebElementFacade emailField;// input field email address

    @FindBy(css = "button[value='Place order']")
    private WebElementFacade placeOrderField;//button place order



}
