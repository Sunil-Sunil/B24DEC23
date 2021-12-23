package Scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.BaseTeestMedicine;
import Generic.ExcelMedicine;

public class DemoHomePageMedicine extends BaseTeestMedicine {
	@Test
	public void testA() {
		String data=ExcelMedicine.getData(XL_PATH, "Sheet1", 0, 0);
		Reporter.log("XL Data:"+data,true);
		Reporter.log("Demo test",true);
	}

}
