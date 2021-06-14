package projectConfig;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.json.JSONArray;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.xml.sax.SAXException;

import Utilities.ConfigFile;
import Utilities.Time;
import Reports.Report;
import reports.ReportModifier;
import Reports.TestReportSteps;



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
	public static void GetScriptCount() throws ParserConfigurationException, SAXException
	{
		ReportModifier.setUpConfiguration();
	}
}
