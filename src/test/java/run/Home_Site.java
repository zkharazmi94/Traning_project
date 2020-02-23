package run;

import org.testng.annotations.Test;

import Common.brosers;
import com.pages.Home;

public class Home_Site extends brosers {
  @Test
  public void f() {
	 // Com.pages.Home home=new Com.pages.Home(driver);
	  Home h= new Home(driver);
		h.Emailidfield("Zoha.kharazmi@yahoo.com");
		h.psswordfield("zk");
		h.loginbt();
		driver.navigate().back();
  }
}
