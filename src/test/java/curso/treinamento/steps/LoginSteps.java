package curso.treinamento.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    WebDriver driver = null;

    @Dado("^que eu esteja na tela de login$")
    public void queEuEstejaNaTelaDeLogin() throws Throwable {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://newtours.demoaut.com/");

    }

    @Quando("^faço login com o usuário \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void façoLoginComOUsuárioESenha(String user, String pass) throws Throwable {

        driver.findElement(By.name("userName")).sendKeys(user);

        driver.findElement(By.name("password")).sendKeys(pass);

        driver.findElement(By.name("login")).click();

    }

    @Entao("^sou autenticado com sucesso$")
    public void souAutenticadoComSucesso() throws Throwable {

        driver.quit();
    }
}
