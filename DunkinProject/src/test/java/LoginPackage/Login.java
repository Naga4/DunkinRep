package LoginPackage;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args){
		
		ChromeDriver driver = new ChromeDriver();
		
		Logger log = Logger.getLogger("devpinoyLogger");
		
		driver.get("https://www.facebook.com/");
		
		log.debug("Facebook page is opened.");
		
		String s = driver.getTitle();
		
		System.out.println(s);
		log.debug("Title of the page is returned");
		
	}
}
