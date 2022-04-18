package Com.Crm.Tests.Ts;

import org.testng.annotations.Test;

import com.generic.ExcelUtil;
import com.generic.IAutoConstant;

public class Sample {
		
	/**
	 * 
	 * @throws Throwable
	 */

		@Test
		public void launchbrowser() throws Throwable 
		{
			ExcelUtil excelUtil = new ExcelUtil();
			int lastrow=excelUtil.getRowCount(IAutoConstant.excelpath, "Sheet1");

			for (int i = 0; i <= lastrow; i++) 
			{
				System.out.println(excelUtil.readStringdatafromExcel(IAutoConstant.excelpath, "Sheet1", i, 0));
			}
		}
	}
	

