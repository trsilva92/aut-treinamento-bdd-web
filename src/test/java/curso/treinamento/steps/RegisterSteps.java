package curso.treinamento.steps;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.LoginPage;
import curso.treinamento.pages.RegisterPage;
import curso.treinamento.setup.Hooks;

public class RegisterSteps {

    private LoginPage loginPage = new LoginPage(Hooks.getDriver());
    private RegisterPage registroPage = new RegisterPage(Hooks.getDriver());

    @Dado("^que eu esteja na tela de Registro$")
    public void queEuEstejaNaTelaDeRegistro() throws Throwable {
        loginPage.clickRegiser();

    }

    @Quando("^faço o preenchimento das informações da tela de Register$")
    public void façoOPreenchimentoDasInformaçõesDaTelaDeRegister(DataTable datatable) throws Exception {

    }


    @Então("^eu sou registrado com sucesso$")
    public void euSouRegistradoComSucesso() throws Throwable {

    }
}
