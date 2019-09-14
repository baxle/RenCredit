package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MainPage extends BasePageObject{

    public MainPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//div")
    WebElement menuItems;

    @FindBy(xpath = "//div[@class='footer footer_main']")
    WebElement element;

    public void selectMenuItem(String itemName){
        ((JavascriptExecutor) BaseSteps.getDriver()).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        BaseSteps.getDriver().findElement(By.xpath("//*[contains(@class,'footer__nav-link underline-link')][contains(text(), '"+itemName+"')]")).click();
    }

}
