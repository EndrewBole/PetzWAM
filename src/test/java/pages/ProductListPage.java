package pages;

import general.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductListPage extends Base {
    @FindBy(css = "h1.h2Categoria.nomeCategoria")
    private WebElement lblResult;

    public ProductListPage(WebDriver driver) {
        super(driver);
    }

    public String readResultBy(){
        return lblResult.getText();
    }

    public String readTabTitle(){
        return driver.getTitle();
    }

    public void clickAtProduct(String product){
        driver.findElement(By.xpath("//h3[contains(text(), '"+product+"')]")).click();
    }

}
