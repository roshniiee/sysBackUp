package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PaymentDetailsPageFactory {
	WebDriver driver;
	@FindBy(name = "txtFN")
	@CacheLookup
	WebElement CardHoldername;
	@FindBy(name = "debit")
	@CacheLookup
	WebElement number;
	@FindBy(name = "cvv")
	@CacheLookup
	WebElement cvv;
	@FindBy(name = "month")
	@CacheLookup
	WebElement month;
	@FindBy(name = "year")
	@CacheLookup
	WebElement year;
	@FindBy(how = How.ID, using = "btnPayment")
	@CacheLookup
	WebElement makePaymentButton;

	public PaymentDetailsPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getCardHoldername() {
		return CardHoldername;
	}

	public void setCardHoldername(String cardHoldername) {
		CardHoldername.sendKeys(cardHoldername);
	}

	public WebElement getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number.sendKeys(number);
	}

	public WebElement getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv.sendKeys(cvv);
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month.sendKeys(month);
	}

	public WebElement getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year.sendKeys(year);
	}

	public WebElement getMakePaymentButton() {
		return makePaymentButton;
	}

	public void setMakePaymentButton() {
		this.makePaymentButton.click();
	}

}
