package examen.web;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class ejercicio3 extends testBaseTodoist{

    @Test
    public void testCreateUserCreateProject() throws InterruptedException{
        mainTodoistPage.registerBtn.click();
        Thread.sleep(5000);
        registerPage.emailTextBox.setText("jcctapi@abcde.com");
        registerPage.pwTextBox.setText("pass123");
        registerPage.registerBtn.click();
        Thread.sleep(5000);
        registerPage.accountNameTb.setText("Juan Claudio Test");
        registerPage.submitNameBtn.click();
        Thread.sleep(5000);
        registerPage.markPersonalBtn.click();
        registerPage.launchBtn.click();
        Assertions.assertTrue(workspace.profileButton.isControlDisplayed(),"ERRRROR NO SE CREO EL USUARIO");
        Thread.sleep(5000);
        workspace.addProjectBtn.click();
        Thread.sleep(5000);
        addProjectPopup.projectNameTb.setText("TEST WEB P2");
        addProjectPopup.submitBtn.click();
        Thread.sleep(5000);
        Assertions.assertTrue(workspace.listItem("TEST WEB P2").isControlDisplayed());
        Thread.sleep(5000);

    }
}
