package Pages;


import Utilities.MyMethods;
import Utilities.BaseDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LocatorPage extends MyMethods {

    public LocatorPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(css = "a[class=\"login\"]")
    private WebElement signin;

    @FindBy(css = "input[id=\"email_create\"]")
    private WebElement emailAddress;

    @FindBy(css = "button[name=\"SubmitCreate\"]")
    private WebElement createAnAccount;

    @FindBy(css = "input[id=\"id_gender1\"]")
    private WebElement maleGender;

    @FindBy(css = "input[id=\"customer_firstname\"]")
    private WebElement firstName;

    @FindBy(css = "input[id=\"customer_lastname\"]")
    private WebElement lastName;

    @FindBy(css = "input[id=\"email\"]")
    private WebElement email;

    @FindBy(css = "input[id=\"passwd\"]")
    private WebElement passWord;

    @FindBy(css = "select[id=\"days\"]")
    private WebElement days;

    @FindBy(css = "select[id=\"months\"]")
    private WebElement months;

    @FindBy(css = "select[id=\"years\"]")
    private WebElement years;

   @FindBy(xpath = "//span[text()=\"Register\"]")
   private WebElement register;


    public WebElement getSignin() {
        return signin;
    }

    public WebElement getEmailAddress() {
        return emailAddress;
    }

    public WebElement getCreateAnAccount() {
        return createAnAccount;
    }

    public WebElement getMaleGender() {
        return maleGender;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassWord() {
        return passWord;
    }

    public WebElement getDays() {
        return days;
    }

    public WebElement getMonths() {
        return months;
    }

    public WebElement getYears() {
        return years;
    }

    public WebElement getRegister() {
        return register;
    }

    public List<WebElement> getSubtabs() {
        List<WebElement> subtabs = null;
        return subtabs;
    }
}
