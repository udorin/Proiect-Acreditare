package qa3.fasttrackit.org.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")
public class Homepage extends PageObject {

    @FindBy(css ="a[title='Login']")
   private  WebElementFacade sign;//link to sign in and register

    @FindBy(css = ".fa-shopping-cart")
    private WebElementFacade cart;//link to cart page

    @FindBy(css = "a[href*='blog']")
    private WebElementFacade blog;//link to blog page

    @FindBy(css = "a[href*='shop']")
    private WebElementFacade shop;//link to shop page

    @FindBy(css = "a[href*='checkout']")
    private WebElementFacade checkout;//link to checkout page

    @FindBy(css=" #menu-item-1730 a[href*='my-account']")
    private WebElementFacade myAccount;//link to my account page

    @FindBy(css = ".search-btn")
    private WebElementFacade search;//search button

    @FindBy(css = ".search-field")
    private WebElementFacade searchField;//search field

    @FindBy(css = ".search-submit" )
    private WebElementFacade searchSubmit;//button submit search

    public void clickSignInLink(){

        clickOn(sign);
    }

    public void clickCart(){
        clickOn(cart);
    }

    public void clickBlog(){
        clickOn(blog);
    }
    public void clickShop(){
        clickOn(shop);
    }
    public void clickCheckout(){
        clickOn(checkout);
    }

    public void clickMyAccount(){
        clickOn(myAccount);
    }
    public void clickSearchBtn(){
        clickOn(search);
    }

    public void writeIntoSearchFiel(String text){
        typeInto(searchField,text);
    }
    public void clickSubmitSearchBtn(){
        clickOn(searchSubmit);
    }

    }

