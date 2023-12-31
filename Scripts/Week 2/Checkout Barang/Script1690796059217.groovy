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

'Verification button shopping cart berhasil diklik'
WebUI.verifyElementVisible(findTestObject('Page_KatalogSouceDemo/button_shoppingCart'))

'button shopping cart berhasil diklik'
WebUI.click(findTestObject('Page_KatalogSouceDemo/button_shoppingCart'))

'capture halaman shopping chart'
WebUI.takeScreenshot()

'Verification halaman checkout muncul'
WebUI.verifyElementVisible(findTestObject('Page_KatalogSouceDemo/button_checkout'))

'button checkout berhasil diklik'
WebUI.click(findTestObject('Page_KatalogSouceDemo/button_checkout'))

'capture halaman checkout'
WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Page_KatalogSouceDemo/text_boxFirstName'))

WebUI.setText(findTestObject('Page_KatalogSouceDemo/text_boxFirstName'), firstname)

WebUI.verifyElementVisible(findTestObject('Page_KatalogSouceDemo/text_boxLastName'))

WebUI.setText(findTestObject('Page_KatalogSouceDemo/text_boxLastName'), lastname)

WebUI.verifyElementVisible(findTestObject('Page_KatalogSouceDemo/text_boxZipCode'))

WebUI.setText(findTestObject('Page_KatalogSouceDemo/text_boxZipCode'), zipcode)

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Page_KatalogSouceDemo/buttton_continue'))

WebUI.click(findTestObject('Page_KatalogSouceDemo/buttton_continue'))

WebUI.verifyElementVisible(findTestObject('Page_KatalogSouceDemo/button_finish'))

WebUI.click(findTestObject('Page_KatalogSouceDemo/button_finish'))

WebUI.takeScreenshot()

