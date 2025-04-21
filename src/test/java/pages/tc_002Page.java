package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    WebDriver driver;

    By campoUsuario = By.id("campo_usuario");
    By campoContrasena = By.id("campo_contrasena");
    By botonLogin = By.id("boton_login");
    By mensajeError = By.id("mensaje_error");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarCredenciales(String usuario, String contrasena) {
        driver.findElement(campoUsuario).sendKeys(usuario);
        driver.findElement(campoContrasena).sendKeys(contrasena);
    }

    public void clicEnLogin() {
        driver.findElement(botonLogin).click();
    }

    public boolean seMuestraErrorLogin() {
        return driver.findElement(mensajeError).isDisplayed();
    }

    public boolean sePermiteElAcceso() {
        // Implementa la verificación de acceso denegado
        return false; // Simulación de lógica para negación de acceso
    }
}