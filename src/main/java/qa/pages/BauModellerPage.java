package qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class BauModellerPage {
	private static WebDriver driver;
	private By crratebtn = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
	
	private By BauoptionFromFrop = By.xpath("(//li[contains(text(),\"BAU (Ansible)\")])[1]");
	private By ansiblecategorydrop = By.xpath("//div[@id='module']");
	
	private By s3category = By.xpath("//li[contains(text(),\"amazon_aws_s3_bucket\")]");
	private By ec2category = By.xpath("//li[contains(text(),\"amazon_aws_ec2_instance\")]");
	private By playbookdrop = By.xpath("//div[@id='playbook']");
	
	private By s3playbook = By.xpath("//li[contains(text(),\"s3_bucket_creation\")]");
	private By ec2playbook = By.xpath("//li[contains(text(),\"ec2_creation\")]");
	
	private By integrationProfile = By.xpath("//div[@id='mui-component-select-integrations']");
	private By awsintegration = By.xpath("//li[normalize-space()='AWS - Cloud']");
	
	private By functioname = By.xpath("//input[@id='name']");
	
	private By description = By.xpath("//textarea[@id='description']");
	
	private By nextbtn = By.xpath("//button[@type='submit']");
	private By integrationinstancedrop = By.xpath("//div[@id='instance']");
	
	private By selectintegrationprof = By.xpath("//li[contains(text(),\"Botprise_staging\")]");
	private By s3bucketnameinaws = By.xpath("//input[@name='name']");
	
	private By textbtn = By.xpath("(//button[@type=\"button\"])[14]");
	private By checkboxaccept = By.xpath("//input[@name='accept_output']");
	
	private By bauSave = By.xpath("//button[@type='submit']");
	
	private By keyName = By.xpath("//input[@name='key_name']");
	private By namee = By.xpath("//input[@name='name']");
	private By imageid = By.xpath("//input[@name='image_id']");
	
	private By assignpublicip = By.xpath("//input[@name='assign_public_ip']");
	private By instance_type = By.xpath("//input[@name='instance_type']");
	private By region = By.xpath("//input[@name='region']");
	private By capabilityselectdrp = By.xpath("//div[@id=\"capability\"]");
	private By otherprofile = By.xpath("//li[normalize-space()='Other']");
	
	
//	openticket
	
	private By bauapibtn = By.xpath("//body/div[@id='add-menu']/div[3]/ul[1]/li[2]");
	private By servicenowprofile = By.xpath("//li[normalize-space()='ServiceNow - ITSM']");
	private By baucapability = By.xpath("//div[@id='capability']");
	private By openticketcapa = By.xpath("//li[normalize-space()='Open Ticket']");
	private By functName = By.xpath("//input[@id='functionName']");
	
	private By descriptiond = By.xpath("//textarea[@id='description']");
	
	private By inputparams = By.xpath("//input[@id='free-chip-input']");
	private By curltest = By.xpath("//textarea[@id='curl']");
	
	private By selectservicenowinstance = By.xpath("//li[normalize-space()='ServiceNow']");
	private By callerId = By.xpath("//input[@name='caller_id']");
	private By shortdescription = By.xpath("//input[@name='short_description']");
	private By Descriptionn = By.xpath("//input[@name='Description']");
	private By acceptBox = By.xpath("//input[@name='accept_output']");
	
	
	
	
	public static WebElement fluentwaitt(By propertiesBtn2) throws InterruptedException {
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(propertiesBtn2));
		WebElement compnamefromlocator = driver.findElement(propertiesBtn2);

		Thread.sleep(3000);

		return compnamefromlocator;

	}
	
public BauModellerPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	


public void CreateBAUThroughModeller() throws InterruptedException {
	driver.findElement(crratebtn).click();
	Thread.sleep(3000);
	driver.findElement(BauoptionFromFrop).click();
	Thread.sleep(2000);
	driver.findElement(ansiblecategorydrop).click();
	Thread.sleep(3000);
	driver.findElement(s3category).click();
	Thread.sleep(3000);
	driver.findElement(playbookdrop).click();
	Thread.sleep(3000);
	driver.findElement(s3playbook).click();
	Thread.sleep(3000);
	driver.findElement(integrationProfile).click();
	Thread.sleep(3000);
	
	driver.findElement(awsintegration).click();
	Thread.sleep(3000);
	driver.findElement(capabilityselectdrp).click();
	Thread.sleep(3000);
	driver.findElement(otherprofile).click();
	Thread.sleep(3000);
	String randomeBTUname =RandomStringUtils.random(4,"ab_c_d");
	String randomeBTUname1 =RandomStringUtils.random(4,"q_w_e");
	randomeBTUname="test_vkBA_UFromAuto".concat(randomeBTUname);
	randomeBTUname=randomeBTUname.concat(randomeBTUname1);
	driver.findElement(functioname).sendKeys(randomeBTUname);
	Thread.sleep(2000);
	driver.findElement(description).sendKeys(randomeBTUname);
	Thread.sleep(2000);
	
	driver.findElement(nextbtn).click();
	Thread.sleep(3000);
	driver.findElement(integrationinstancedrop).click();
	Thread.sleep(3000);
	driver.findElement(selectintegrationprof).click();
	Thread.sleep(3000);
	String randomeBTUname11 =RandomStringUtils.random(4,"buct");
	String randomeBTUname2 =RandomStringUtils.random(4,"asd");
	randomeBTUname="testbucket".concat(randomeBTUname11);
	randomeBTUname=randomeBTUname.concat(randomeBTUname2);
	driver.findElement(s3bucketnameinaws).sendKeys(randomeBTUname);
	Thread.sleep(2000);
	driver.findElement(textbtn).click();
	Thread.sleep(16000);
	driver.findElement(checkboxaccept).click();
	Thread.sleep(3000);
	driver.findElement(bauSave).click();
	Thread.sleep(5000);
	
}

