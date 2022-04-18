package Com.Crm.Tests.Ts;

import com.generic.ExcelUtil;
import com.generic.IAutoConstant;

public class sample2 {
	
	public void launchingbrowser() throws Throwable
	{
		ExcelUtil excelUtil = new ExcelUtil();
		
		int lastrow=excelUtil.getRowCount(IAutoConstant.excelpath, "Sheet1");
		
		for (int i = 0; i <= lastrow; i++) 
		{
			int salary=excelUtil.readNumericdatafromExcel(IAutoConstant.excelpath, "Sheet1", i, 1);
			
		     if(salary>32000)
               {
		          String name=excelUtil.readStringdatafromExcel(IAutoConstant.excelpath, "Sheet1", i, 0);
		           System.out.println(name);
		        }
		
		}	
	}

}