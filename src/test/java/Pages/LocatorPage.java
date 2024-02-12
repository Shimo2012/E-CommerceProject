package Pages;


import Utilities.BaseDriver;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LocatorPage extends Parent {

    public LocatorPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(css = "a[class=\"login\"]")
    public WebElement signin;

    @FindBy(css = "input[id=\"email_create\"]")
    public WebElement emailAddress;

    @FindBy(css = "button[name=\"SubmitCreate\"]")
    public WebElement createAnAccount;

    @FindBy(css = "input[id=\"id_gender1\"]")
    public WebElement maleGender;

    @FindBy(css = "input[id=\"customer_firstname\"]")
    public WebElement firstName;

    @FindBy(css = "input[id=\"customer_lastname\"]")
    public WebElement lastName;

    @FindBy(css = "input[id=\"email\"]")
    public WebElement email;

    @FindBy(css = "input[id=\"passwd\"]")
    public WebElement passWord;

    @FindBy(css = "select[id=\"days\"]")
    public WebElement days;

    @FindBy(css = "select[id=\"months\"]")
    public WebElement months;

    @FindBy(css = "select[id=\"years\"]")
    public WebElement years;

   @FindBy(xpath = "//span[text()=\"Register\"]")
   public WebElement register;



    public List<WebElement> getSubtabs() {
        List<WebElement> subtabs = null;
        return subtabs;
    }
}
