package suporte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import static java.lang.Thread.sleep;

public class RemoveContact extends BasePage {

    public RemoveContact(WebDriver navegador){
        super(navegador);
    }
    public RemoveContact removeContact() {
        navegador.findElement(By.xpath("//span[text()=\"numeroMagico\"]//following-sibling::a")).click();
        navegador.switchTo().alert().accept();
        return this;
    }
}
