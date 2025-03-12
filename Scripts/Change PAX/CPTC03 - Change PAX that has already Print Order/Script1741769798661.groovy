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

Mobile.delay(5)

Mobile.setText(findTestObject('Object Repository/Change PAX/android.widget.EditText - Usercode'), '000000', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Change PAX/android.widget.EditText - Password'), 'tzH6RvlfSTg=',
	0)

Mobile.tap(findTestObject('Object Repository/Change PAX/android.widget.Button - POS'), 0)

Mobile.tap(findTestObject('Object Repository/Change PAX/android.widget.TextView - Table 1'), 0)

Mobile.tap(findTestObject('Object Repository/Change PAX/android.widget.Button - ORDER'), 0)

Mobile.setText(findTestObject('Object Repository/Change PAX/android.widget.EditText - Number of Pax'), '3', 0)

Mobile.tap(findTestObject('Object Repository/Change PAX/android.widget.Button - UPDATE'), 0)

Mobile.tap(findTestObject('Object Repository/Change PAX/android.widget.Button - MENU ITEMS'), 0)

Mobile.tap(findTestObject('Object Repository/Change PAX/android.widget.Button - SOUP'), 0)

Mobile.tap(findTestObject('Object Repository/Change PAX/android.widget.Button - FRENCH ONION SOUP'), 0)

Mobile.tap(findTestObject('Object Repository/Change PAX/android.widget.Button - GB-CREAM OF SQUASH'), 0)

Mobile.tap(findTestObject('Object Repository/Change PAX/android.widget.Button - GB-CREAM OF MUSHROOM'), 0)

Mobile.tap(findTestObject('Object Repository/Change PAX/android.widget.Button - HOLD ORDER'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Change PAX/android.widget.TextView - Table 1'), 0)

Mobile.tap(findTestObject('Object Repository/Change PAX/android.widget.Button - CHANGE PAX'), 0)

Mobile.setText(findTestObject('Object Repository/Change PAX/android.widget.EditText - Number of Pax'), '7', 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

