package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
    public static WebDriver driver;
    public static Properties prop;
    
    
    public Base() throws IOException{
    	if (driver == null) {
    	
	    	prop = new Properties();
	    	try {
	    		FileInputStream fip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/config/config.properties");
	            prop.load(fip);
	            
	    	} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	String browsername = prop.getProperty("browser");
	    	if (browsername.equalsIgnoreCase("chrome")){
	    		WebDriverManager.chromedriver().setup();
	    		driver= new ChromeDriver();
	    	}
	    	else {
	    		WebDriverManager.chromedriver().setup();
	    		driver = new FirefoxDriver();
	    	}
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().pageLoadTimeout(Integer. valueOf(prop.getProperty("pageload")), TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(Integer. valueOf(prop.getProperty("implicitwait")), TimeUnit.SECONDS);
    	
    	
    	}
    }
    
    
    
    public static String getTestDataFor(String val) {
    	return prop.getProperty(val);
    }
    public static String fetchTitile() {
		return driver.getTitle();
    }
    
    public static void dropDownSelect(WebElement ele, String val) {
    	Select select = new Select(ele);
    	select.selectByVisibleText(getTestDataFor(val));
    	
    }
    
    public static void type(WebElement ele, String val) {
    	ele.sendKeys(getTestDataFor(val));
    }
    
    public static void launch(String val) {
    	driver.get(getTestDataFor(val));
    }
    
    public static void takeScreenshotAtEndOfTest() throws IOException {

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String currentDir = System.getProperty("user.dir");
        FileUtils.copyFile(scrFile, new File(currentDir + "src/test/resources/screenshots/" + System.currentTimeMillis() + ".png"));
    }

}
