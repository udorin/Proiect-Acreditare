package qa3.fasttrackit.org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckOutPage extends PageObject {

    @FindBy(css = ".woocommerce-notice")
    private WebElementFacade checkout;//checkout was successfully

    @FindBy(css = "#billing_first_name")
    private WebElementFacade firstName;//field first name

    @FindBy(css = "#billing_last_name")
    private WebElementFacade lastName;

    @FindBy(css = "input[name='billing_address_1']")
    private WebElementFacade streetAdress;//input field street address

    @FindBy(css = "input[name='billing_city']")
    private WebElementFacade city;//input field city name

    @FindBy(css = "input[name='billing_postcode']")
    private WebElementFacade zipCode;//input field zip code

    @FindBy(css = "input[name='billing_phone']")
    private WebElementFacade phone;//input field for phone number

    @FindBy(css = "input[name='billing_email']")
    private WebElementFacade email;// input field email address

    @FindBy(css = "button[value='Place order']")
    private WebElementFacade placeOrder;//button place order



}
