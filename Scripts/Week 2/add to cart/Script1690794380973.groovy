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

'Verifikasi berhasil masuk kehalaman utama'
WebUI.waitForElementVisible(findTestObject('Page_KatalogSouceDemo/label_SwagLabsx'), 0)

'capture page katalog'
WebUI.takeScreenshot()

'memastikan button filter muncul'
WebUI.verifyElementVisible(findTestObject('Page_KatalogSouceDemo/button_sortingKatalog'))

'Memastikan muncul tampilan untuk High to Low'
WebUI.selectOptionByValue(findTestObject('Page_KatalogSouceDemo/button_sortingKatalog'), 'hilo', false)

'capture halaman sorting'
WebUI.takeScreenshot()

'verifikasi button add to cart dapat diklik'
WebUI.verifyElementVisible(findTestObject('Page_KatalogSouceDemo/button_addToCart'))

'klik button add to cart'
WebUI.click(findTestObject('Page_KatalogSouceDemo/button_addToCart'))

'capture button add to cart dapat diklik'
WebUI.takeScreenshot()

