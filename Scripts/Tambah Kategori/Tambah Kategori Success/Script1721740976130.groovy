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

WebUI.setText(findTestObject('Object Repository/Page_phiro/input_v.4.0_nip (1)'), 'Q04570')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_phiro/input_v.4.0_password (1)'), 'pOUvv5WEDv8zPc3BLcXYuQ==')

WebUI.click(findTestObject('Object Repository/Page_phiro/strong_Login'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Pengaturan (1)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Resource Management (1)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Resource Category (1)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/img (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_phiro/select_JUDUL KATEGORI BARU 123   TESTING  T_3b667a (1)'), 
    'RCA-000063', true)

WebUI.setText(findTestObject('Object Repository/Page_phiro/input_JUDUL KATEGORI_category_name (1)'), 'Barang Dapur')

WebUI.setText(findTestObject('Object Repository/Page_phiro/input_KETERANGAN_category_description (1)'), 'Untuk alat memasak sepertinya')

WebUI.click(findTestObject('Object Repository/Page_phiro/input_KETERANGAN_sbm (1)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Kembali (1)'))

WebUI.closeBrowser()

