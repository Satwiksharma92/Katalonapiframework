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



RunConfiguration.setExecutionSettingFile("C:\\Users\\Lavanya_DF\\Downloads\\GS1 FIT\\GS1 FIT\\Reports\\FIt-test suite\\20190521_110650\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/FIt-test suite', suiteProperties, [new TestCaseBinding('Test Cases/test - Iteration 1', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/1BCd4000122000007/approve' , 'messageidvalue' : '' , 'messagevalue' : 'Validation Failed' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : 'message' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"\",\n  \"economicOperatorAlternativeCompanyName\": \"Inc\",\n  \"economicOperatorAddress\": \"\",\n  \"economicOperatorCountryOfRegistration\": \"AT\",\n  \"economicOperatorVatOrTaxNumber\": \"VAT696986\",\n  \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n  \"economicOperatorVatOrTaxStatus\": \"0\",\n  \"economicOperatorCompanyType\": 2,\n  \"glnProvider\" :\"1\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : '' , 'glnparameter' : '' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 2', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/1BCd4000122000007/approve' , 'messageidvalue' : '' , 'messagevalue' : 'Economic Operator id (EOID) 1BCd4000122000007 has been already approved.' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '409' , 'message' : 'message' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra\",\n  \"economicOperatorAlternativeCompanyName\": \"Inc\",\n  \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n  \"economicOperatorCountryOfRegistration\": \"AT\",\n  \"economicOperatorVatOrTaxNumber\": \"VAT696986\",\n  \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n  \"economicOperatorVatOrTaxStatus\": \"0\",\n  \"economicOperatorCompanyType\": 2,\n  \"glnProvider\" :\"1\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : '' , 'glnparameter' : '' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 3', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/1BCd4000122000007/approve' , 'messageidvalue' : '' , 'messagevalue' : 'Economic Operator id (EOID) 1BCd4000122000007 has been already approved.' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '409' , 'message' : 'message' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra to DF\",\n  \"economicOperatorAlternativeCompanyName\": \"Inc\",\n  \"economicOperatorAddress\": \"4th Aveneue\",\n  \"economicOperatorCountryOfRegistration\": \"AT\",\n  \"economicOperatorVatOrTaxNumber\": \"VAT696986\",\n  \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n  \"economicOperatorVatOrTaxStatus\": \"0\",\n  \"economicOperatorCompanyType\": 2,\n  \"glnProvider\" :\"1\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : '' , 'glnparameter' : '' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 4', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/1BCd400012200000/approve' , 'messageidvalue' : '' , 'messagevalue' : 'eoid should be 17 characters.' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : 'message' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra\",\n  \"economicOperatorAlternativeCompanyName\": \"Inc\",\n  \"economicOperatorAddress\": \"4th Aveneue\",\n  \"economicOperatorCountryOfRegistration\": \"AT\",\n  \"economicOperatorVatOrTaxNumber\": \"VAT696986\",\n  \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n  \"economicOperatorVatOrTaxStatus\": \"0\",\n  \"economicOperatorCompanyType\": 2,\n  \"glnProvider\" :\"1\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : '' , 'glnparameter' : '' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 5', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/1BCJ4000122000007/approve' , 'messageidvalue' : '' , 'messagevalue' : 'Incorrect importer index' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '409' , 'message' : 'message' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra\",\n  \"economicOperatorAlternativeCompanyName\": \"Inc\",\n  \"economicOperatorAddress\": \"4th Aveneue\",\n  \"economicOperatorCountryOfRegistration\": \"AT\",\n  \"economicOperatorVatOrTaxNumber\": \"VAT696986\",\n  \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n  \"economicOperatorVatOrTaxStatus\": \"0\",\n  \"economicOperatorCompanyType\": 2,\n  \"glnProvider\" :\"1\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : '' , 'glnparameter' : '' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 6', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/1BCd4000161000006/approve' , 'messageidvalue' : '' , 'messagevalue' : 'Importer Index has been already assigned with other Economic Operator Id (EOID)' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : 'message' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n  \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n  \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n  \"economicOperatorCountryOfRegistration\": \"AT\",\n  \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n  \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n  \"economicOperatorVatOrTaxStatus\": \"0\",\n  \"economicOperatorCompanyType\": 2,\n  \"glnProvider\" :\"1\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : '' , 'glnparameter' : '' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 7', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/1BCM4000177000007/approve' , 'messageidvalue' : '' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '201' , 'message' : '' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n  \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n  \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n  \"economicOperatorCountryOfRegistration\": \"AT\",\n  \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n  \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n  \"economicOperatorVatOrTaxStatus\": \"0\",\n  \"economicOperatorCompanyType\": 2,\n  \"glnProvider\" :\"1\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : '' , 'glnparameter' : '' , 'companynamevalue' : '' ,  ])])
