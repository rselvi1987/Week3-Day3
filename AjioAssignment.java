package week3.Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioAssignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		WebElement Search = driver.findElement(By.xpath("//input[@name='searchVal']"));
		Search.sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		String Result = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(Result);
		List<WebElement> BagBrandname = driver.findElements(By.className("length"));
		System.out.println("Size is:" + BagBrandname.size());
		
		for (WebElement webElement : BagBrandname) {
			String text = webElement.getText();
			System.out.println("Total number of items :"+ text);
		
		}
		
		System.out.println("List of Brands");
		List<WebElement> List = driver.findElements(By.className("brand"));
		System.out.println("Total number of items :"+ List.size());
		
		
	
	}

}
