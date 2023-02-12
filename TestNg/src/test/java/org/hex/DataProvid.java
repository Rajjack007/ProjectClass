package org.hex;

import org.testng.annotations.Test;

public class DataProvid {
	
	@Test(dataProvider="raj",dataProviderClass=BaseClass.class)
	private void classA(String s, String s1) {
		BaseClass b = new BaseClass();
		b.launchBrowser();
		b.launchUrl();
		b.type(s, s1);
		b.btnClick();
	}

}
