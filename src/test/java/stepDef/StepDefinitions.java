package stepDef;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.After;
//import org.testng.annotations.*;
import org.openqa.selenium.Platform;
import java.util.concurrent.TimeUnit;


import java.net.URL;
import java.time.Duration;
import java.net.MalformedURLException;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.events.EventFiringDecorator;

public class StepDefinitions {
	 
	
	
	
	WebDriver driver;
	
	//WebDriverListener listener = new WebDriverListener();

	//WebDriver decorated = new EventFiringDecorator(listener).decorate(driver);
	
		
	@Given("Que je suis sur le site")
	public void visit_site_hermes() throws MalformedURLException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Abdelrazak\\chromedriver.exe");
		//driver = new ChromeDriver();
		
		DesiredCapabilities capa = new DesiredCapabilities(); 
		//System.setProperty("webdriver.chrome.driver","C:\\Abdelrazak\\chromedriver.exe");
		capa.setBrowserName("chrome");
		capa.setPlatform(Platform.ANY);
		driver = new RemoteWebDriver(new URL("https://selenium.wap-test-platform-iks-086d0feb796ce72f6b820703a879a158-0000.eu-de.containers.appdomain.cloud"), capa);

		
	driver.get("https://mingle-portal.eu1.inforcloudsuite.com/IBM1_DEM/dd01c7cd-9f46-418c-be0a-9e5612067c74?favoriteContext=%7B%22type%22%3A%22page%22%2C%22id%22%3A%229d2e4bf6-eb67-42e9-856c-15415d03c3e6%22%2C%22source%22%3A7%7D&LogicalId=lid://infor.homepages.1");
	}
	
	@And("Que je saisisse mes identifiants et que je me connecte")
		public void saisi_donnee() throws MalformedURLException {
	    
		WebElement first = driver.findElement(By.id("username"));
		first.sendKeys("andrea.gamba@fr.ibm.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("TestAuto22$");
		driver.findElement(By.className("ping-buttons")).click();	
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		}
	
	
	
	@And ("Dans le menu M3 je cherche le {string} pour avoir le code article et appuie sur ENTRER")
	public void chercher_mot(String mot) {
	driver.get("https://mingle-portal.eu1.inforcloudsuite.com/IBM1_DEM/bd13039e-19fd-43d7-82e7-1df47470691e?favoriteContext=bookmark%3FMMS001%26fieldNames%3DW1OBKV%2C%2CW2OBKV%2C%2CWFSLC2%2C%2CWTSLC2%2C%2CWFSLC3%2C%2CWTSLC3%2C%26includeStartPanel%3DTrue%26source%3DMForms%26requirePanel%3DTrue%26sortingOrder%3D2%26view%3DA02-01%26panel%3DB%26tableName%3DMITMAS%26keys%3DMMCONO%2C770%2CMMITNO%2C%2B&LogicalId=lid://infor.m3.m3");
	driver.switchTo().frame("m3h5_bd13039e-19fd-43d7-82e7-1df47470691e");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    System.out.print(mot);  
		//EventFiringWebDriver eventHand = new EventFiringWebDriver(driver);
		//driver.findElement(By.xpath("//button[@name=\'lm-widget-primary-action-button-menu-m3\']")).click();
		//eventHand.findElement(By.name("lm-widget-menu-button-menu-m3")).click();
		//driver.findElement(By.linkText("Masquer/afficher Recherche")).click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//eventHand.findElement(By.id("m3-menu-search")).sendKeys(mot);
		//eventHand.findElement(By.id("m3-menu-search")).sendKeys(Keys.ENTER);
		//WebElement element = driver.findElement(By.cssSelector(".searchfield.ng-pristine.ng-valid.ng-touched"));
		//element.sendKeys(mot);
		//Now submit the form.WebDriver will find the form for us from the element
		//element.submit();
		//action.sendKeys(Keys.ENTER).perform();
		//eventHand.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
			
	@And("TpA = {string} et Code article = {string}")
		public void remplir_champs(String valeur1 , String valeur2) throws MalformedURLException {
	    //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'WFSLC3')]")));
			
		eventHandler.findElement(By.xpath("//input[@id='W1OBKV']")).sendKeys(valeur1);
			
			
			WebElement num = driver.findElement(By.xpath("//input[@id='W2OBKV']"));
			num.sendKeys(valeur2);
			num.sendKeys(Keys.chord(Keys.CONTROL,"a"));
			num.sendKeys(Keys.chord(Keys.CONTROL,"c"));
			num.sendKeys(Keys.chord(Keys.CONTROL,"r"));
		    System.out.print(valeur1);  
		    System.out.print(valeur2);  

			
		}
	
	
	
	
	
	@And("Que je rentre, dans le nouvel onglet, et que je tappe PMS170 et je clique sur le bouton OK")
	public void ongler_PMS() throws MalformedURLException {
		EventFiringWebDriver event = new EventFiringWebDriver(driver);

		 event.findElement(By.id("cmdText")).sendKeys("PMS170");
		 event.findElement(By.id("runTaskButton")).click();
			
		
		event.findElement(By.id("W1RESP")).sendKeys(Keys.chord(Keys.LEFT_SHIFT,Keys.F5));
		 
	}
	

	
	
	  @And("Que je rentre dans le champ produit : je colle la valeur2 et appuie sur le bouton Suivant")
	  public void champ_produit(){
	EventFiringWebDriver event2 = new EventFiringWebDriver(driver);
	event2.findElement(By.id("W1PRNO")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
	  
	  
	  driver.findElement(By.cssSelector(".inforFormButton.default")).click();
	  
	  }
	  
		@And("Que je rempli les trois champs: numero programme {string} , date de fin et quantite planifie {string} et je verifie les informations")
	  	public void remplir_champs_valeurs(String valeur4, String valeur3) {
			//EventFiringWebDriver event3 = new EventFiringWebDriver(driver);
		  
		  driver.findElement(By.xpath("//div[@id='WEFIDTContainer']/button/span")).click();
		  driver.findElement(By.id("WEORQA")).sendKeys(valeur3);
		 
		  driver.findElement(By.cssSelector(".inforLookupField.integerOnly.inforTextbox.numericOnly")).sendKeys(valeur4);

		  driver.findElement(By.cssSelector(".inforFormButton.default")).click();
		  //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  //driver.findElement(By.cssSelector(".inforTextbox.integerOnly.filterFld.numericOnly.alignRight")).sendKeys(Keys.chord(Keys.F12));
		  //driver.findElement(By.cssSelector(".inforTextbox.integerOnly.filterFld.numericOnly.alignRight")).sendKeys(Keys.chord(Keys.F12));

	  }
		
		
		@And("Je verifie que mon numero de programme est {string}")
		public void verification_num(String valeur4) {
		
				WebElement val = driver.findElement(By.cssSelector(".slick-cell.l0.r0.alignRight"));
			   
			  String val2 = val.getAccessibleName();
			 // Assert.assertTrue(val2.contains(valeur4));
			    
			
			    if (val2.equals(valeur4)) {
				    System.out.print(val.getAccessibleName());  
				    System.out.print("C'est La bonne valeur");  	
			    }else {
			    	
				    System.out.print("ERROR!!");
				    driver.findElement(By.id("ERROR!"));

			    }
			    

			
		}
		
	  
	//  @And("Dans la liste droulante Ordre de tri, je sélectionne {string}")
	  //	public void verification(String valeur5) {
		  
		  
	  //}
	  
	
	
	
	
	//@After()
	//public void closeBrowser() {
		//driver.quit();
	//}

}
