package AMZPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {
	@FindBy(xpath="(//span[contains(text(),'Sneaker Casual Shoes for Men')])[1]")public WebElement checkout;
	@FindBy(how=How.ID,using="add-to-cart-button")public WebElement adding;
	@FindBy(how=How.NAME,using="proceedToRetailCheckout")public WebElement proceed;

	public AddtoCart(RemoteWebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public boolean isProductDisplay() {
		if(checkout.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void addtocart() {
		checkout.click();
		adding.click();
		
	}

	public boolean isshoesdisplya() {
		if(checkout.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void isproceedtobuy() {
		proceed.click();
		
	}
	
	

}
