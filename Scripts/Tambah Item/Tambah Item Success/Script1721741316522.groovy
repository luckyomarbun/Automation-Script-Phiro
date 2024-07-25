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

WebUI.setText(findTestObject('Object Repository/Page_phiro/input_v.4.0_nip (2)'), 'Q04570')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_phiro/input_v.4.0_password (2)'), 'pOUvv5WEDv8zPc3BLcXYuQ==')

WebUI.click(findTestObject('Object Repository/Page_phiro/button_Login (1)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Pengaturan (2)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Resource Management (2)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Resource Item'))

WebUI.click(findTestObject('Object Repository/Page_phiro/img (2)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_phiro/select_JUDUL KATEGORI BARU 123   TESTING  T_0fcfa3'), 
    'RCA-000157', true)

WebUI.setText(findTestObject('Object Repository/Page_phiro/input_Nama Aset_resource_name'), 'MSI GL66MN')

WebUI.setText(findTestObject('Object Repository/Page_phiro/textarea_Keterangan_resource_description'), 'Warna Silver')

WebUI.click(findTestObject('Object Repository/Page_phiro/input_PeriodeHarianPer jam_timeunit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_phiro/select_197019711972197319741975197619771978_6a9d5b'), 
    '50', true)

WebUI.setText(findTestObject('Object Repository/Page_phiro/input_No. Serial_item_serial_no'), '1878')

WebUI.setText(findTestObject('Object Repository/Page_phiro/input_No. Asset_item_no_asset'), '09')

WebUI.setText(findTestObject('Object Repository/Page_phiro/input_Tahun_item_title'), 'AA')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_phiro/select_Balai Diklat MalangBalai Diklat Pada_1209b8'), 
    '5', true)

WebUI.setText(findTestObject('Object Repository/Page_phiro/input_No. Asset_nm_peg_'), 'a')

WebUI.click(findTestObject('Object Repository/Page_phiro/li_P81683  TIMMY ADY'))

WebUI.click(findTestObject('Object Repository/Page_phiro/input_submit'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Kembali (2)'))

WebUI.closeBrowser()

