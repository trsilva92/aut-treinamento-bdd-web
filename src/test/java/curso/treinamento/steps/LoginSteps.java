package curso.treinamento.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.LoginPage;
import curso.treinamento.setup.Hooks;
import org.junit.Assert;

public class LoginSteps {

    private LoginPage loginPage = new LoginPage(Hooks.getDriver());

    @Dado("^que eu esteja na tela de login$")
    public void queEuEstejaNaTelaDeLogin() throws Throwable {

        Assert.assertTrue("Página login não foi apresentada",loginPage.checkPage());
    }

    @Quando("^faço login com o usuário \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void façoLoginComOUsuárioESenha(String user, String pass) throws Throwable {

        loginPage.realizarLogin(user, pass);
    }

    @Entao("^sou autenticado com sucesso$")
    public void souAutenticadoComSucesso() throws Throwable {

        Assert.assertFalse("Login não realizado", loginPage.checkSignOff());
    }
}
