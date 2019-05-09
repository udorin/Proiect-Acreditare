package qa3.fasttrackit.org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends PageObject {

    @FindBy(css = "button[value='48']")
    private WebElementFacade addButton;//add button

    public void clickAddButton(){
        clickOn(addButton);
    }

}
