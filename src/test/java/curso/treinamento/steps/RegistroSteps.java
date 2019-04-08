package curso.treinamento.steps;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class RegistroSteps {

    WebDriver driver = null;

    @Dado("^que eu esteja na tela de Registro$")
    public void queEuEstejaNaTelaDeRegistro() throws Throwable {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://newtours.demoaut.com/");

        driver.findElement(By.linkText("REGISTER")).click();

        Assert.assertTrue("Página 'Register' NÃO apresentada com sucesso.", driver.findElement(By.xpath("//img[@src='/images/masts/mast_register.gif']")).isDisplayed());

    }

    @Quando("^faço o preenchimento das informações da tela de Register$")
    public void façoOPreenchimentoDasInformaçõesDaTelaDeRegister(DataTable datatable) throws Exception {
        List<Map<String, String>> list = datatable.asMaps(String.class, String.class);

        driver.findElement(By.name("firstName")).sendKeys(list.get(0).get("First Name"));

        //driver.findElement(By.name("lastName")).sendKeys(list.get(0).get("Last Name"));
        driver.findElement(By.xpath("//input[@name='lastName'][@size='20']")).sendKeys(list.get(0).get("Last Name"));

        //b[(text()= 'Phone:')]
        driver.findElement(By.name("phone")).sendKeys(list.get(0).get("Phone"));

        //input[@name = 'phone']//following::input[1]
        driver.findElement(By.id("userName")).sendKeys(list.get(0).get("Email"));

        driver.findElement(By.name("address1")).sendKeys(list.get(0).get("Address"));

        driver.findElement(By.name("address2")).sendKeys(list.get(0).get("Complement"));

        driver.findElement(By.name("city")).sendKeys(list.get(0).get("City"));

        driver.findElement(By.name("state")).sendKeys(list.get(0).get("State"));

        //input[@name = 'phone']//following::input[@name='postalCode']
        driver.findElement(By.name("postalCode")).sendKeys(list.get(0).get("Cep"));

        //input[@name = 'phone']//following::select[1]
        final Select selectBox = new Select(driver.findElement(By.name("country")));
        selectBox.selectByValue("26");

        //input[@name = 'password']//preceding::input[1]
        driver.findElement(By.id("email")).sendKeys(list.get(0).get("User"));

        driver.findElement(By.name("password")).sendKeys(list.get(0).get("Pass"));

        driver.findElement(By.name("confirmPassword")).sendKeys(list.get(0).get("Confirm Pass"));

        driver.findElement(By.name("register")).click();

    }


    @Então("^eu sou registrado com sucesso$")
    public void euSouRegistradoComSucesso() throws Throwable {

        Assert.assertTrue("Mensagem não Encontrada", driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).isDisplayed());
        Thread.sleep(2000);

        driver.quit();
    }
}
