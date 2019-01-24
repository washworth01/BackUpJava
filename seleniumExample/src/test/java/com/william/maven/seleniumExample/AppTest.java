package com.william.maven.seleniumExample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App. 
 */ 
public class AppTest 
{
    WebElement element;
    WebDriver driver;
    
    @Before
    public void setup()
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\chromedriver_win32\\chromedriver.exe");
    	driver = new ChromeDriver();
    }
	
    @Ignore
    @Test
    public void openGoogleAndSearch() throws InterruptedException
    {
    	driver.manage().window().maximize();
    	driver.get("https://www.google.com");
    	WebElement input = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input"));
    	input.click();
    	input.sendKeys("Mortal Kombat 11" + Keys.RETURN);
    	Thread.sleep(3000);
    	WebElement site = driver.findElement(By.xpath("//*[@id='rso']/div[3]/div/div/div/div[1]/a/h3"));
    	site.click();
    	Thread.sleep(3000);
    }
    
    @Ignore
    @Test
    public void checkUserStatus() throws InterruptedException
    {
    	driver.manage().window().maximize();
    	driver.get("http://thedemosite.co.uk/");
    	WebElement add = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
    	add.click();
    	WebElement createUsername = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
    	createUsername.click();
    	createUsername.sendKeys("Sub-Zero");
    	WebElement createPassword = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
    	createPassword.click();
    	createPassword.sendKeys("Bi-han");
    	WebElement saveUser = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
    	saveUser.click();
    	WebElement login = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
    	login.click();
    	WebElement loginUsername = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
    	loginUsername.click();
    	loginUsername.sendKeys("Sub-Zero");
    	WebElement loginPassword = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
    	loginPassword.click();
    	loginPassword.sendKeys("Bi-han");
    	WebElement testLogin = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
    	testLogin.click();
    	WebElement status = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
    	String statusText = status.getAttribute("innerText");
    	Thread.sleep(3000);
    	assertEquals("Login should have been successful.", "**Successful Login**", statusText);
    }
    
    @Test
    public void buyYellowSummerDress()
    {
    	driver.manage().window().maximize();
    	driver.get("http://automationpractice.com/index.php");
    	WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
    	searchBar.click();
    	searchBar.sendKeys("yellow summer dress" + Keys.RETURN);
    	WebElement summerDress = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]"));
    	summerDress.click();
    	WebElement proceedToCheckout = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
    	proceedToCheckout.click();
    	WebElement proceedToCheckout2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
    	proceedToCheckout2.click();
    	WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
    	email.click();
    	email.sendKeys("washworth01@gmail.com");
    	WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
    	password.click();
    	password.sendKeys("french" + Keys.RETURN);
    	WebElement proceedToCheckout3 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button"));
    	proceedToCheckout3.clear();  
    	WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
    	checkbox.click();
    	WebElement proceedToCheckout4 = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button"));
    	proceedToCheckout4.click();
    	WebElement pay = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
    	pay.click();
    	WebElement confirm = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
    	confirm.click();
    }
    
    @After
    public void teardown()
    {
    	driver.quit();
    }
}
