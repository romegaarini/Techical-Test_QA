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

import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper

//Membuka open browser
WebUI.openBrowser('')
WebUI.navigateToUrl('https://zzzscore.com/1to50/en/')

//Menunggu halaman delay 
WebUI.delay(1)

//Mencari sebuah elemen didalam objek repositorynya
List<WebElement>Elements= WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Game'),1)

//klik angka dari 1 hingga 50 melakukan looping

for(int i=1; i<=50; i++) {
	for(WebElement element: Elements) {
		if(element.getText().equals
			(String.valueOf(i))){
			element.click()
			WebUI.delay(0.1)
			break
		}
	}
}

//tutup
WebUI.closeBrowser()		
	