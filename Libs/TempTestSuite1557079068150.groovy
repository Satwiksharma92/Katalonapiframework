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



RunConfiguration.setExecutionSettingFile("C:\\Users\\Lavanya_DF\\Downloads\\GS1 FIT\\GS1 FIT\\Reports\\FIt-test suite\\20190505_232748\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/FIt-test suite', suiteProperties, [new TestCaseBinding('Test Cases/test', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '404' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": ,\n    \"glnProvider\": \"2\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : '' , 'glnparameter' : '4000003000003' , 'companynamevalue' : '' ,  ])])
