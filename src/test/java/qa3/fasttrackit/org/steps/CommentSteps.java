package qa3.fasttrackit.org.steps;

import net.thucydides.core.annotations.Step;
import qa3.fasttrackit.org.pages.BlogPage;

public class CommentSteps {

    private BlogPage blogPage;

    @Step
    public void navigateToBlogPage() {
        blogPage.open();
    }

    @Step
    public void writeCommentIntoCommentField(String comment) {
        blogPage.writeComment(comment);
    }

    @Step
    public void writeAuthorName(String name) {
        blogPage.writeAuthor(name);
    }

    @Step
    public void writeAuthorEmail(String email){
        blogPage.writeEmail(email);
    }

    @Step
    public void writeAuthorWebsite(String website){
        blogPage.writeWebsite(website);
    }

    @Step
    public void clickPostCommentButton(){
        blogPage.clickPost();
    }
    @Step
    public void checkPostCommentWasSuccessfully(String authorName){
        blogPage.checkComment(authorName);
    }
    @Step
    public void checkPostCommentWasFailed(String errorMessage){
        blogPage.errorComment(errorMessage);
    }



}
