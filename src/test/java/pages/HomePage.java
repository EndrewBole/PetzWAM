package pages;

import general.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends Base {

    @FindBy(id = "search")
    private WebElement txtInputSearch;

    @FindBy(css = "button.button-search")
    private WebElement btnSearch;


    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void search(String product){
        txtInputSearch.click();
        txtInputSearch.clear();
        txtInputSearch.sendKeys(product);
    }

    public void searchWithMagnifierButton(String product){
        search(product);
        btnSearch.click();
    }

    public void searchWithEnterKey (String product){
        search(product);
        txtInputSearch.sendKeys(Keys.ENTER);
    }

}
