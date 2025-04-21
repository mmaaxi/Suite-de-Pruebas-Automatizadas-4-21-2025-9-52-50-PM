package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page loginPage;

    @Given("el usuario está en la página de login")
    public void el_usuario_esta_en_la_pagina_de_login() {
        driver = new ChromeDriver();
        loginPage = new tc_002Page(driver);
        driver.get("URL_DE_LA_PAGINA_DE_LOGIN");
    }
    
    @When("el usuario ingresa credenciales inválidas")
    public void el_usuario_ingresa_credenciales_invalidas() {
        loginPage.ingresarCredenciales("usuario_incorrecto", "contraseña_incorrecta");
    }

    @And("intenta iniciar sesión")
    public void intenta_iniciar_sesion() {
        loginPage.clicEnLogin();
    }

    @Then("el sistema muestra un mensaje de error")
    public void el_sistema_muestra_un_mensaje_de_error() {
        Assert.assertTrue(loginPage.seMuestraErrorLogin());
    }

    @And("el acceso es denegado")
    public void el_acceso_es_denegado() {
        Assert.assertFalse(loginPage.sePermiteElAcceso());
        driver.quit();
    }
}