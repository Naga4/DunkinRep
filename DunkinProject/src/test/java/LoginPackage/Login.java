package LoginPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args){
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println("Test for GitHub");
	}
}
