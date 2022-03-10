package com.autoc0de.steps;

import com.autoc0de.pages.MiClaroPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MiClaroSteps {

    /*
    ** PAGE INSTANCE
     */

    MiClaroPage miClaroPage = new MiClaroPage();

    @Given("^El usuario está en la pantalla de inicio de miclaro.claro.com.ar")
    public void theUserIsOnTheHomeScreenOfMiClaro() {
        miClaroPage.verifyHomeTitle();
    }

    @When("^El Usuario hace click en el boton ingresar ahora")
    public void theUserClickEnterNow() {
        miClaroPage.clickOnEnterNow();
    }

    @And("^El usuario completa los campos. Email: (.*) Contraseña: (.*)$")
    public void theUserCompleteTeUserInformationUsuarioUserContraseñaPass(String email, String pass) {
        miClaroPage.completeMiClaroLoginData(email, pass);

    }

    @And("^El Usuario hace click en el boton INGRESAR")
    public void theUserClickTheButtonIngresar() {
        miClaroPage.clickButtonIngresar();
    }

    @Then("^El usuario verifica que ha iniciado sesión.")
    public void elUsuarioVerificaLoggedInOK() {
        miClaroPage.verifyLogin();
    }
}
