import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WS.sendRequestAndVerify(findTestObject('GLN Check - EOID', [('gln') : '8410023000000', ('urlforcheckeoid') : 'gs-dv-fit.gs1.org/api/v1/economicOperator/check'
            , ('responsecode') : 200, ('status') : 'status', ('statuscode') : '200', ('messageid') : 'messageId', ('messagidvalue') : 'E012'
            , ('companyname') : 'companyName', ('companynamevalue') : 'GONZALEZ BYASS S.A.', ('methodforcall') : 'POST', ('body') : ' "economicOperatorCompanyName": "Jaitra Updated",\n  "economicOperatorAlternativeCompanyName": "Ramesh Updated",\n  "economicOperatorAddress": "4th Aveneue, New Jersey",\n  "economicOperatorCountryOfRegistration": "AT",\n  "economicOperatorVatOrTaxNumber": "VAT6969961",\n  "economicOperatorVatOrTaxIdentifier": "VAT",\n  "economicOperatorVatOrTaxStatus": "0",\n  "economicOperatorCompanyType": 2,\n  "glnProvider" :"1",\n  "businessPhoneNumber": "+491706328615",\n  "requestDateTime": "756568765768"']))

