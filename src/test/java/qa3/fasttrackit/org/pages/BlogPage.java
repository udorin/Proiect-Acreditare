package qa3.fasttrackit.org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008/blog")
public class BlogPage extends PageObject {

    @FindBy(css = "#comment")
    private WebElementFacade commentField;//comment field

    @FindBy(css = "#author")
    private WebElementFacade authorField;// field for author name

    @FindBy(css = "#email")
    private WebElementFacade emailField;// field for email author

    @FindBy(css = "#url")
    private WebElementFacade websiteField;//field for enter author website

    @FindBy(css = "#submit")
    private WebElementFacade postCommentButton;//button post comment

    @FindBy(css = ".fn")
    private WebElementFacade authorCommentText;// is author of the comment

    @FindBy(css = "p strong")
    private WebElementFacade errorText;//error text if you dont enter email and name



    public void writeComment(String commentF){
        typeInto(commentField,commentF);
    }
    public void writeAuthor(String AuthorName){
        typeInto(authorField, AuthorName);
    }

    public void writeEmail(String emaliA){
        typeInto(emailField,emaliA);
    }

    public void writeWebsite(String websiteA){
        typeInto(websiteField,websiteA);
    }
    public void clickPost(){
        clickOn(postCommentButton);
    }

    public void checkComment(String authorName){
        authorCommentText.shouldContainText(authorName);
    }


    public void errorComment(String errorMessage){
        errorText.shouldContainText(errorMessage);
    }



}
