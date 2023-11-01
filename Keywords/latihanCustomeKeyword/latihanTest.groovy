package latihanCustomeKeyword

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class latihanTest {
	@Keyword
	def testPrint(String inputUser, int loopTimes) {

		println(inputUser)
		println('akan looping ' + loopTimes + ' kali')
		for(int i=1; i<=loopTimes; i++) {

			println(inputUser + i)
		}

		String kembalikan = inputUser + ' Sudah dikembalikan'
		return kembalikan
	}

	@Keyword
	def splitText(String label, String separator, int index) {
		String[] mobilUserSplit = label.split(separator);
		String result = mobilUserSplit[index];
		return result
	}

	@Keyword
	def textToArray(String mobilUserKwrd) {
		String [] hasilSplitTest = mobilUserKwrd.split(" ")
	}

	@Keyword
	def textToLowerCase(String mobilUserKwrd) {
		String textTidakKapital = mobilUserKwrd.toLowerCase()
	}

	@Keyword
	def textToUpperCase(String mobilUserKwrd) {
		String textKapital = mobilUserKwrd.toUpperCase()
	}

	@Keyword
	def textToCapitalize(String mobilUserKwrd, int index) {
		String[] mobilUserSplit = mobilUserKwrd.split(" ")
		String textKapital = mobilUserSplit[0].capitalize();
	}
}


