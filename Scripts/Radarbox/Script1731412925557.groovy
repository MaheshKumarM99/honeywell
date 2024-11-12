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

WebUI.openBrowser('https://www.radarbox.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Radarbox/splashscreen close'))

WebUI.mouseOver(findTestObject('Radarbox/Solutions'))

WebUI.click(findTestObject('Radarbox/Store'))

WebUI.click(findTestObject('Radarbox/Shop Now'))

WebUI.switchToFrame(findTestObject('Radarbox/Iframe'), 0)

WebUI.scrollToElement(findTestObject('Radarbox/Add to Cart'), 0)

WebUI.click(findTestObject('Radarbox/Add to Cart'))

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Radarbox/Cart iframe'), 0)

WebUI.verifyElementPresent(findTestObject('Radarbox/Cart Heading'), 0)

WebUI.click(findTestObject('Radarbox/Cart cross'))

WebUI.switchToDefaultContent()

CustomKeywords.'Country.selectcountry'('USA')

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Radarbox/Amazon Logo'), 0)



