import java.net.MalformedURLException;



import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class QuickTaskTest extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver =capabilities();
		
		//Xpath
		
		driver.findElementByXPath("//android.widget.EditText[@text='Enter Quick Task Here']").sendKeys("Instalasi Appium 2.0");
		
		//id
		
		
		driver.findElementById("com.splendapps.splendo:id/ivAddQuickTask").click();
		
		//classname
		
		driver.findElementByClassName("android.widget.CheckBox").click();

	}

}
