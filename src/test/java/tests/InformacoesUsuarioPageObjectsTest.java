package tests;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;
import suporte.AddContact;
import suporte.RemoveContact;
import suporte.Web;

import static org.junit.Assert.*;
@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "DDT.csv")

public class InformacoesUsuarioPageObjectsTest {
    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = Web.createChrome();
    }
    @Test
    public void testAdicionarInformacaoAdicionalDoUsuario(
            @Param(name = "user") String user,
            @Param(name = "pass") String pass,
            @Param(name = "contactType") String contactType,
            @Param(name = "contact") String contact,
            @Param(name = "ddtExpectedMessage") String ddtExpectedMessage
            ){
        String expectedMessage = new LoginPage(navegador)
                .clicarSignIn()
                .fazerLogin(user, pass)
                .clicarMe()
                .clicarAbaMoreDataAboutYou()
                .clicarBotaoAddMoreDataAboutYou()
                .selectType(contactType)
                .insertContact(contact)
                .clickSaveContactButton()
                .capturarTextoToast();

        assertEquals(expectedMessage, ddtExpectedMessage);
    }

    @Test
    public void testRemoveContact(){
        //Given i have a contact already added
        AddContact add = new AddContact(navegador);
        add.addUserContact("test","123456","Phone", "numeroMagico");
        //Then I want to remove the contact
        RemoveContact rmContact = new RemoveContact(navegador);
        rmContact.removeContact();
        String mensagemEsperada = new BasePage(navegador).capturarTextoToast();

        assertEquals(mensagemEsperada, "Rest in peace, dear phone!");
    }
    @After
    public void tearDown(){
        navegador.quit();
    }
}