public void createEc2bau() throws InterruptedException {
	
	driver.findElement(BauoptionFromFrop).click();
	Thread.sleep(2000);
	
	driver.findElement(ansiblecategorydrop).click();
	Thread.sleep(3000);
	driver.findElement(ec2category).click();
	Thread.sleep(3000);
	driver.findElement(playbookdrop).click();
	Thread.sleep(3000);
	driver.findElement(ec2playbook).click();
	Thread.sleep(3000);
	driver.findElement(integrationProfile).click();
	Thread.sleep(4000);
	
	driver.findElement(awsintegration).click();
	Thread.sleep(3000);
	
	driver.findElement(capabilityselectdrp).click();
	Thread.sleep(3000);
	driver.findElement(otherprofile).click();
	Thread.sleep(3000);
	String randomeBTUname =RandomStringUtils.random(4,"abcd");
	String randomeBTUname1 =RandomStringUtils.random(4,"qwe");
	randomeBTUname="test_test_Au".concat(randomeBTUname);
	randomeBTUname=randomeBTUname.concat(randomeBTUname1);
	driver.findElement(functioname).sendKeys(randomeBTUname);
	Thread.sleep(2000);
	driver.findElement(description).sendKeys(randomeBTUname);
	Thread.sleep(2000);
	
	driver.findElement(nextbtn).click();
	Thread.sleep(3000);
	driver.findElement(integrationinstancedrop).click();
	Thread.sleep(3000);
	driver.findElement(selectintegrationprof).click();
	Thread.sleep(3000);
	
	
	String randomeBAUname11 =RandomStringUtils.random(4,"abcd");
	String randomeBAUname2 =RandomStringUtils.random(4,"qwe");
	randomeBTUname="testvkec2instace_".concat(randomeBAUname11);
	randomeBTUname=randomeBTUname.concat(randomeBAUname2);
	
	
	driver.findElement(keyName).sendKeys("demo-server-key");
	Thread.sleep(1000);
	driver.findElement(namee).sendKeys(randomeBTUname);
	Thread.sleep(1000);
	driver.findElement(imageid).sendKeys("ami-0cff7528ff583bf9a");
	Thread.sleep(1000);
	driver.findElement(assignpublicip).sendKeys("yes");
	Thread.sleep(1000);
	driver.findElement(instance_type).sendKeys("t2.micro");
	Thread.sleep(1000);
	driver.findElement(region).sendKeys("us-east-1");
	Thread.sleep(1000);
	
	driver.findElement(textbtn).click();
	Thread.sleep(15000);
	driver.findElement(checkboxaccept).click();
	Thread.sleep(2000);
	driver.findElement(bauSave).click();
	Thread.sleep(5000);
	
}

public void createOpenTicketBAU() throws InterruptedException, AWTException {
	
	fluentwaitt(crratebtn).click();
	Thread.sleep(2000);
	
	fluentwaitt(bauapibtn).click();
	Thread.sleep(3000);
	fluentwaitt(integrationProfile).click();
	Thread.sleep(3000);
	
	fluentwaitt(servicenowprofile).click();
	Thread.sleep(3000);
	fluentwaitt(baucapability).click();
	fluentwaitt(openticketcapa).click();
	String nameofBAu = RandomStringUtils.random(4,"a_b_cd");
	
	String name1 = "OpenBAU".concat(nameofBAu);
	String original = name1+nameofBAu;
	fluentwaitt(functName).sendKeys(original);
	fluentwaitt(descriptiond).sendKeys("Test_"+original);
	Robot r = new Robot();
	
	fluentwaitt(inputparams).sendKeys("Description");
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(500);
	fluentwaitt(inputparams).sendKeys("short_description");
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(500);
	fluentwaitt(inputparams).sendKeys("caller_id");
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(500);
	fluentwaitt(curltest).sendKeys("curl -XPOST -H \"Content-type: application/json\" -d '{\"caller_id\":\"$caller_id\",\"short_description\":\"$short_description\",\"description\":\"$Description\"}' 'https://$servicenow_instance/api/now/table/incident' -u $username:'$password'");
	
	fluentwaitt(bauSave).click();
	fluentwaitt(integrationinstancedrop).click();
	fluentwaitt(selectservicenowinstance).click();
	fluentwaitt(callerId).sendKeys("admin@example.com");
	
	fluentwaitt(shortdescription).sendKeys("Short Description");
	
	fluentwaitt(Descriptionn).sendKeys("Description");
	
	fluentwaitt(textbtn).click();
	Thread.sleep(6000);
	driver.findElement(checkboxaccept).click();
	Thread.sleep(4000);
	driver.findElement(bauSave).click();
	Thread.sleep(5000);
}
	
}
