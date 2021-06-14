package ProjectConfig;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Reports.Report;
import Reports.ReportModifier;
import Reports.TestReportSteps;
import Utilities.ConfigFile;
import Utilities.Time;



public class Setup {
    public static List<TestReportSteps> finalreport=new ArrayList<TestReportSteps>();
    public static String testObjective;
    public static String scriptName;
    public static String url;
    public static JSONArray inputjson;
    
    @BeforeTest
	public static void BeforeEachTest() throws Exception
	{
		 
		  url= ConfigFile.Init();
	}
	
	
	@AfterTest
	public static void AfterEachTest() throws Exception
	{
    Report.WriteResultToHtml( finalreport, testObjective, scriptName,ReportModifier.scriptCount,Time.finalTime);
    
    finalreport.clear();
	}

	@BeforeSuite(alwaysRun=true)
	public static void GetScriptCount()
	{
		ReportModifier.setUpConfiguration();
	}
}
