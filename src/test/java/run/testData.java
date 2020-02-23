package run;

import org.testng.annotations.Test;

import com.pages.Home;

import Common.brosers;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class testData extends brosers {
  @Test(dataProvider = "signin")
  public void f(String n,String s) {
	  Home h= new Home(driver);
		h.Emailidfield(n);
		h.psswordfield(s);
		h.loginbt();
		driver.navigate().back();
		h.clear();
		//to add in report
		Reporter.log("Executed successfully");
  }
  
  
  @DataProvider
  public Object[][] signin(){
	 return new Object [][] {
		 new Object[] {"zkharami@gamil","a"},
		 new Object[] {"payman@gamil","b"},
		 new Object[] {"hassan@gamil","c"},
	
  };
  }
}
  
