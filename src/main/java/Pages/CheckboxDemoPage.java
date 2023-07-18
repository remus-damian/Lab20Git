package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxDemoPage extends BasePage {

    public CheckboxDemoPage(WebDriver driver) {
        super(driver);
    }

    By ClickOnTheCheckBoxDemo = By.linkText("Checkbox Demo");
    public void ClickOnTheCheckBoxDemo() {driver.findElement(ClickOnTheCheckBoxDemo).click();
    }


    By SingleCheckbox = By.id("isAgeSelected");
    public void ClickOnSingleCheckbox() {driver.findElement(SingleCheckbox).click();
    }



    By FirstCheckboxOption = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/input");
    public void clickOnFirstCheckBoxOption() {driver.findElement(FirstCheckboxOption).click();}



    By SecondCheckboxOption = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/input");

    public void clickOnSecondChecboxOption() {driver.findElement(SecondCheckboxOption).click();}



    By ThirdCheckBoxOption = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[3]/input");
    public void clickOnThirdCheckboxOption () {driver.findElement(ThirdCheckBoxOption).click();}

    By ForthCheckboxOption = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[4]/input");
    public void clickOnForthCheckboxOption (){driver.findElement(ForthCheckboxOption);}


    By CheckAllMultipleChecboxOption = By.id("box");

    public void clickOnCheckAllOption (){driver.findElement(CheckAllMultipleChecboxOption).click();}






}