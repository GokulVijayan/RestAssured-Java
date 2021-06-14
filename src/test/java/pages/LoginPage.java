package pages;





import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;


import GenericComponents.ReusableComponents;
import projectConfig.Setup;
import Reports.TestReportSteps;
import Utilities.ConfigFile;
import Utilities.Time;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import testDataClasses.LoginOutputClass;



public class LoginPage {
	public static JSONObject jObject;
  

	 
	
	 public  List<TestReportSteps> LoginToApplication() throws Exception
		{
		 List<TestReportSteps> listOfReport=new ArrayList<TestReportSteps>();
         int step = 0;
         String objective = "To verify that user is able to login to the application";
         jObject = ConfigFile.RetrieveTestData("LoginInputfile.json");

         try
         {
             //Verify Login API
             listOfReport.add(ReusableComponents.GenerateReportSteps("Invoke the API login","", objective, step));
             RestAssured.baseURI = Setup.url;
             RequestSpecification httpRequest = RestAssured.given();
             Time.SetTime();
             Response postResponse = httpRequest .contentType("application/json") .body(jObject.toString()) .when().post("login");
             Time.GetFinalTime();

             LoginOutputClass whtResponse = ReusableComponents.GetJsonConverter().fromJson(postResponse.getBody().asString(), LoginOutputClass.class);
  	         if(postResponse.getStatusCode()==201 && whtResponse.getData().getAccessToken().toString()!=null)
  	         listOfReport.get(step++).actualResultFail = "";  	        	        	                      	         	     
         }
         catch (Exception e)
         {
             System.out.println("LoginToApplication failed ");
         }

         return listOfReport;
		
		}
	 
	 
	
}
