package StepDefinitions;

import Pages.LocatorPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class MyStepdefs extends BaseDriver{

    LocatorPage locator = new LocatorPage();

    @Given("Navigate to Presta Shop")
    public void navigateToPrestaShop() {
        driver.get("https://cleverppc.com/prestashop4");

    }

    @And("Click On signIn")
    public void clickOnSignIn() {
        locator.clickFunction(locator.getSignin());
    }


    @Then("Enter {string} into the email text box")
    public void enterIntoTheEmailTextBox(String email) {

        locator.enterText("emailTextBox", email);

    }
    @And("Click on create Account Button")
    public void clickOnCreateAccountButton() {
        locator.clickFunction(locator.getCreateAnAccount());
    }

    @And("Click On gender male button")
    public void clickOnGenderMaleButton() {
        locator.clickFunction(locator.getMaleGender());
    }

    @And("Enter Data in Text Box")
    public void enterDataInTextBox(DataTable dataTable) {

        List<List<String>> data = dataTable.asLists(String.class);
        locator.getMaleGender().click();
        locator.getFirstName().sendKeys(data.get(0).get(1));
        locator.getLastName().sendKeys(data.get(1).get(1));
        locator.getEmail().sendKeys(data.get(2).get(2));
        locator.getPassWord().sendKeys(data.get(3).get(3));

    }

    @When("Click On  Register")
    public void clickOnRegister() {
        locator.clickFunction(locator.getRegister());
    }

    @Then("Success message of success should be displayed")
    public void successMessageOfSuccessShouldBeDisplayed() {
      //  locator.clickFunction(locator.getsuccessMessage);
       // Assert.assertEquals("Registration successful, successMessage.getText);
    }
}

