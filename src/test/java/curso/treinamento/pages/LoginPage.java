package curso.treinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "userName")
    WebElement campoUsuario;

    @FindBy(name = "password")
    WebElement campoPassword;

    @FindBy(name = "login")
    WebElement botaoSign;

    @FindBy(linkText = "signoff")
    WebElement linkSignOff;

    @FindBy(linkText = "REGISTER")
    WebElement linkRegister;

    public boolean checkPage() {
        return botaoSign.isDisplayed();
    }

    public void realizarLogin(String user, String senha) {

        campoUsuario.sendKeys(user);

        campoPassword.sendKeys(senha);

        botaoSign.click();
    }

    public boolean checkSignOff() {
        return linkSignOff.isDisplayed();
    }

    public void clickRegiser() {
        linkRegister.click();
    }
}
