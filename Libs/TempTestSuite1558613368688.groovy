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



RunConfiguration.setExecutionSettingFile("C:\\Users\\Lavanya_DF\\Downloads\\GS1 FIT\\GS1 FIT\\Reports\\FIt-test suite\\20190523_173928\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/FIt-test suite', suiteProperties, [new TestCaseBinding('Test Cases/test - Iteration 1', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/1BC14000127000002/deregister' , 'messageidvalue' : '' , 'messagevalue' : 'Economic Operator id (EOID) 1BC04000127000002  has been successfully deregistered.' , 'status' : 'status' , 'methodforcall' : 'PUT' , 'statuscode' : '200' , 'message' : 'message' , 'companyname' : '' , 'body' : '' , 'messageid' : '' , 'glnparameter' : '' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 2', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/1BC04000001000005/deregister' , 'messageidvalue' : '' , 'messagevalue' : 'Economic Operator id (EOID) 1BC04000001000005 has been already deregistered.' , 'status' : 'status' , 'methodforcall' : 'PUT' , 'statuscode' : '409' , 'message' : 'message' , 'companyname' : '' , 'body' : '' , 'messageid' : '' , 'glnparameter' : '' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 3', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/1BC04000137000009/deregister' , 'messageidvalue' : '' , 'messagevalue' : 'Economic Operator id (EOID) 1BC04000137000009 not found.' , 'status' : 'status' , 'methodforcall' : 'PUT' , 'statuscode' : '404' , 'message' : 'message' , 'companyname' : '' , 'body' : '' , 'messageid' : '' , 'glnparameter' : '' , 'companynamevalue' : '' ,  ])])
