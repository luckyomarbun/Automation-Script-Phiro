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

WebUI.setText(findTestObject('Object Repository/Page_phiro/input_v.4.0_nip (4)'), 'Q04570')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_phiro/input_v.4.0_password (4)'), 'pOUvv5WEDv8zPc3BLcXYuQ==')

WebUI.click(findTestObject('Object Repository/Page_phiro/button_Login (3)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Pengaturan (3)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Resource Management (4)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Resource Item (1)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/img (3)'))

WebUI.setText(findTestObject('Object Repository/Page_phiro/textarea_Baru'), 'Baru berwarna biru')

WebUI.click(findTestObject('Object Repository/Page_phiro/input_PeriodeHarianPer jam_timeunit (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_phiro/select_197019711972197319741975197619771978_6a9d5b (1)'), 
    '53', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_phiro/select_Balai Diklat MalangBalai Diklat Pada_1209b8 (1)'), 
    '5595', true)

WebUI.setText(findTestObject('Object Repository/Page_phiro/input_No. Asset_nm_peg_2'), 'a')

WebUI.click(findTestObject('Object Repository/Page_phiro/li_Z00100  ZAKKY'))

WebUI.click(findTestObject('Object Repository/Page_phiro/input_submit (1)'))

WebUI.click(findTestObject('Object Repository/Page_phiro/td_HasilData telah di update Kembali'))

WebUI.click(findTestObject('Object Repository/Page_phiro/a_Kembali (4)'))

WebUI.closeBrowser()

