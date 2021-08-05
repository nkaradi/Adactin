package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Checkbox;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import javax.lang.model.element.Element;
import javax.print.DocFlavor.STRING;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;



public class Base_Class1 {
	public static WebDriver driver;

	public static WebDriver getBrowser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Administrator\\eclipse-workspace\\Selinium_Project\\Drivers\\chromedriver.exe");
//				System.setProperty("webdriver.chrome.driver" , System.getProperty("user.dir" + "\\Drivers\\chromedriver.exe"));
				driver = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\Administrator\\eclipse-workspace\\Selinium_Project\\Drivers\\IEDriverServer.exe");
			} else {
				System.out.println("INVALID BROWSER NAME");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
		
	}

	public static void gettitle() {
		System.out.println(driver.getTitle());
	}

	public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void erase(WebElement element, String value) {
		element.clear();
	}

	public static void screenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Administrator\\eclipse-workspace\\Selinium_Project\\ScreenShot\\scrn.png");
		FileUtils.copyFile(src, dest);
	}

	public static void goTo() {
		driver.navigate().to("");
	}

	public static void GoBack() {
		driver.navigate().back();
	}

	public static void GoFor() {
		driver.navigate().forward();
	}

	public static void load() {
		driver.navigate().refresh();
	}

	public static void Checkbox(WebElement element) {
		element.click();
	}

	public static void isEnabled(WebElement element) {
		element.isEnabled();
	}

	public static void isDisplayed(WebElement element) {
		element.isDisplayed();
	}

	public static void isSelect(WebElement element) {
		element.isSelected();
	}

	public static void currenUrl() {
		driver.get(null);
		System.out.println();
	}

	public static void getOption(WebElement element) {
		Select s1 = new Select(element);
		s1.getOptions();
	}

	public static void caution() {
		driver.switchTo().alert().accept();
		
	}
	public static void confirmAlert(String OK, String Cancel) {
		if(OK.equalsIgnoreCase(OK)) {
			driver.switchTo().alert().accept();
		}
		else if (Cancel.equalsIgnoreCase(Cancel)) {
			driver.switchTo().alert().dismiss();
		}
		else {
			System.out.println("INVALID");
		}
		}
	public static void promptAlert(String value, String OK, String Cancel) {
		if (OK.equalsIgnoreCase(OK)) {
			driver.switchTo().alert().sendKeys(value);
			driver.switchTo().alert().accept();
		}
		else if (Cancel.equalsIgnoreCase(Cancel)) {
			driver.switchTo().alert().sendKeys(Cancel);
			driver.switchTo().alert().dismiss();
		}
		else {
			System.out.println("INVALID");
		}
		}
		
	public static void cases(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}

	public static void dropDown(WebElement element, String types, String value) {
		Select st = new Select(element);
		if (types.equalsIgnoreCase("byIndex")) {
			int parseInt = Integer.parseInt(types);
			st.selectByIndex(parseInt);
		} else if (types.equalsIgnoreCase("byValue")) {
			st.selectByValue(value);
		} else if (types.equalsIgnoreCase("byVisibleText")) {
			st.selectByVisibleText(value);
		} else {
			System.out.println(" Invalid Selection");
		}
	}
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
			
		}
		public static void dropDown1(By locator, String types, String value) {
			Select sc = new Select(getElement(locator));
			switch (types) {
			case "byIndex":
				sc.selectByIndex(Integer.parseInt(value));
				break;
			case "byValue":
				sc.selectByValue(value);
				break;
			case "byVisibleText":
				sc.selectByVisibleText(value);
				break;
			default:
				break;
			}
			}
		public static void click(WebElement element) {
			element.click();
		}
		public static void elementClear(WebElement element) {
	    	try {
				element.clear();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public static void windowHandles() {
			try {
				Set<String> element = driver.getWindowHandles();
				for (String st : element) {
					String title = driver.switchTo().window(st).getTitle();
					System.out.println(title);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			public static void drogDrop(WebElement Element, WebElement Element1) {
				try {
					Actions at = new Actions(driver);
					at.dragAndDrop(Element, Element1).build().perform();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			public static void robotClass() throws AWTException {
				try {
					Robot rb = new Robot();
					rb.keyPress(KeyEvent.VK_DOWN);
					rb.keyRelease(KeyEvent.VK_DOWN);
					rb.keyPress(KeyEvent.VK_ENTER);
					rb.keyRelease(KeyEvent.VK_ENTER);
				} catch (AWTException e) {
					e.printStackTrace();
				}
			}

			public static void scrollPageUp(WebElement element) {
				try {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("argument[0].scrollIntoView();", element);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}



			public static void scrollPageDown(WebElement element) {
				try {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("argument[0].scrollIntoView();", element);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			public static void frameMethod(String types, String value, WebElement element) {
				try {
					if (types.equalsIgnoreCase("byIndex")) {
						int index = Integer.parseInt(value);
						driver.switchTo().frame(index);
					} 
					else if (types.equalsIgnoreCase("byElement")) {
						driver.switchTo().frame(element);
					} 
					else if (types.equalsIgnoreCase("byString")) {
						driver.switchTo().frame(value);
					} 
					else {
						System.out.println("Invalid selection");
					}
				}
				catch (NumberFormatException e) {
					e.printStackTrace();
				}
			
			}
		
			public static WebDriver quit1() {
				try {
					driver.quit();
				} catch (Exception e) {
					e.printStackTrace();
				}
				return driver;
			}

	
		
		}


