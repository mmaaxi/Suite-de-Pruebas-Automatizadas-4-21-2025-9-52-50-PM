import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class tc_001Steps {
    WebDriver driver;
    tc_001Page loginPage;

    @Given("^el usuario está en la página de login$")
    public void elUsuarioEstaEnLaPaginaDeLogin() {
        driver = new ChromeDriver();
        driver.get("http://tu-url-de-login.com");
        loginPage = new tc_001Page(driver);
    }

    @When("^el usuario ingresa credenciales válidas$")
    public void elUsuarioIngresaCredencialesValidas() {
        loginPage.ingresarUsuario("usuario_valido");
        loginPage.ingresarContrasena("contrasena_valida");
    }

    @And("^hace clic en el botón de login$")
    public void haceClicEnElBotonDeLogin() {
        loginPage.hacerClicEnBotonLogin();
    }

    @Then("^el usuario es redirigido a la página principal$")
    public void elUsuarioEsRedirigidoALaPaginaPrincipal() {
        if(driver.getCurrentUrl().equals("http://url-de-pagina-principal.com")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        driver.quit();
    }
}