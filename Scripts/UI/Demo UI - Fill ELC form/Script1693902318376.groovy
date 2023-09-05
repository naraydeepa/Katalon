import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.elcompanies.com/en')

//WebUI.click(findTestObject('Object Repository/Page_The Este Lauder Companies Inc/button_Accept'))
if (true) {
    WebUI.verifyElementPresent(findTestObject('UI/Page_The Este Lauder Companies Inc/button_Accept'), 0)

    WebUI.click(findTestObject('UI/Page_The Este Lauder Companies Inc/button_Accept'))
}

WebUI.verifyElementVisible(findTestObject('UI/Page_The Este Lauder Companies Inc/span_News  Media'))

WebUI.mouseOver(findTestObject('UI/Page_The Este Lauder Companies Inc/span_News  Media'))

WebUI.click(findTestObject('UI/Page_News  Media  The Este Lauder Companies Inc/span_Contact Us'))

not_run: WebUI.takeAreaScreenshot(a)

//WebUI.click(findTestObject('Object Repository/Page_News  Media  The Este Lauder Companies Inc/a_NOT THIS TIME'))
if (true) {
    WebUI.verifyElementPresent(findTestObject('UI/Page_News  Media  The Este Lauder Companies Inc/a_NOT THIS TIME'), 0)

    WebUI.click(findTestObject('UI/Page_News  Media  The Este Lauder Companies Inc/a_NOT THIS TIME'))
}

WebUI.waitForElementPresent(findTestObject('UI/Page_Contact Us  The Este Lauder Companies Inc/a_CONTACT FORM'), 0)

WebUI.click(findTestObject('UI/Page_Contact Us  The Este Lauder Companies Inc/a_CONTACT FORM'))

WebUI.waitForElementPresent(findTestObject('UI/Page_Contact Us  The Este Lauder Companies Inc/h2_Contact Form'), 0)

not_run: WebUI.takeAreaScreenshot(b)

WebUI.click(findTestObject('UI/Page_Contact Us  The Este Lauder Companies Inc/a_Select'))

WebUI.click(findTestObject('UI/Page_Contact Us  The Este Lauder Companies Inc/li_Employee Query'))

WebUI.setText(findTestObject('UI/Page_Contact Us  The Este Lauder Companies Inc/input_First Name_body_0ctl07txtFNameEmea'), 
    'FName')

WebUI.setText(findTestObject('UI/Page_Contact Us  The Este Lauder Companies Inc/input_Last Name_body_0ctl07txtLNameEmea'), 
    'LName')

WebUI.setText(findTestObject('UI/Page_Contact Us  The Este Lauder Companies Inc/input_Location_body_0ctl07txtStateEmea'), 
    'Bangalore')

WebUI.setText(findTestObject('UI/Page_Contact Us  The Este Lauder Companies Inc/input_Email address_body_0ctl07txtEmailEmea'), 
    'Fname.Lname@gmail.com')

WebUI.setText(findTestObject('UI/Page_Contact Us  The Este Lauder Companies Inc/input_Phone number_body_0ctl07txtPhone'), 
    '1234567890')

WebUI.setText(findTestObject('UI/Page_Contact Us  The Este Lauder Companies Inc/input_Message Subject_body_0ctl07txtMsgSubEmea'), 
    'Query')

WebUI.click(findTestObject('UI/Page_Contact Us  The Este Lauder Companies Inc/input_Message Subject_body_0ctl07txtMsgSubEmea'))

WebUI.setText(findTestObject('UI/Page_Contact Us  The Este Lauder Companies Inc/textarea_YOUR MESSAGE_body_0ctl07txtMsgBodyEmea'), 
    'MessageDetails')

not_run: WebUI.takeAreaScreenshot(c)

WebUI.verifyElementVisible(findTestObject('UI/Page_Contact Us  The Este Lauder Companies Inc/input_OK_body_0ctl07Submit'))

WebUI.closeBrowser()

