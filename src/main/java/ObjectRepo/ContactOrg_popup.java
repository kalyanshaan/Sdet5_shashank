package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactOrg_popup {
	
	private static final WebDriver driver = null;

	//Rule:3 //Rule-3 Create separate java class for every page in application & initialze the elements 
	public ContactOrg_popup()
	{
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
			
			
			//Rule:2 Indentify all the elements by using findBy,findBys,findall
			
			public ContactOrg_popup(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}


			@FindBy(xpath="//input[@name='search_text']")
			private WebElement searchorgtxtfld;
			
			@FindBy(xpath="//input[@name='search']")
			private WebElement searchbtn;
			
			@FindBy(id="1")
			private WebElement selectorg;

			public WebElement getSearchorgtxtfld() {
				return searchorgtxtfld;
			}

			public WebElement getSearchbtn() {
				return searchbtn;
			}

			public WebElement getSelectorg() {
				return selectorg;
			}
			
			public void searchandSelectforOrg(String orgname) throws InterruptedException {
				getSearchorgtxtfld().sendKeys(orgname);
				getSearchbtn().click();
				Thread.sleep(6000);
				getSelectorg().click();
			}
			
			
			
}



