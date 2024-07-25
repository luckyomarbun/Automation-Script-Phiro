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

WebUI.setText(findTestObject('Object Repository/Page_phiro/input_v.4.0_nip (7)'), 'Q04570')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_phiro/input_v.4.0_password (7)'), 'pOUvv5WEDv8zPc3BLcXYuQ==')

WebUI.click(findTestObject('Object Repository/Page_phiro/button_Login (6)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Pengaturan (6)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Resource Management (7)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Resource Item (4)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/img (4)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_phiro/select_JUDUL KATEGORI BARU 123   TESTING  T_0fcfa3 (1)'), 
    'RCA-000130', true)

WebUI.setText(findTestObject('Object Repository/Page_phiro/input_Nama Aset_resource_name (1)'), 'ABC')

WebUI.setText(findTestObject('Object Repository/Page_phiro/textarea_Keterangan_resource_description (1)'), 'DEF')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_phiro/select_197019711972197319741975197619771978_6a9d5b (2)'), 
    '53', true)

WebUI.setText(findTestObject('Object Repository/Page_phiro/input_No. Serial_item_serial_no (1)'), 'GH')

WebUI.setText(findTestObject('Object Repository/Page_phiro/input_No. Asset_item_no_asset (1)'), 'IJ')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_phiro/select_Balai Diklat MalangBalai Diklat Pada_1209b8 (2)'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Page_phiro/input_No. Asset_nm_peg_ (1)'), 'A')

WebUI.click(findTestObject('Object Repository/Page_phiro/li_P76650  GIAN ARI'))

WebUI.click(findTestObject('Object Repository/Page_phiro/input_submit (2)'))

WebUI.closeBrowser()

