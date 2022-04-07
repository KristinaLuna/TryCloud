package com.trycloud.step_definitions;

import com.trycloud.pages.FilesModulePage;
import com.trycloud.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_09_FileComment_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    FilesModulePage move = new FilesModulePage();

    @When("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        move.actionIcons.click();
    }
    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {
        move.details.click();
        move.comments.click();
        move.message.sendKeys("good job");
    }
    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {

        move.submitMessage.click();

    }
    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {

        String actualText = move.seePost.getText();
        String expectedText="good job";
        Assert.assertEquals(expectedText,actualText);


    }
}
