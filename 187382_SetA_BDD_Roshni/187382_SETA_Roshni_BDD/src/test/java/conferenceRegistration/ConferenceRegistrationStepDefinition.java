package conferenceRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageBean.ConferenceRegistrationPageFactory;

public class ConferenceRegistrationStepDefinition {
	private WebDriver driver;
	private ConferenceRegistrationPageFactory beanFactory;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rosbalaj\\Desktop\\WORKSPACE_M4\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("^user is in regsitration form page$")
	public void user_is_in_regsitration_form_page() {
		driver.get("C:\\Users\\rosbalaj\\Desktop\\WORKSPACE_M4\\187382_SETA_Roshni_BDD\\ConferenceRegistartion.html");
		beanFactory = new ConferenceRegistrationPageFactory(driver);
	}

	@When("^title matches the page title$")
	public void title_matches_the_page_title() throws InterruptedException {
		String expected = "Conference Registartion";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);

	}

	@Then("^prints title in console$")
	public void prints_title_in_console() {
		System.out.println(driver.getTitle());
	}

	@When("^user enters invalid firstname and clicks next$")
	public void user_enters_invalid_firstname_and_clicks_next() {
		beanFactory.setFirstName("");
		beanFactory.setNextLink();
	}

	@Then("^displays alert box for firstname$")
	public void displays_alert_box_for_firstname() throws InterruptedException {
		String expected = "Please fill the First Name";
		String actual = driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();

	}

	@When("^user enters invalid lastname and clicks next$")
	public void user_enters_invalid_lastname_and_clicks_next() {
		beanFactory.setFirstName("Roshni");
		beanFactory.setLastName("");
		beanFactory.setNextLink();
	}

	@Then("^displays alert box for lastname$")
	public void displays_alert_box_for_lastname() throws InterruptedException {
		String expected = "Please fill the Last Name";
		String actual = driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();

	}

	@When("^user enters invalid email and clicks next$")
	public void user_enters_invalid_email_and_clicks_next() {
		beanFactory.setFirstName("Roshni");
		beanFactory.setLastName("Balaji");
		beanFactory.setEmail("");
		beanFactory.setNextLink();
	}

	@Then("^displays alert box for email$")
	public void displays_alert_box_for_email() throws InterruptedException {
		String expected = "Please fill the Email";
		String actual = driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^user enters invalid emailid and clicks next$")
	public void user_enters_invalid_emailid_and_clicks_next() {
		beanFactory.setFirstName("Roshni");
		beanFactory.setLastName("Balaji");
		beanFactory.setEmail("balajiroshni");
		beanFactory.setNextLink();
	}

	@Then("^displays alert box for invaildEmail$")
	public void displays_alert_box_for_invaildEmail() throws InterruptedException {
		String expected = "Please enter valid Email Id.";
		String actual = driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^user enters invalid contactno and clicks next$")
	public void user_enters_invalid_contactno_and_clicks_next() {
		beanFactory.setFirstName("Roshni");
		beanFactory.setLastName("Balaji");
		beanFactory.setEmail("balajiroshni@gmail.com");
		beanFactory.setContactNo("");
		beanFactory.setNextLink();
	}

	@Then("^displays alert box for contactNo$")
	public void displays_alert_box_for_contactNo() throws InterruptedException {
		String expected = "Please fill the Contact No.";
		String actual = driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^user enters invalid number and clicks next$")
	public void user_enters_invalid_number_and_clicks_next() {
		beanFactory.setFirstName("Roshni");
		beanFactory.setLastName("Balaji");
		beanFactory.setEmail("balajiroshni@gmail.com");
		beanFactory.setContactNo("456342");
		beanFactory.setNextLink();
	}

	@Then("^displays alert box for invaildNo$")
	public void displays_alert_box_for_invaildNo() throws InterruptedException {
		String expected = "Please enter valid Contact no.";
		String actual = driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^user enters invalid number of people and clicks next$")
	public void user_enters_invalid_number_of_people_and_clicks_next() {
		beanFactory.setFirstName("Roshni");
		beanFactory.setLastName("Balaji");
		beanFactory.setEmail("balajiroshni@gmail.com");
		beanFactory.setContactNo("9840160647");
		beanFactory.setPersonCount("");
		beanFactory.setNextLink();
	}

	@Then("^displays alert box for number of people$")
	public void displays_alert_box_for_number_of_people()throws InterruptedException  {
		String expected = "Please fill the Number of people attending";
		String actual = driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^user enters invalid rooms and clicks next$")
	public void user_enters_invalid_rooms_and_clicks_next() {
		beanFactory.setFirstName("Roshni");
		beanFactory.setLastName("Balaji");
		beanFactory.setEmail("balajiroshni@gmail.com");
		beanFactory.setContactNo("9840160647");
		beanFactory.setPersonCount("2");
		beanFactory.setRoomNo("");
		beanFactory.setNextLink();
	}

	@Then("^displays alert box for building and rooms$")
	public void displays_alert_box_for_building_and_rooms() throws InterruptedException {
		String expected = "Please fill the Building & Room No";
		String actual = driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^user enters invalid area and clicks next$")
	public void user_enters_invalid_area_and_clicks_next() {
		beanFactory.setFirstName("Roshni");
		beanFactory.setLastName("Balaji");
		beanFactory.setEmail("balajiroshni@gmail.com");
		beanFactory.setContactNo("9840160647");
		beanFactory.setPersonCount("2");
		beanFactory.setRoomNo("1C/108");
		beanFactory.setAreaName("");
		beanFactory.setNextLink();
	}

	@Then("^displays alert box for area$")
	public void displays_alert_box_for_area() throws InterruptedException {
		String expected = "Please fill the Area name";
		String actual = driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^user enters invalid city and clicks next$")
	public void user_enters_invalid_city_and_clicks_next() {
		beanFactory.setFirstName("Roshni");
		beanFactory.setLastName("Balaji");
		beanFactory.setEmail("balajiroshni@gmail.com");
		beanFactory.setContactNo("9840160647");
		beanFactory.setPersonCount("2");
		beanFactory.setRoomNo("1C/108");
		beanFactory.setAreaName("Valasaravakkam");
		beanFactory.setCity("");
		beanFactory.setNextLink();
	}

	@Then("^displays alert box for city$")
	public void displays_alert_box_for_city() throws InterruptedException {
		String expected = "Please select city";
		String actual = driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^user enters invalid State and clicks next$")
	public void user_enters_invalid_State_and_clicks_next() {
		beanFactory.setFirstName("Roshni");
		beanFactory.setLastName("Balaji");
		beanFactory.setEmail("balajiroshni@gmail.com");
		beanFactory.setContactNo("9840160647");
		beanFactory.setPersonCount("2");
		beanFactory.setRoomNo("1C/108");
		beanFactory.setAreaName("Valasaravakkam");
		beanFactory.setCity("Chennai");
		beanFactory.setState("");
		beanFactory.setNextLink();
	}

	@Then("^displays alert box for State$")
	public void displays_alert_box_for_State() throws InterruptedException {
		String expected = "Please select state";
		String actual = driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^user enters invalid Member Access and clicks next$")
	public void user_enters_invalid_Member_Access_and_clicks_next() {
		beanFactory.setFirstName("Roshni");
		beanFactory.setLastName("Balaji");
		beanFactory.setEmail("balajiroshni@gmail.com");
		beanFactory.setContactNo("9840160647");
		beanFactory.setPersonCount("2");
		beanFactory.setRoomNo("1C/108");
		beanFactory.setAreaName("Valasaravakkam");
		beanFactory.setCity("Chennai");
		beanFactory.setState("TamilNadu");
		beanFactory.setNextLink();

	}

	@Then("^displays alert box for Member Access$")
	public void displays_alert_box_for_Member_Access() throws InterruptedException {
		String expected = "Please Select MemeberShip status";
		String actual = driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^user enters valid details and clicks next$")
	public void user_enters_valid_details_and_clicks_next() {
		beanFactory.setFirstName("Roshni");
		beanFactory.setLastName("Balaji");
		beanFactory.setEmail("balajiroshni@gmail.com");
		beanFactory.setContactNo("9840160647");
		beanFactory.setPersonCount("2");
		beanFactory.setRoomNo("1C/108");
		beanFactory.setAreaName("Valasaravakkam");
		beanFactory.setCity("Chennai");
		beanFactory.setState("TamilNadu");
		beanFactory.setMemeberAccess();
		beanFactory.setNextLink();

	}

	@Then("^displays alert box for valid$")
	public void displays_alert_box_for_valid() throws InterruptedException {
		String expected = "Conference Details are validated.";
		String actual = driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	}

	@Then("^navigates to payment details page$")
	public void navigates_to_payment_details_page() throws InterruptedException {
		driver.get("C:\\Users\\rosbalaj\\Desktop\\WORKSPACE_M4\\187382_SETA_Roshni_BDD\\PaymentDetails.html");
		Thread.sleep(2000);
		driver.close();
	}

}
