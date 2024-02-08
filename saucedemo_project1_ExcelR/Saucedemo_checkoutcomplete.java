package saucedemo_project1_ExcelR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucedemo_checkoutcomplete {

	WebDriver driver;

	public void Saucedemo_checkoutcomplete(WebDriver wd) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()='Thank you for your order!']")
	private WebElement ThankyouText;
	@FindBy(xpath = "//*[contains(text(),'Your order has been dispatched')]")
	private WebElement CompleteText;
	@FindBy(id = "back-to-products")
	private WebElement BackHome;

	public String completeText() {
		return CompleteText.getText();
	}

	public WebElement BackHomeBtn() {
		return BackHome;
	}

	public void clickOnBackHomeBtn() {
		BackHome.click();
	}

	public String thankYouText() {
		return ThankyouText.getText();
	}
}
