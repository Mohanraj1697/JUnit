package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinElementJUnit extends BaseClass{
	
	public AdactinElementJUnit(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtuser;
	
	@FindBy(id="password")
	private WebElement txtpass;
	
	@FindBy(id="login")
	private WebElement loginbtn;
	
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath="(//select[contains(@name,'room')])[1]")
	private WebElement roomtype;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement roomcount;
	
	@FindBy(xpath="//input[contains(@name,'in')]")
	private WebElement checkin;
	
	@FindBy(xpath="//input[contains(@name,'out')]")
	private WebElement checkout;
	

	@FindBy(xpath="//select[contains(@name,'adult')]")
	private WebElement adultcount;
	
	@FindBy(xpath="//select[contains(@id,'child')]")
	private WebElement childcount;
	
	@FindBy(xpath="(//input[contains(@class,'reg')])[1]")
	private WebElement searchbtn;
	
	@FindBy(xpath="(//input[contains(@id,'0')])[1]")
	private WebElement radiobutton;
	
	@FindBy(xpath="(//input[contains(@class,'button')])[1]")
	private WebElement continuebtn;
	
	@FindBy(xpath="(//input[@type='text'])[11]")
	private WebElement firstname;
	
	@FindBy(xpath="(//input[@type='text'])[12]")
	private WebElement lastname;
	
	@FindBy(xpath="//textarea[@rows='4']")
	private WebElement address;
	
	@FindBy(xpath="(//input[contains(@name,'cc')])[1]")
	private WebElement ccdno;
	
	@FindBy(xpath="(//select[contains(@id,'cc')])[1]")
	private WebElement cardtype;
	
	@FindBy(xpath=" //select[@name='cc_exp_month']")
	private WebElement exmonth;
	
	@FindBy(xpath="(//select[contains(@name,'cc')])[3]")
	private WebElement exyear;
	
	@FindBy(xpath="(//input[contains(@name,'cc')])[2]")
	private WebElement cvvnum;
	
	@FindBy(xpath="//input[contains(@name,'book')]")
	private WebElement bookbtn;
	
	
	public WebElement getCvvnum() {
		return cvvnum;
	}

	public WebElement getBookbtn() {
		return bookbtn;
	}

	public WebElement getCcvnum() {
		return cvvnum;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcdno() {
		return ccdno;
	}

	public WebElement getExmonth() {
		return exmonth;
	}

	public WebElement getExyear() {
		return exyear;
	}

	public WebElement getCardtype() {
		return cardtype;
	}


	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getChildcount() {
		return childcount;
	}

	public WebElement getAdultcount() {
		return adultcount;
	}

	public WebElement getCheckout() {
		return checkout;
	}


	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getRoomcount() {
		return roomcount;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

}
