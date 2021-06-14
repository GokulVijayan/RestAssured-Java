
package TestScripts;


import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Reports.ReportModifier;
import Reports.TestReportSteps;
import Pages.LoginPage;
import ProjectConfig.Setup;


@Listeners({ ReportModifier.class })
public class Login extends Setup{

	public static JSONArray inputjson;
	LoginPage loginPage;
	public JSONObject listOfInputs;
	
	
	public Login() throws Exception {
		testObjective = "To Verify that user is able to login to iroads application";		
		scriptName="IR001_LoginToApplication";
		loginPage=new LoginPage();	
		
	}
	
	@Test
	public void LoginTest() throws Exception {

		List<TestReportSteps> report = null;
	
		report = loginPage.LoginToApplication();
		// Add report
		finalreport.addAll(report);		


	}
	
}
