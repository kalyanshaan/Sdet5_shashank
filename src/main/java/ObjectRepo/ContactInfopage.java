package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.webDriverUtils;

public class ContactInfopage {
	public WebElement getClickbtn() {
		return getClickbtn();
	}

	WebDriver driver;

	public ContactInfopage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createcontactsimg;
	
	public WebElement getCreatecontactsimg() {
		return createcontactsimg;
	}
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement createorgbtn;

	@FindBy(name="search_text")
	private WebElement searchcontacttxtfld;

	@FindBy(name="submit")
	private WebElement searchcontactbtn;
	
	
	
	public WebElement getCreateorgbtn() {
		return getCreateorgbtn();
	}

	public WebElement getSearchcontacttxtfld() {
		return searchcontacttxtfld;
	}

	public WebElement getSearchcontactbtn() {
		return searchcontactbtn;
	}
	@FindBy(id="bas_searchfield")
	private WebElement searchforcontactDD;

	public WebElement getSearchforcontactDD() {
		return searchforcontactDD;
	}

	public void checkcontactcreated(String contactname,String text) 
	{
		getSearchcontacttxtfld().sendKeys(contactname);
		webDriverUtils driverUtils = new  webDriverUtils(driver);
		driverUtils.selectbyvisibleText(text, getSearchforcontactDD());
		getSearchcontactbtn().click();
	}

	
	

}	