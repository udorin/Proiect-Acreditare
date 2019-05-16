package qa3.fasttrackit.org.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")
public class Homepage extends PageObject {

    @FindBy(css ="a[title='Login']")
   private  WebElementFacade signLink;//link to sign in and register

    @FindBy(css = ".fa-shopping-cart")
    private WebElementFacade cartLink;//link to cart page

    @FindBy(css = "a[href*='blog']")
    private WebElementFacade blogLink;//link to blog page

    @FindBy(css = "a[href*='shop']")
    private WebElementFacade shopLink;//link to shop page

    @FindBy(css = "a[href*='checkout']")
    private WebElementFacade checkoutLink;//link to checkout page

    @FindBy(css=" #menu-item-1730 a[href*='my-account']")
    private WebElementFacade myAccountLink;//link to my account page

    @FindBy(css = ".search-btn")
    private WebElementFacade searchButton;//search button

    @FindBy(css = ".search-field")
    private WebElementFacade searchField;//search field

    @FindBy(css = ".search-submit" )
    private WebElementFacade searchSubmitButton;//button submit search

    public void clickSignInLink(){

        clickOn(signLink);
    }

    public void clickCart(){
        clickOn(cartLink);
    }

    public void clickBlog(){
        clickOn(blogLink);
    }
    public void clickShop(){
        clickOn(shopLink);
    }
    public void clickCheckout(){
        clickOn(checkoutLink);
    }

    public void clickMyAccount(){
        clickOn(myAccountLink);
    }
    public void clickSearchBtn(){
        clickOn(searchButton);
    }

    public void writeIntoSearchFiel(String text){
        typeInto(searchField,text);
    }
    public void clickSubmitSearchBtn(){
        clickOn(searchSubmitButton);
    }

    }

