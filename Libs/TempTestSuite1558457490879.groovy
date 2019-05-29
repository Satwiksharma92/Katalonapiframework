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



RunConfiguration.setExecutionSettingFile("C:\\Users\\Lavanya_DF\\Downloads\\GS1 FIT\\GS1 FIT\\Reports\\FIt-test suite\\20190521_222130\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/FIt-test suite', suiteProperties, [new TestCaseBinding('Test Cases/test - Iteration 1', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E012' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '200' , 'message' : '' , 'companyname' : 'companyName' , 'body' : '\"economicOperatorCompanyName\":\"Jaitra Updated\",\n\"economicOperatorAlternativeCompanyName\":\"Ramesh Updated\",\n\"economicOperatorAddress\":\"4th Aveneue, New Jersey\",\n\"economicOperatorCountryOfRegistration\":\"AT\",\n\"economicOperatorVatOrTaxNumber\":\"VAT6969961\",\n\"economicOperatorVatOrTaxIdentifier\":\"VAT\",\n\"economicOperatorVatOrTaxStatus\":\"0\",\n\"economicOperatorCompanyType\":2,\n\"glnProvider\":\"1\",\n\"businessPhoneNumber\":\"+491706328615\",\n\"requestDateTime\":\"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '4000125000004' , 'companynamevalue' : 'Unilever Deutschland GmbH Home and Personal Care' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 2', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E001' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"1\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '841@$!' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 3', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E001' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"1\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : 'AB123df' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 4', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E002' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"1\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '1' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 5', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E002' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"1\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '2600000' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 6', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E002' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"1\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '26000000000000' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 7', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E002' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"1\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '17282893938484700000000000000000000000' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 8', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E003' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"1\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '4023500071009' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 9', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E003' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"1\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '8437000013123' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 10', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E007' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"1\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '4000003000003' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 11', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E010' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"0\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '5000100002817' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 12', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E011' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '200' , 'message' : '' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"1\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '5000100002916' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 13', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E011' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '200' , 'message' : '' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"2\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '5609119922989' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 14', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E010' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"0\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '8439003801994' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 15', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E011' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '200' , 'message' : '' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"1\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '8439003801994' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 16', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E011' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '200' , 'message' : '' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"2\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '8439003801994' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 17', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E012' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '200' , 'message' : '' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"2\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '8437000023128' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 18', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E014' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"2\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 19', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E007' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"2\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '4000003000003' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 20', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E007' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"2\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '4000003000003' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 21', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : 'E012' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '200' , 'message' : '' , 'companyname' : 'companyName' , 'body' : '\"eoid\": \"1BCj4000007000009\",\n  \"facilityAddress\": \"hdsjhs\",\n  \"facilityCountryOfRegistration\": \"AT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"1\",\n  \"businessPhoneNumber\": \"264234\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '4000007000009' , 'companynamevalue' : 'GS1 Germany GmbH' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 22', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : 'E001' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"eoid\": \"1BCe3904000040028\",\n  \"facilityAddress\": \"4th Aveneue, New Jersey\",\n  \"facilityCountryOfRegistration\": \"AT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"0\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '123bfg8760%12' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 23', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : 'E002' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"eoid\": \"1BCe3904000040028\",\n  \"facilityAddress\": \"4th Aveneue, New Jersey\",\n  \"facilityCountryOfRegistration\": \"AT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"0\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '1234567' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 24', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : 'E002' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"eoid\": \"1BCe3904000040028\",\n  \"facilityAddress\": \"4th Aveneue, New Jersey\",\n  \"facilityCountryOfRegistration\": \"AT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"0\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '123456789012345' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 25', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : 'E003' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"eoid\": \"1BCe3904000040028\",\n  \"facilityAddress\": \"4th Aveneue, New Jersey\",\n  \"facilityCountryOfRegistration\": \"AT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"0\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '5304000053125' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 26', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : 'E014' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"eoid\": \"1BCe3904000040028\",\n  \"facilityAddress\": \"4th Aveneue, New Jersey\",\n  \"facilityCountryOfRegistration\": \"AT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"0\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 27', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : 'E012' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '200' , 'message' : '' , 'companyname' : 'companyName' , 'body' : '  \"eoid\": \"1BCU4000134000002\",\n  \"facilityAddress\": \"4th Aveneue, New Jersey\",\n  \"facilityCountryOfRegistration\": \"AT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"0\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '4000094000005' , 'companynamevalue' : 'Wisa GmbH' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 28', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : 'E008' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"eoid\": \"1BCe3904000040028\",\n  \"facilityAddress\": \"4th Aveneue, New Jersey\",\n  \"facilityCountryOfRegistration\": \"AT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"0\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '4000094000005' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 29', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : 'E012' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '200' , 'message' : '' , 'companyname' : 'companyName' , 'body' : '\"eoid\": \"1BCj4000007000009\",\n  \"facilityAddress\": \"4th Aveneue, New Jersey\",\n  \"facilityCountryOfRegistration\": \"AT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"0\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '4000094000005' , 'companynamevalue' : 'Wisa GmbH' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 30', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : 'E010' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"eoid\": \"1BCj4000007000009\",\n  \"facilityAddress\": \"4th Aveneue, New Jersey\",\n  \"facilityCountryOfRegistration\": \"AT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"0\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '9501111222097' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 31', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : 'E011' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '200' , 'message' : '' , 'companyname' : '' , 'body' : '\"eoid\": \"1BCj4000007000009\",\n  \"facilityAddress\": \"4th Aveneue, New Jersey\",\n  \"facilityCountryOfRegistration\": \"AT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"1\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '9501111222103' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 32', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : 'E011' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '200' , 'message' : '' , 'companyname' : '' , 'body' : '\"eoid\": \"1BCj4000007000009\",\n  \"facilityAddress\": \"4th Aveneue, New Jersey\",\n  \"facilityCountryOfRegistration\": \"AT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"2\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '9501111222028' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 33', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : 'E012' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '200' , 'message' : '' , 'companyname' : 'companyName' , 'body' : '\"eoid\": \"1BCj4000007000009\",\n  \"facilityAddress\": \"4th Aveneue, New Jersey\",\n  \"facilityCountryOfRegistration\": \"AT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"0\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '5301000552380' , 'companynamevalue' : 'ALB-ZEUS shpk' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 34', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : 'E001' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"eoid\": \"1BCj4000007000009\",\n  \"facilityAddress\": \"4th Aveneue, New Jersey\",\n  \"facilityCountryOfRegistration\": \"AT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"0\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '53a1000552380' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 35', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : 'E012' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '200' , 'message' : '' , 'companyname' : 'companyName' , 'body' : '\"eoid\": \"1BCj4000007000009\",\n  \"facilityAddress\": \"4th Aveneue, New Jersey\",\n  \"facilityCountryOfRegistration\": \"AT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"0\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '4000158000002' , 'companynamevalue' : 'an active Company with requested data privacy. GS1 Germany is the responsible GS1 Member Organization.' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 36', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : 'E003' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : '' , 'companyname' : '' , 'body' : '\"eoid\": \"1BCj4000007000009\",\n  \"facilityAddress\": \"4th Aveneue, New Jersey\",\n  \"facilityCountryOfRegistration\": \"AT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"0\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '5304000053125' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 37', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : 'E012' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '200' , 'message' : '' , 'companyname' : 'companyName' , 'body' : '\"eoid\": \"1BCj4000007000009\",\n  \"facilityAddress\": \"4th Aveneue, New Jersey\",\n  \"facilityCountryOfRegistration\": \"AT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"0\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '4000155000005' , 'companynamevalue' : 'Philipp Born GmbH Schokoladenfabrik' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 38', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : 'E012' , 'messagevalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '200' , 'message' : '' , 'companyname' : 'companyName' , 'body' : '\"eoid\": \"1BCj4000007000009\",\n  \"facilityAddress\": \"4th Aveneue, New Jersey\",\n  \"facilityCountryOfRegistration\": \"AT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"0\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '4023500000000' , 'companynamevalue' : 'Philip Morris GmbH' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 39', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : '' , 'messagevalue' : 'Validation Failed' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : 'message' , 'companyname' : '' , 'body' : '\"eoid\": \"\",\n  \"facilityAddress\": \"4th Aveneue, New Jersey\",\n  \"facilityCountryOfRegistration\": \"AT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"0\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : '' , 'glnparameter' : '4023500000000' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 40', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : '' , 'messagevalue' : 'Validation Failed' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'message' : 'message' , 'companyname' : '' , 'body' : '\"eoid\": \"1BCj4000007000009\",\n  \"facilityAddress\": \"\",\n  \"facilityCountryOfRegistration\": \"AT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"0\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : '' , 'glnparameter' : '4023500000000' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 41', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : '' , 'messagevalue' : 'Country code   not found.' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '404' , 'message' : 'message' , 'companyname' : '' , 'body' : '\"eoid\": \"1BCj4000007000009\",\n  \"facilityAddress\": \"4th Aveneue, New Jersey\",\n  \"facilityCountryOfRegistration\": \"\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"0\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : '' , 'glnparameter' : '4023500000000' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 42', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : '' , 'messagevalue' : 'Country code FRT not found.' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '404' , 'message' : 'message' , 'companyname' : '' , 'body' : '\"eoid\": \"1BCj4000007000009\",\n  \"facilityAddress\": \"4th Aveneue, New Jersey\",\n  \"facilityCountryOfRegistration\": \"FRT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"0\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : '' , 'glnparameter' : '4023500000000' , 'companynamevalue' : '' ,  ])])