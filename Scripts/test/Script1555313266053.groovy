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

if (glngtingiaiparameters != '') {
    storeresponse1 = WS.sendRequestAndVerify(findTestObject('GLN Check - EOID', [('glngtingiaiparameters') : glngtingiaiparameters
                , ('url') : url, ('body') : body, ('methodforcall') : methodforcall, ('status') : status, ('statuscode') : statuscode
                , ('messageid') : messageid, ('messageidvalue') : messageidvalue, ('companyname') : companyname, ('companynamevalue') : companynamevalue
                , ('urlvalue') : urlvalue]))
} else {
}

if ((statuscode == '200') && (glngtingiaiparameters != '')) {
    WS.verifyElementPropertyValue(storeresponse1, status, statuscode)

    WS.verifyElementPropertyValue(storeresponse1, messageid, messageidvalue)

    WS.verifyElementPropertyValue(storeresponse1, companyname, companynamevalue)
} else {
}

if ((glngtingiaiparameters == '') && (url = 'approve')) {
    Storeresponse = WS.sendRequestAndVerify(findTestObject('GLN Approve - EOID', [ ('methodforcall') : methodforcall , ('url') : url, ('body') : body
            , ('status') : status, ('statuscode') : statuscode, ('message') : message , ('messagevalue') : messagevalue]))

    WS.verifyElementPropertyValue(Storeresponse, status, statuscode)

    WS.verifyElementPropertyValue(Storeresponse, message, messagevalue)
} else {
}


