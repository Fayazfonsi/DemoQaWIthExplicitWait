package DemoQa.DemoQa;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeSuite;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;

public class Elements {
	
	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	WebDriverWait wait1;
	WebDriverWait wait2;
	WebDriverWait wait3;
	WebDriverWait wait4;
	WebDriverWait wait5;
	WebDriverWait wait6;
	WebDriverWait wait7;
	WebDriverWait wait8;
	WebDriverWait wait9;
	WebDriverWait wait10;
	WebDriverWait wait11;
	WebDriverWait wait12;
	WebDriverWait wait13;
	WebDriverWait wait14;
	
	
  @Test(priority=0)
  public void elements() throws InterruptedException {
	  wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div)[21]")));
	  

	  driver.findElement(By.xpath("(//div)[21]")).click();
	  
	  wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div)[21]")));
	  driver.findElement(By.xpath("(//div)[21]")).click();
	  
	  
	  
  }
  
  
  @Test(priority=1)
  public void textbox() throws InterruptedException {
	  driver.findElement(By.xpath("(//span)[4]")).click();
	  wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#userName")));
	  
	  driver.findElement(By.cssSelector("#userName")).sendKeys("kanniya");
	  driver.findElement(By.cssSelector("#userEmail")).sendKeys("kanniya@gmail.com");
	  driver.findElement(By.cssSelector("#currentAddress")).sendKeys("karamadai");
	  driver.findElement(By.cssSelector("#permanentAddress")).sendKeys("karamadai");
	  
	  
	  
	  
	  js = (JavascriptExecutor)driver;
	  js.executeScript("javascript:window.scrollBy(250,350)");
	  
	  wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#submit")));
	  driver.findElement(By.cssSelector("#submit")).click();
	  
	  
	  wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span)[5]")));
  }
  
  @Test(priority=2)
  public void checkbox() throws InterruptedException {
	  
	  driver.findElement(By.xpath("(//span)[5]")).click();
	  driver.findElement(By.xpath("(//label)[1]")).click();
	  driver.findElement(By.xpath("(//button)[2]")).click();
	  
	  js = (JavascriptExecutor)driver;
	  js.executeScript("javascript:window.scrollBy(250,350)");
	  
	  wait5 = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span)[6]")));
	  
	  
	  
	  
	  
  }
  
  @Test(priority=3)
  public void radiobutton() throws InterruptedException {
	  
	  
	  driver.findElement(By.xpath("(//span)[6]")).click();
	  
	  wait6 = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label)[1]")));
	  
	  driver.findElement(By.xpath("(//label)[1]")).click();
	  js = (JavascriptExecutor)driver;
	  js.executeScript("javascript:window.scrollBy(250,350)");
	  
	  
	  
	  
	  
  }
  
  @Test(priority=4)
  public void webTables() throws InterruptedException {
	  driver.findElement(By.xpath("(//span)[7]")).click();
	  Thread.sleep(9000);
	  
	  
	  //Regitration form
	  String [] a= new String [] {"karupa swami","paul swami", "kandha swami"};
	  String [] b= new String [] {"k","p","k"};
	  String [] c= new String [] {"karupu@gmail.com","paul@gmail.com","kandha@gmail.com"};
	  String [] d= new String [] {"30","40","50"};
	  String [] e= new String [] {"10000","22000","1000000"};
	  String [] f= new String [] {"Dev","QA","BA"};
	  
	  
	  
	  
	  
	  
	  int j=0;
	  for (int i = 0; i <=2; i++) {
		  driver.findElement(By.cssSelector("#addNewRecordButton")).click();
		  Thread.sleep(4000);
		  driver.findElement(By.cssSelector("#firstName")).sendKeys(a[j]);
		  driver.findElement(By.cssSelector("#lastName")).sendKeys(b[j]);
		  driver.findElement(By.cssSelector("#userEmail")).sendKeys(c[j]);
		  driver.findElement(By.cssSelector("#age")).sendKeys(d[j]);
		  driver.findElement(By.cssSelector("#salary")).sendKeys(e[j]);
		  driver.findElement(By.cssSelector("#department")).sendKeys(f[j]);
		  driver.findElement(By.cssSelector("#submit")).click();
		  
		  j++;
		 // Thread.sleep(4000);
		  
		  
		
	}
	  js = (JavascriptExecutor)driver;
	  js.executeScript("javascript:window.scrollBy(250,350)");
  }
  
  @Test(priority=5)
  public void buttons() throws InterruptedException {
	  
	  driver.findElement(By.xpath("(//span)[8]")).click();
	  wait7 = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait7.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#doubleClickBtn")));
	  
	  Actions a= new Actions(driver);
	  a.moveToElement(driver.findElement(By.cssSelector("#doubleClickBtn"))).doubleClick().build().perform();
	  wait8 = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait8.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#rightClickBtn")));

	  
	  a.moveToElement(driver.findElement(By.cssSelector("#rightClickBtn"))).contextClick().build().perform();
	  wait9 = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button)[4]")));

	  
	  a.moveToElement(driver.findElement(By.xpath("(//button)[4]"))).click().build().perform();
	  js = (JavascriptExecutor)driver;
	  js.executeScript("javascript:window.scrollBy(250,350)");
	  wait10 = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span)[9]")));
	  
	  
  }
  
  
  @Test(priority=6)
  public void links() throws InterruptedException {
	  driver.findElement(By.xpath("(//span)[9]")).click();
	  wait11 = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#simpleLink")));

	  
	  driver.findElement(By.cssSelector("#simpleLink")).click();
	  //Thread.sleep(5000);
	  ArrayList<String>a = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(a.get(1));
	  driver.close();
	  //Thread.sleep(10000);
	  driver.switchTo().window(a.get(0));
	  //Thread.sleep(10000);
	  driver.findElement(By.cssSelector("#dynamicLink")).click();
	  //Thread.sleep(5000);
	  ArrayList<String>b = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(b.get(1));
	  //Thread.sleep(5000);
	  driver.close();
	  driver.switchTo().window(b.get(0));
	  //Thread.sleep(5000);
	  
	  
	  
	  driver.findElement(By.cssSelector("#created")).click();
	  
	  js = (JavascriptExecutor)driver;
	  js.executeScript("javascript:window.scrollBy(250,350)");
	  
	  wait12 = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait12.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#linkResponse")));
	  
	  //driver.findElement(By.cssSelector("#linkResponse")).getText();
	  //System.out.println(driver.findElement(By.cssSelector("#linkResponse")).getText());
	  
	  
	  
	  Assert.assertEquals((driver.findElement(By.cssSelector("#linkResponse")).getText()), "Link has responded with staus 201 and status text Created");
	  Thread.sleep(8000);
	  driver.findElement(By.cssSelector("#no-content")).click();
	  Thread.sleep(8000);
	  
	  
	  
	  Assert.assertEquals((driver.findElement(By.cssSelector("#linkResponse")).getText()), "Link has responded with staus 204 and status text No Content");
	  
	  driver.findElement(By.cssSelector("#moved")).click();
	  Thread.sleep(8000);
	  
	  Assert.assertEquals((driver.findElement(By.cssSelector("#linkResponse")).getText()), "Link has responded with staus 301 and status text Moved Permanently");
	  
	  driver.findElement(By.cssSelector("#bad-request")).click();
	  Thread.sleep(8000);
	  
	  Assert.assertEquals((driver.findElement(By.cssSelector("#linkResponse")).getText()), "Link has responded with staus 400 and status text Bad Request");
	  
	  driver.findElement(By.cssSelector("#unauthorized")).click();
	  Thread.sleep(8000);
	  
	  Assert.assertEquals((driver.findElement(By.cssSelector("#linkResponse")).getText()), "Link has responded with staus 401 and status text Unauthorized");
	  
	  driver.findElement(By.cssSelector("#forbidden")).click();
	  Thread.sleep(8000);
	  
	  Assert.assertEquals((driver.findElement(By.cssSelector("#linkResponse")).getText()), "Link has responded with staus 403 and status text Forbidden");
	  
	  driver.findElement(By.cssSelector("#invalid-url")).click();
	  Thread.sleep(8000);
	  
	  Assert.assertEquals((driver.findElement(By.cssSelector("#linkResponse")).getText()), "Link has responded with staus 404 and status text Not Found");
	  
	  Thread.sleep(8000);
	    
	  	  
  }
  
  
  @Test(priority=7)
  public void brokenLinksImages() throws InterruptedException {
	
	driver.findElement(By.xpath("(//li)[7]")).click();
	
	js = (JavascriptExecutor)driver;
	js.executeScript("javascript:window.scrollBy(250,350)");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Click Here for Valid Link")).click();
	Thread.sleep(4000);
	driver.navigate().back();
	Thread.sleep(6000);
	driver.findElement(By.linkText("Click Here for Broken Link")).click();
	Thread.sleep(4000);
	driver.navigate().back();
	Thread.sleep(4000);
	  
  }
  
  
  @Test(priority=8)
  public void uploadAndDownload() throws InterruptedException {
	  
	  js = (JavascriptExecutor) driver;
	  js.executeScript("Javascript:window.scrollBy(350,250)");
	  wait13 = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait13.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li)[8]")));
	driver.findElement(By.xpath("(//li)[8]")).click();
	//Thread.sleep(3000);
	
	String testdata="E:\\eclips work files\\DemoQa\\Test Data\\Test Data.jpg";
	
	driver.findElement(By.cssSelector("#downloadButton")).click();
	 wait14 = new WebDriverWait(driver, Duration.ofSeconds(20));
	 wait14.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#uploadFile")));
	
	driver.findElement(By.cssSelector("#uploadFile")).sendKeys(testdata);
	//Thread.sleep(4000);
	
  }
  
  @Test(priority=9)
  public void dynamicProperties() throws InterruptedException {
	  
	  js = (JavascriptExecutor) driver;
	  js.executeScript("Javascript:window.scrollBy(350,250)");
	  
	  js = (JavascriptExecutor) driver;
	  js.executeScript("Javascript:window.scrollBy(350,250)");
	
	driver.findElement(By.xpath("(//li)[9]")).click();
	
	driver.findElement(By.cssSelector("#colorChange")).click();
	
  }
  
  
  
  
  
  @BeforeSuite
  public void beforeSuite() {
	  
	  System.setProperty("webdriver.chrome.driver",
				"E:\\eclips\\chromedriver-win64\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/elements");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  
  }
  
  
  
  
  

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
