package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgPage {
WebDriver driver;
	
	//Rule-3:
	//Rule-3 Create separate java class for every page in application & initialze the elements 
		//By using pagefactory.initElement
	public CreateNewOrgPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Rule-2:Indentify all the elements by using findBy,findBys,find all
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgnametxtbox;
	
	@FindBy(name="industry")
	WebElement industrydd;
	

	@FindBy(name="accounttype")
	private WebElement typedd;

	@FindBy(name="rating")
	private WebElement ratngdd;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phonenotxtbox;
	
	
	

	public WebElement getOrgnametxtbox() {
		return orgnametxtbox;
	}

	public WebElement getIndustrydd() {
		return industrydd;
	}

	public WebElement getTypedd() {
		return typedd;
	}

	public WebElement getRatngdd() {
		return ratngdd;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getPhonenotxtbox() {
		return phonenotxtbox;
	}


}
