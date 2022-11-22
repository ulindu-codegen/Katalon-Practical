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

'Open Orange HRM page'
WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

'Maximize browse window '
WebUI.maximizeWindow()

'Wait the login text present '
WebUI.waitForElementPresent(findTestObject('Object Repository/LoginPage_OrangeHRM/h5_Login'), 3)

'Set the user name \r\n'
WebUI.setText(findTestObject('Object Repository/LoginPage_OrangeHRM/input_Username_username'), 'Admin')

'Set the password \r\n'
WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

'Verify the text in Login button'
WebUI.verifyElementText(findTestObject('Object Repository/LoginPage_OrangeHRM/button_Login'), 'Login')

'Verify the visible login button'
WebUI.verifyElementVisible(findTestObject('Object Repository/LoginPage_OrangeHRM/button_Login'))

'Verify the button clickable or not\r\n'
WebUI.verifyElementClickable(findTestObject('Object Repository/LoginPage_OrangeHRM/button_Login'))

'Put delay'
WebUI.delay(3)

'Click the login button'
WebUI.click(findTestObject('Object Repository/LoginPage_OrangeHRM/button_Login'))

'Put delay'
WebUI.delay(3)

'Verify user details'
WebUI.verifyElementText(findTestObject('Object Repository/AdminPage/p_Paul Collings'), 'Paul Collings')

'Put delay'
WebUI.delay(5)

'Close the open browser '
WebUI.closeBrowser()

