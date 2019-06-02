package suporte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import pages.LoginPage;

public class AddContact extends BasePage {

    public AddContact(WebDriver navegador){
        super(navegador);
    }


    public AddContact addUserContact(String user, String pass, String contactType, String contact){

        new LoginPage(navegador)
                .clicarSignIn()
                .fazerLogin(user, pass)
                .clicarMe()
                .clicarAbaMoreDataAboutYou()
                .clicarBotaoAddMoreDataAboutYou()
                .selectType(contactType)
                .insertContact(contact)
                .clickSaveContactButton();
                WebDriverWait wait = new WebDriverWait(navegador,10);
                wait.until(ExpectedConditions.stalenessOf(navegador.findElement(By.id("toast-container"))));
        return this;
    }

}
