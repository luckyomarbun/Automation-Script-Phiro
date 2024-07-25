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

WebUI.setText(findTestObject('Object Repository/Page_phiro/input_v.4.0_nip (9)'), 'Q04570')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_phiro/input_v.4.0_password (9)'), 'pOUvv5WEDv8zPc3BLcXYuQ==')

WebUI.click(findTestObject('Object Repository/Page_phiro/button_Login (8)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Alat Produksi'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Manajemen Resource'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Reservasi Resource'))

WebUI.click(findTestObject('Object Repository/Page_phiro/img (6)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_phiro/select_JUDUL KATEGORI BARU 123   TESTING  T_3b667a (3)'), 
    'RCA-000157', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_phiro/select_Laptop Hp 7Laptop 9MacbookMacbookMac_59fb2d'), 
    'RSC-000337', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_phiro/select_Glossy'), 'RSI-000387', true)

WebUI.click(findTestObject('Object Repository/Page_phiro/input_PeriodeHarianPer jam_periode'))

WebUI.click(findTestObject('Object Repository/Page_phiro/td_Periode Harian Per jam'))

WebUI.click(findTestObject('Object Repository/Page_phiro/input_Tanggal_start_date_single'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_25'))

WebUI.setText(findTestObject('Object Repository/Page_phiro/textarea_Alasan_reason'), 'Capek')

WebUI.click(findTestObject('Object Repository/Page_phiro/input_submit (3)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/button_Kembali'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_phiro/select_JUDUL KATEGORI BARU 123   TESTING  T_3b667a_1'), 
    'RCA-000157', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_phiro/select_Laptop Hp 7Laptop 9MacbookMacbookMac_59fb2d_1'), 
    'RSC-000337', true)

WebUI.click(findTestObject('Object Repository/Page_phiro/input_submit (3)'))

WebUI.closeBrowser()

