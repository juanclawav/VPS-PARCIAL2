package examen.web;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ejercicio4 extends testBaseTodoly {

    @Test
    public void VerifyP4() throws InterruptedException{
        mainPage.loginButton.click();
        loginSection.emailTextBox.setText("vanetejerina314@gmail.com");
        loginSection.pwdTextBox.setText("12345");
        loginSection.loginButton.click();

        Thread.sleep(5000);

        menuSection.settingsBtn.click();

        Thread.sleep(5000);


        settingsPage.oldPwdTxtBox.setText("12345");
        settingsPage.newPwdTxtBox.setText("123456");

        settingsPage.saveButton.click();

        Thread.sleep(5000);

        menuSection.logoutButton.click();

        Thread.sleep(5000);

        mainPage.loginButton.click();
        loginSection.emailTextBox.setText("jcctapi@jcctapi.com");
        loginSection.pwdTextBox.setText("123456");
        loginSection.loginButton.click();

        Thread.sleep(5000);
        Assertions.assertTrue(menuSection.settingsBtn.isControlDisplayed(), "ERROR, no se ha podido cambiar la contraseña");



    }

}
