import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {
    WebDriver driver;
    
    By usuarioInput = By.id("input_usuario");
    By contrasenaInput = By.id("input_contrasena");
    By botonLogin = By.id("boton_login");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarUsuario(String usuario) {
        driver.findElement(usuarioInput).sendKeys(usuario);
    }
    
    public void ingresarContrasena(String contrasena) {
        driver.findElement(contrasenaInput).sendKeys(contrasena);
    }
    
    public void hacerClicEnBotonLogin() {
        driver.findElement(botonLogin).click();
    }
}