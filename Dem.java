package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;
public class Dem {
	public static void main(String args[]) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your mobile number");
		String detail=sc.next();
		Thread.sleep(2000);
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		
		
		

WebElement fillBar = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
fillBar.sendKeys(detail);

//Automate clicking of otp
/*
WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
button.click();*/ 

/*/html/body/div[2]/div/div/button*/
WebElement closeButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
closeButton.click();

//printing the title
String title=driver.getTitle();
System.out.println("\n Title :"+title);

/* //*[@id="container"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input */

WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
searchBar.sendKeys("iphone11");

searchBar.sendKeys(Keys.RETURN);

/*//*[@id="container"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div/div/img */
WebElement selectPhone = driver.findElement(By.xpath(" //*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[3]/div[1]/div[1]"));
selectPhone.click();
selectPhone.sendKeys(Keys.RETURN);

driver.close();
driver.quit();
WebDriver page=new ChromeDriver();
page.get("https://www.flipkart.com/apple-iphone-11-white-128-gb/p/itme32df47ea6742?pid=MOBFWQ6B7KKRXDDS&lid=LSTMOBFWQ6B7KKRXDDSULUZ0N&marketplace=FLIPKART&q=iphone11&store=tyy%2F4io&spotlightTagId=BestsellerId_tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=988876ea-9c17-4e05-9bd9-70b8fe86ec19.MOBFWQ6B7KKRXDDS.SEARCH&ppt=sp&ppn=sp&ssid=btcquixpao0000001677774123491&qH=d6db477051465f9a");



page.manage().window().maximize();

// //*[@id="Color"]
WebElement selectColor = driver.findElement(By.xpath("//*[@id=\"swatch-0-color\"]/a/div"));
selectColor.click();

WebElement selectRAM = driver.findElement(By.xpath("//*[@id=\"swatch-1-storage\"]/a "));
selectRAM.click();

WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
addToCart.click();

//Thread.sleep(5000);
driver.quit();




		
		
		
		
	}

}
