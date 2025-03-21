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

String apkPath = GlobalVariable.APK_PATH;
Mobile.startApplication(apkPath, true);

Mobile.delay(6)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - Usercode'), '000000', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Discounts/android.widget.EditText - Password'), 'tzH6RvlfSTg=', 
    0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - POS'), 0)

Mobile.delay(6)

Mobile.scrollToText('Table 16', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(6)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 16'), 0)

Mobile.delay(6)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - ORDER'), 0)

Mobile.setText(findTestObject('Object Repository/Discounts/android.widget.EditText - Number of Pax'), '2', 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - UPDATE'), 0)

Mobile.delay(6)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - MENU ITEMS'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - CREPES SUCREES'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - GB-BASIC CREPE'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - EMMENTAL CHEESE'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.TextView - GB-BASIC CREPE in Added Items'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - DISCOUNT'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - NEXT - DISCOUNTS'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - ITEM AMOUNT DC'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - HOLD ORDER'), 0)

Mobile.delay(6)

Mobile.scrollToText("Table 16")

Mobile.delay(6)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.TextView - Table 16'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - PRINT BILL'), 0)

Mobile.tap(findTestObject('Object Repository/Discounts/android.widget.Button - CONFIRM PRINT BILL'), 0)

Mobile.delay(6)

Mobile.closeApplication()

