package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ConferenceRegistrationPageFactory {
	WebDriver driver;
	@FindBy(name = "txtFN")
	@CacheLookup
	WebElement firstName;
	@FindBy(how = How.NAME, using = "txtLN")
	@CacheLookup
	WebElement lastName;
	@FindBy(xpath = "//*[@id=\"txtEmail\"]")
	@CacheLookup
	WebElement email;
	@FindBy(how = How.ID, using = "txtPhone")
	@CacheLookup
	WebElement contactNo;
	@FindBy(xpath = "/html/body/form/table/tbody/tr[5]/td[2]/select")
	@CacheLookup
	WebElement personCount;
	@FindBy(xpath = "//*[@id=\"txtAddress1\"]")
	@CacheLookup
	WebElement roomNo;

	@FindBy(xpath = "//*[@id=\"txtAddress2\"]")
	@CacheLookup
	WebElement areaName;
	@FindBy(xpath = "/html/body/form/table/tbody/tr[9]/td[2]/select")
	@CacheLookup
	WebElement city;
	@FindBy(name = "state")
	@CacheLookup
	WebElement state;
	@FindBy(xpath = "/html/body/form/table/tbody/tr[12]/td[2]/input")
	@CacheLookup
	WebElement memeberAccess;
	@FindBy(xpath = "/html/body/form/table/tbody/tr[13]/td[2]/input")
	@CacheLookup
	WebElement nonMemberAccess;
	@FindBy(xpath = "/html/body/form/table/tbody/tr[14]/td/a")
	@CacheLookup
	WebElement nextLink;

	public ConferenceRegistrationPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public WebElement getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo.sendKeys(contactNo);
	}

	

	public WebElement getPersonCount() {
		return personCount;
	}

	public void setPersonCount(String personCount) {
		this.personCount.sendKeys(personCount);
	}

	public WebElement getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo.sendKeys(roomNo);
	}

	public WebElement getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName.sendKeys(areaName);
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city.sendKeys(city);
	}

	public WebElement getState() {
		return state;
	}

	public void setState(String state) {
		this.state.sendKeys(state);
	}

	public WebElement getMemeberAccess() {
		return memeberAccess;
	}

	public void setMemeberAccess() {
		this.memeberAccess.click();
	}

	public WebElement getNonMemberAccess() {
		return nonMemberAccess;
	}

	public void setNonMemberAccess() {
		this.nonMemberAccess.click();
	}

	public WebElement getNextLink() {
		return nextLink;
	}

	public void setNextLink() {
		this.nextLink.click();
	}

}
