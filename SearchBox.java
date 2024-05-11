package AMZPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchBox {
	@FindBy(how=How.ID,using="twotabsearchtextbox")public WebElement search;
	@FindBy(xpath="//*[@type='submit']")public WebElement submit;

	public SearchBox(RemoteWebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void fillSearchbox(String SN)
	{
		search.sendKeys(SN);
	}
	public void searchclick() {
		submit.click();
	}

}
