package qa3.fasttrackit.org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BlogPage extends PageObject {

    @FindBy(css = "#comment")
    private WebElementFacade comment;//comment field

    @FindBy(css = "#author")
    private WebElementFacade author;// field for author name

    @FindBy(css = "#email")
    private WebElementFacade email;// field for email author

    @FindBy(css = "#url")
    private WebElementFacade website;//field for enter author website

    @FindBy(css = "#submit")
    private WebElementFacade postComment;//button post comment

    @FindBy(css = ".fn")
    private WebElementFacade authorComment;// is author of the comment

    @FindBy(css = "p strong")
    private WebElementFacade error;//error text if you dont enter email and name



    public void writeComment(String commentF){
        typeInto(comment,commentF);
    }
    public void writeAuthorString(String AuthorName){
        typeInto(author, AuthorName);
    }

    public void writeEmail(String emaliA){
        typeInto(email,emaliA);
    }

    public void writeWebsite(String websiteA){
        typeInto(website,websiteA);
    }
    public void clickPost(){
        clickOn(postComment);
    }

    public void checkComment(String authorName){
        authorComment.shouldContainText(authorName);
    }


    public void errorComment(String errorMessage){
        error.shouldContainText(errorMessage);
    }



}
