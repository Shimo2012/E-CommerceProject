package StepDefinitions;

import Pages.LocatorPage;
import Utilities.BaseDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import java.util.List;

public class AllSteps extends BaseDriver {

   LocatorPage locator = new LocatorPage();

   @Given("Navigate to Presta Shop{int}")
   public void navigateToPrestaShop(int arg0) {
      driver.get("https://cleverppc.com/prestashop4/");


   }

   @When("Click On The Element")
   public void clickOnTheElement() {
      locator.signin.click();

   }

   @Then("Enter Data in Text Box")
   public void enterDataInTextBox() {


   }

      @And("Verification Is In Progress")
      public void verificationIsInProgress () {
      }
   }
