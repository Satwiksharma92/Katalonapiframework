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



RunConfiguration.setExecutionSettingFile("C:\\Users\\Lavanya_DF\\Downloads\\GS1 FIT\\GS1 FIT\\Reports\\FIt-test suite\\20190506_154622\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/FIt-test suite', suiteProperties, [new TestCaseBinding('Test Cases/test - Iteration 1', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E012' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '200' , 'companyname' : 'companyName' , 'body' : '\"economicOperatorCompanyName\":\"Jaitra Updated\",\n\"economicOperatorAlternativeCompanyName\":\"Ramesh Updated\",\n\"economicOperatorAddress\":\"4th Aveneue, New Jersey\",\n\"economicOperatorCountryOfRegistration\":\"AT\",\n\"economicOperatorVatOrTaxNumber\":\"VAT6969961\",\n\"economicOperatorVatOrTaxIdentifier\":\"VAT\",\n\"economicOperatorVatOrTaxStatus\":\"0\",\n\"economicOperatorCompanyType\":2,\n\"glnProvider\":\"1\",\n\"businessPhoneNumber\":\"+491706328615\",\n\"requestDateTime\":\"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '8410023000000' , 'companynamevalue' : 'GONZALEZ BYASS S.A.' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 2', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E001' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"1\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '841@$!' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 3', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E001' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"1\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : 'AB123df' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 4', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E002' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"1\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '1' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 5', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E002' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"1\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '2600000' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 6', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E002' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"1\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '26000000000000' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 7', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E002' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"1\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '17282893938484700000000000000000000000' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 8', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E003' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"1\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '4023500071009' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 9', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E003' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"1\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '8437000013123' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 10', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E007' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"1\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '4000003000003' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 11', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E010' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"0\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '5000100002817' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 12', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E011' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '200' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"1\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '5000100002916' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 13', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E011' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '200' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"2\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '5609119922989' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 14', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E010' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"0\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '8439003801994' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 15', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E011' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '200' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"1\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '8439003801994' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 16', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E011' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '200' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"2\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '8439003801994' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 17', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E012' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '200' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"2\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '8437000023128' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 18', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E014' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"2\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 19', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E007' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"2\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '4000003000003' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 20', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check' , 'messageidvalue' : 'E007' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '400' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra Updated\",\n    \"economicOperatorAlternativeCompanyName\": \"Ramesh Updated\",\n    \"economicOperatorAddress\": \"4th Aveneue, New Jersey\",\n    \"economicOperatorCountryOfRegistration\": \"AT\",\n    \"economicOperatorVatOrTaxNumber\": \"VAT6969961\",\n    \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n    \"economicOperatorVatOrTaxStatus\": \"0\",\n    \"economicOperatorCompanyType\": 2,\n    \"glnProvider\": \"2\",\n    \"businessPhoneNumber\": \"+491706328615\",\n    \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '4000003000003' , 'companynamevalue' : '' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 21', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/facility/check' , 'messageidvalue' : 'E012' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '200' , 'companyname' : 'companyName' , 'body' : '\"eoid\": \"1BCd4000003000003\",\n  \"facilityAddress\": \"hdsjhs\",\n  \"facilityCountryOfRegistration\": \"AT\",\n  \"facilityType\": \"1\",\n  \"facilityLeased\": \"1\",\n  \"facilityTypeOther\": \"Other facility\",\n  \"glnProvider\" :\"1\",\n  \"businessPhoneNumber\": \"264234\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : 'messageId' , 'glnparameter' : '4000003000003' , 'companynamevalue' : 'GS1 Germany Test Company Name 2' ,  ]), new TestCaseBinding('Test Cases/test - Iteration 22', 'Test Cases/test',  [ 'url' : 'gs-dv-fit.gs1.org/api/v1/economicOperator/1BC04000132000004/approve' , 'messageidvalue' : '' , 'status' : 'status' , 'methodforcall' : 'POST' , 'statuscode' : '409' , 'companyname' : '' , 'body' : '\"economicOperatorCompanyName\": \"Jaitra\",\n  \"economicOperatorAlternativeCompanyName\": \"Inc\",\n  \"economicOperatorAddress\": \"4th Aveneue\",\n  \"economicOperatorCountryOfRegistration\": \"AT\",\n  \"economicOperatorVatOrTaxNumber\": \"VAT696986\",\n  \"economicOperatorVatOrTaxIdentifier\": \"VAT\",\n  \"economicOperatorVatOrTaxStatus\": \"0\",\n  \"economicOperatorCompanyType\": 2,\n  \"glnProvider\" :\"0\",\n  \"businessPhoneNumber\": \"+491706328615\",\n  \"requestDateTime\": \"756568765768\"' , 'messageid' : '' , 'glnparameter' : '' , 'companynamevalue' : '' ,  ])])
