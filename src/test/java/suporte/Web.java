package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Web {

    public static WebDriver createChrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");

        //Begin of Headless execution
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1200x600");
        WebDriver navegador = new ChromeDriver(options);
        //End of Headless execution

        // Opening the browser, visual execution
        //WebDriver navegador = new ChromeDriver();

        //To wait the elements be visible on screen before execute commands
        navegador.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        //Navigating to task It
        navegador.get("http://www.juliodelima.com.br/taskit");
        return navegador;
    }
}
