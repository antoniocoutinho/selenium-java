package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InformacoesUsuarioTest {
    private WebDriver navegador;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        //Opening the browser
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        //Navigating to task It
        navegador.get("http://www.juliodelima.com.br/taskit");

    }

    @Test
    public void testAdicionarInfoUser(){

        WebElement LinkSignIn  = navegador.findElement(By.linkText("Sign in"));
        LinkSignIn.click();
        WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));
        formularioSignInBox.findElement(By.name("login")).sendKeys("test");
        formularioSignInBox.findElement(By.name("password")).sendKeys("123456");
        formularioSignInBox.findElement(By.linkText("SIGN IN")).click();
        WebElement me = navegador.findElement(By.className("me"));
        assertEquals(me.getText(),"Hi, test");

    }
    @After
    public void tearDown(){
        navegador.quit();
    }

}
