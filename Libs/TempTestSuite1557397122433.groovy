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



RunConfiguration.setExecutionSettingFile("C:\\Users\\Lavanya_DF\\Downloads\\GS1 FIT\\GS1 FIT\\Reports\\FIt-test suite\\20190509_154842\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/FIt-test suite', suiteProperties, [new TestCaseBinding('Test Cases/test', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/1BCd4000003000003/approve' , 'messageidvalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '409' , 'companyname' : '' , 'body' : '\"eoid\": \"1BCd4000003000003\",\n  \"facilityAddress\": \"hdsjhs\",\n  \"facilityCountryOfRegistration\": \"AT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"1\",\n  \"businessPhoneNumber\": \"264234\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : '' , 'glnparameter' : '' , 'companynamevalue' : '' ,  ])])
