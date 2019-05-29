import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/FIt-test suite')

suiteProperties.put('name', 'FIt-test suite')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Lavanya_DF\\Downloads\\GS1 FIT\\GS1 FIT\\Reports\\FIt-test suite\\20190528_183541\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/FIt-test suite', suiteProperties, [new TestCaseBinding('Test Cases/test - Iteration 1', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/machine/check' , 'messageidvalue' : 'E010' , 'statuscode' : '400' , 'message' : '' , 'glnparameter' : '' , 'messagevalue' : '' , 'status' : 'status' , 'giaiparameter' : '9501111222158' , 'methodforcall' : 'POST' , 'gtinparameter' : '' , 'companyname' : '' , 'body' : '\"eoid\": \"1BC_4000146000007\",\n  \"fid\": \"1BC_4000146000007\",\n  \"serialNumber\" : \"1AB34\",\n  \"machineLeased\": \"1\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 2', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/product/check' , 'messageidvalue' : 'E012' , 'statuscode' : '200' , 'message' : '' , 'glnparameter' : '' , 'messagevalue' : '' , 'status' : 'status' , 'giaiparameter' : '' , 'methodforcall' : 'POST' , 'gtinparameter' : '4000132000004' , 'companyname' : '' , 'body' : '\n  \"eoid\": \"1BC74000007000009\",\n  \"brand\": \"Ramesh Updated\",\n  \"grossWeight\": \"20.25\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 3', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/machine/1BC%234000139000007v/approve' , 'messageidvalue' : '' , 'statuscode' : '400' , 'message' : 'message' , 'glnparameter' : '' , 'messagevalue' : 'Importer index contains character not compliant with GS1 specifications.' , 'status' : 'status' , 'giaiparameter' : '' , 'methodforcall' : 'POST' , 'gtinparameter' : '' , 'companyname' : '' , 'body' : '\"eoid\": \"1BC74000007000009\",\n  \"fid\": \"1BC74000068000000\",\n  \"serialNumber\" : \"1AB34\",\n  \"machineLeased\": \"1\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : '' , 'companynamevalue' : '' ,  ])])
