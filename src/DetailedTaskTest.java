import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class DetailedTaskTest extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver =capabilities();
		
		
		//id
		
		
		driver.findElementById("com.splendapps.splendo:id/fabAddTask").click();
		
		//AndroidUiAutomater
		
		//Isi Judul Task
		WebElement isiTask = driver.findElementByAndroidUIAutomator("text(\"Enter Task Here\")");
		isiTask.click();
		isiTask.sendKeys("Buat Task Dengan Detail");
		
		//Isi Tanggal
		
		driver.findElementByAndroidUIAutomator("text(\"Date not set\")").click();
		
		//Pilih tanggal 28
		
		driver.findElementByAndroidUIAutomator("text(\"28\")").click();
		driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
		
		//Pilih Jam
		
		driver.findElementByAndroidUIAutomator("text(\"Time not set (all day)\")").click();
		driver.findElementByXPath("//*[@content-desc='11']").click();
		
		
		//Swipe Menit
		
		TouchAction t = new TouchAction(driver);
		WebElement firstElement = driver.findElementByXPath("//*[@content-desc='0']");
		WebElement secondElement = driver.findElementByXPath("//*[@content-desc='30']");
		
		t.longPress(longPressOptions().withElement(element(firstElement)).withDuration(ofSeconds(2))).moveTo(element(secondElement)).release().perform();
		driver.findElementByAndroidUIAutomator("text(\"OK\")").click();
		
		//Membuat Kategori Baru
		
		driver.findElementByXPath("//*[@content-desc='Add']").click();
		
		WebElement buatKategori = driver.findElementByAndroidUIAutomator("text(\"Enter List Name\")");
		buatKategori.click();
		buatKategori.sendKeys("UASKPL");
		driver.findElementByAndroidUIAutomator("text(\"ADD\")").click();
		
		//Menyimpan Task
		
		driver.findElementByXPath("//*[@content-desc='Save Task']").click();
		
		
		
	}

}
