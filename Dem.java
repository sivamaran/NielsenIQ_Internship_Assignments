package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

import java.util.*;
public class Dem {
	public static void main(String args[]) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your mobile number");
		String detail=sc.next();
		
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		
		
		

WebElement fillBar = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
fillBar.sendKeys(detail);
Thread.sleep(1500);

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
String currentHandle= driver.getWindowHandle();
WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
searchBar.sendKeys("iphone11");

searchBar.sendKeys(Keys.RETURN);


/*//*[@id="container"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div/div/img */
 List<WebElement> selectPhone = driver.findElements(By.className("_396cs4"));
String link= "https://www.flipkart.com/apple-iphone-11-white-128-gb/p/itme32df47ea6742?pid=MOBFWQ6B7KKRXDDS&lid=LSTMOBFWQ6B7KKRXDDSULUZ0N&marketplace=FLIPKART&q=iphone11&store=tyy%2F4io&spotlightTagId=BestsellerId_tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=b8449036-5cfc-4f3c-a394-3f1b5cfd8958.MOBFWQ6B7KKRXDDS.SEARCH&ppt=sp&ppn=sp&ssid=mf4ynwc2e80000001678193160981&qH=d6db477051465f9a";

Thread.sleep(2000);
driver.quit();
driver=new ChromeDriver();
driver.get(link);
WebElement colors=driver.findElement(By.className("_1q8vHb"));

//System.out.println(driver.findElement(By.xpath("//*[@id=\"swatch-0-color\"]/a/div")).getAttribute("id"));
String colorPath[]= {
		"//*[@id=\"swatch-0-color\"]/a/div",
		"//*[@id=\"swatch-1-color\"]/a/div",
		"//*[@id=\"swatch-2-color\"]/a/div",
		"//*[@id=\"swatch-3-color\"]/a/div",
		"//*[@id=\"swatch-4-color\"]/a/div"
};

String ram[]= {
		"//*[@id=\"swatch-0-storage\"]/a",
		"//*[@id=\"swatch-1-storage\"]/a"
};

//driver.findElement(By.xpath(ram[0])).click();
//driver.findElement(By.xpath(colorPath[1])).click();



WebElement cart=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
//cart.click();
Thread.sleep(3000);


driver.quit();



		
		
		
		
	}

}

		
		
		
		
	}

}
