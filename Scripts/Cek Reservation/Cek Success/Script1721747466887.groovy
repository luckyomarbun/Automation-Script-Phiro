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

WebUI.setText(findTestObject('Object Repository/Page_phiro/input_v.4.0_nip (10)'), 'Q04570')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_phiro/input_v.4.0_password (10)'), 'pOUvv5WEDv8zPc3BLcXYuQ==')

WebUI.click(findTestObject('Object Repository/Page_phiro/button_Login (9)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Alat Produksi (1)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Manajemen Resource (1)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Reservasi Resource (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_phiro/select_JUDUL KATEGORI BARU 123   TESTING  TESTING KATEGORI  tes tes  MacBookk  TC 01  Laptop   item sempurna  asset  reservation  ATK  handphone  TESTING  Motor  contoh123  d  Test  Cobatest123  test  TEST_WEB  teesttt'), 
    'RCA-000157', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_phiro/select_Laptop Hp 7Laptop 9MacbookMacbookMac_59fb2d (1)'), 
    'RSC-000337', true)

WebUI.click(findTestObject('Object Repository/Page_phiro/input_submit (4)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/span_YUSUF YOGI  - Glossy'))

WebUI.click(findTestObject('Object Repository/Page_phiro/div_Nama  YUSUF YOGI Aset  MSI GL62M - Glos_7cb617'))

WebUI.click(findTestObject('Object Repository/Page_phiro/span_YUSUF YOGI  - Glossy_ui-button-icon-pr_80fb1a'))

WebUI.closeBrowser()

