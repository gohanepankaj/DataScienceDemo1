package AMZGlueCode;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import AMZPages.AddtoCart;
import AMZPages.SearchBox;
import AMZPages.proceedtoPay;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AMZStepdef {
	RemoteWebDriver driver;
	public SearchBox obj1;
	public AddtoCart obj2;
	public proceedtoPay obj3;
	@Given ("open {string} browser")
	public void methode1(String b)
	{
		if(b.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			obj1=new SearchBox(driver);
			obj2=new AddtoCart(driver);
			obj3=new proceedtoPay(driver);
		}
	}
	@And ("launch site using{string}")
	public void methode2(String url)throws Exception
	{
		driver.get(url);
		Thread.sleep(5000);
	}
	@When ("do serch in search box with product name{string}")
	public void methode3(String SN)
	{
		obj1.fillSearchbox(SN);
		obj1.searchclick();
	}
	@Then ("selected product is display")
	public void methode4()
	{
		if(obj2.isProductDisplay())
		{
			System.out.println("yaaa it is display");
		}
		else
		{
			System.out.println("not at all");
		}
	}
	@And ("add to the With same product")
	public void methode5()
	{
		obj2.addtocart();
	}
	@Then ("checkout product is display in cart")
	public void methode6()
	{
	    if(obj2.isshoesdisplya())
	    {
			System.out.println("yaaa it is display in cart");
	    }
	    else
		{
			System.out.println("not in cart");
		}
	}
	@And ("proceed to buy product")
	public void methode7()
	{
		obj2.isproceedtobuy();
	}
	@Then ("proceed to pay now")
	public void method8()
	{
	
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
