package paymentDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageBean.PaymentDetailsPageFactory;

public class PaymentDetailsStepDefinition {
	private WebDriver driver;
	private PaymentDetailsPageFactory bean;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rosbalaj\\Desktop\\WORKSPACE_M4\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("^user is in Payment form page$")
	public void user_is_in_Payment_form_page() {
		driver.get("C:\\Users\\rosbalaj\\Desktop\\WORKSPACE_M4\\187382_SETA_Roshni_BDD\\PaymentDetails.html");
		bean = new PaymentDetailsPageFactory(driver);
	}

	@When("^title matches the payment page title$")
	public void title_matches_the_payment_page_title() throws InterruptedException  {
		String expected = "Payment Details";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
		
	}

	@Then("^prints the title in console$")
	public void prints_the_title_in_console() {
		System.out.println(driver.getTitle());
	}

	@When("^user enters invalid name  and clicks makepayment button$")
	public void user_enters_invalid_name_and_clicks_makepayment_button() {
		bean.setCardHoldername("");
		bean.setMakePaymentButton();
	}

	@Then("^displays alert box for invalid name$")
	public void displays_alert_box_for_invalid_name() throws InterruptedException {
		String expected = "Please fill the Card holder name";
		String actual = driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^user enters invalid Debit Card Number and clicks makepayment button$")
	public void user_enters_invalid_Debit_Card_Number_and_clicks_makepayment_button() {
		bean.setCardHoldername("Roshni");
		bean.setNumber("");
		bean.setMakePaymentButton();
	}

	@Then("^displays alert box for invalid number$")
	public void displays_alert_box_for_invalid_number() throws InterruptedException {
		String expected = "Please fill the Debit card Number";
		String actual = driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^user does not enter invalid CVV value and clicks makepayment button$")
	public void user_does_not_enter_invalid_CVV_value_and_clicks_makepayment_button() {
		bean.setCardHoldername("Roshni");
		bean.setNumber("884234324234");
		bean.setCvv("");
		bean.setMakePaymentButton();
	}

	@Then("^displays alert box for invalid cvv$")
	public void displays_alert_box_for_invalid_cvv() throws InterruptedException {
		String expected = "Please fill the CVV";
		String actual = driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^user enters invalid expiration month and clicks makepayment button$")
	public void user_enters_invalid_expiration_month_and_clicks_makepayment_button() {
		bean.setCardHoldername("Roshni");
		bean.setNumber("884234324234");
		bean.setCvv("443");
		bean.setMonth("");
		bean.setMakePaymentButton();
	}

	@Then("^displays alert box for invalid month$")
	public void displays_alert_box_for_invalid_month() throws InterruptedException {
		String expected = "Please fill expiration month";
		String actual = driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^user enters invalid expiration year and clicks makepayment button$")
	public void user_enters_invalid_expiration_year_and_clicks_makepayment_button() {
		bean.setCardHoldername("Roshni");
		bean.setNumber("884234324234");
		bean.setCvv("443");
		bean.setMonth("08");
		bean.setYear("");
		bean.setMakePaymentButton();
	}

	@Then("^displays alert box for invalid year$")
	public void displays_alert_box_for_invalid_year() throws InterruptedException {
		String expected = "Please fill the expiration year";
		String actual = driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();
	}

	@When("^user enters valid  payment details and clicks makepayment button$")
	public void user_enters_valid_payment_details_and_clicks_makepayment_button() {
		bean.setCardHoldername("Roshni");
		bean.setNumber("884234324234");
		bean.setCvv("443");
		bean.setMonth("08");
		bean.setYear("2024");
		bean.setMakePaymentButton();
	}

	@Then("^displays alert box for successful registration$")
	public void displays_alert_box_for_successful_registration() throws InterruptedException {
		String expected = "Conference Room Booking successfully done!!!";
		String actual = driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		Thread.sleep(2000);
		driver.close();
	}

}
