package run;

import org.testng.annotations.Test;

import Common.brosers;
import com.pages.Home;

public class Forgot_psswd extends brosers {
  @Test
  public void f() {
	  Home h= new Home(driver);
		h.Emailidfield("Zoha.kharazmi@yahoo.com");
		h.psswordfield("zk");
		h.loginbt();
		driver.navigate().back();
  }
}
