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

WebUI.navigateToUrl('http://old-demo.securehr.net/')

WebUI.setText(findTestObject('Object Repository/Page_phiro/input_v.4.0_nip (8)'), 'Q04570')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_phiro/input_v.4.0_password (8)'), 'pOUvv5WEDv8zPc3BLcXYuQ==')

WebUI.click(findTestObject('Object Repository/Page_phiro/button_Login (7)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Pengaturan (7)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Resource Management (8)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Resource Category (4)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/img (5)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_phiro/select_JUDUL KATEGORI BARU 123   TESTING  T_3b667a (2)'), 
    'RCA-000063', true)

WebUI.setText(findTestObject('Object Repository/Page_phiro/input_JUDUL KATEGORI_category_name (3)'), 'APAAN TUH')

WebUI.click(findTestObject('Object Repository/Page_phiro/input_KETERANGAN_sbm (3)'))

WebUI.closeBrowser()

