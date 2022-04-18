package Practice_pkg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MMD {

	@Test(dataProvider="providevalues")
	public void dataprovider(String src,String dest,String stop)
	{
		
	}
		@DataProvider
		public Object[][] providevalues()
		{
			Object obj[][]=new Object[2][3];
			obj[0][0]="hyd";
			obj[0][1]="mum";
			obj[0][2]="blr";
			
			
			obj[1][0]="delhi";
			obj[1][1]="kol";
			obj[1][2]="pun";
			
			return obj;
			
	}
	
}
