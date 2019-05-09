package qa3.fasttrackit.org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/shop")
public class ShopPage extends PageObject {

    @FindBy(css = "select[name='orderby']")
    private WebElementFacade sort;//drop menu sort

    @FindBy(css = "a[data-product_id='73']")
    private WebElementFacade readMore;//read more link from album product

    @FindBy(css = "a[href*='48']")
    private WebElementFacade addToCart;//ad to cart button beanie

    @FindBy(css = "img[src*='beanie-2']")
    private WebElementFacade productPage;//link beanie product page

    @FindBy(css = ".next")
    private WebElementFacade nextPage;//button next page

    @FindBy(css = ".prev")
    private  WebElementFacade prevPage;//button prev page


    public void selectOptionSort(int option,String text){
        element(sort).selectByIndex(option);
        element(sort).shouldContainText(text);
    }

    public void clickReadMore(){
        clickOn(readMore);
    }

    public void clickAddToCart(){
        clickOn(addToCart);
    }
    public void clickProductPage(){
        clickOn(productPage);
    }
    public void goNextPage(){
        clickOn(nextPage);
    }
    public void goPrevPage(){
        clickOn(prevPage);
    }



}
