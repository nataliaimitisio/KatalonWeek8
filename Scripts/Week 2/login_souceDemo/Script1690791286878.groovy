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

'Membuka Browser'
WebUI.openBrowser('')

'Halaman Login Muncul'
WebUI.navigateToUrl('https://www.saucedemo.com/')

'capture halaman login'
WebUI.takeScreenshot()

'memastikan textbox username muncul'
WebUI.verifyElementVisible(findTestObject('Page_LoginSauceDemo/textbox_username'))

'input username'
WebUI.setText(findTestObject('Page_LoginSauceDemo/textbox_username'), username)

'memastikan textbox password muncul'
WebUI.verifyElementVisible(findTestObject('Page_LoginSauceDemo/textbox_password'))

'input password'
WebUI.setText(findTestObject('Page_LoginSauceDemo/textbox_password'), password)

'capture input password dan username'
WebUI.takeScreenshot()

'memastikan button login bisa diklik'
WebUI.verifyElementVisible(findTestObject('Page_LoginSauceDemo/button_login'))

'memastikan button login muncul'
WebUI.verifyElementClickable(findTestObject('Page_LoginSauceDemo/button_login'))

'klik button login'
WebUI.click(findTestObject('Page_LoginSauceDemo/button_login'))

'capture halaman utama\r\n'
WebUI.takeScreenshot()

