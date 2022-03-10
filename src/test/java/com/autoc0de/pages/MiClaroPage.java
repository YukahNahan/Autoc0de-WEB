package com.autoc0de.pages;


import com.autoc0de.core.utility.MasterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class MiClaroPage extends MasterPage {

    SoftAssert softAssert = new SoftAssert();

    /*
     ** CONSTANTS **
     */

    private final String HOME_TITLE_ID = "section-home";
    private final String ENTER_NOW_BUTTON_ID = "entrar-ahora-link";
    private final String USUARIO_INPUT_ID = "username";
    private final String PASS_INPUT_ID = "password";
    private final String INGRESAR_BUTTON_ID = "kc-login";
    private final String HOME_ID_XPATH = "//h1[@class='Typography_body1__1E6mR Typography_font-weight-500__3NvYX Typography_text-center__22zE6 Typography_h1__1LmMj TotalAPagar_blanco__10mhd helpers_margin-bottom-15__1cQfQ']";

    /*
     ** //FUNCTIONS **
     */

    public void verifyHomeTitle(){
        Assert.assertTrue(auto_isElementVisible(By.id(HOME_TITLE_ID)));
    }

    public void clickOnEnterNow(){
        auto_setClickElement(By.id(ENTER_NOW_BUTTON_ID));
    }

    public void completeMiClaroLoginData(String email, String pass){
        auto_waitForElementPresence(By.id(USUARIO_INPUT_ID));
        auto_setTextToInput(By.id(USUARIO_INPUT_ID), email);
        auto_setTextToInput(By.id(PASS_INPUT_ID), pass);
    }

    public void clickButtonIngresar(){
        auto_setClickElement(By.id(INGRESAR_BUTTON_ID));
    }

    public void verifyLogin(){
        auto_waitForElementPresence(By.xpath(HOME_ID_XPATH));
//        Assert.assertTrue(auto_getElementText(By.xpath(HOME_ID_XPATH)).toLowerCase().contains("Total a pagar actualizado"), "La contraseña ingresada es incorrecta");
    }

}
