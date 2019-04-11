package curso.treinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@src='/images/masts/mast_register.gif']")
    WebElement titlePage;

    @FindBy(name = "firstName")
    WebElement campoFirstName;

    @FindBy(xpath = "//input[@name='lastName'][@size='20']")
    WebElement campoLastNome;

    @FindBy(name = "phone")
    WebElement campoPhone;

    @FindBy(xpath = "//input[@name = 'phone']//following::input[1]")
    WebElement campoEmail;

    @FindBy(name = "address1")
    WebElement campoAddress1;

    @FindBy(name = "address2")
    WebElement campoAddress2;

    @FindBy(name = "city")
    WebElement campoCity;

    @FindBy(name = "state")
    WebElement campoStateProvince;

    @FindBy(name = "postalCode")
    WebElement campoPostalCode;

    @FindBy(name = "country")
    WebElement comboboxCountry;

    @FindBy(id = "email")
    WebElement campoUserName;

    @FindBy(name = "password")
    WebElement campoPassword;

    @FindBy(name = "confirmPassword")
    WebElement campoConfirmPassword;

    @FindBy(name = "register")
    WebElement botaoRegister;

    public void preencherContactInformation(String firstName, String lastName, String phone, String email) {

        campoFirstName.sendKeys(firstName);
        campoLastNome.sendKeys(lastName);
        campoPhone.sendKeys(phone);
        campoEmail.sendKeys(email);

    }

    public void preencherMailingInformation(String address1, String address2, String city,
                                            String stateProvince, String postalCode, String country) {


        campoAddress1.sendKeys(address1);
        campoAddress2.sendKeys(address2);
        campoCity.sendKeys(city);
        campoStateProvince.sendKeys(stateProvince);
        campoPostalCode.sendKeys(postalCode);
        comboboxCountry.sendKeys(country);
    }

    public void preencherUserInformation(String userName, String password, String confirmPassword) {

        campoUserName.sendKeys(userName);
        campoPassword.sendKeys(password);
        campoConfirmPassword.sendKeys(confirmPassword);
    }
}
