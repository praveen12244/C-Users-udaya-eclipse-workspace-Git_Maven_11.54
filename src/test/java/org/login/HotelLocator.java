package org.login;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelLocator extends Baseclass{
public HotelLocator() {
PageFactory.initElements(driver,this);
}
@FindBy(name="username")
private WebElement User;
@FindBy(id="password")
private WebElement pass;
@FindBy(id="login")
private WebElement Login;
@FindBy(name="location")
private WebElement Location;
@FindBy(id="hotels")
private WebElement Hotels;
@FindBy(name="room_type")
private WebElement Roomtype;
@FindBy(name="room_nos")
private WebElement Roomnos;
@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement Checkin;
@FindBy(xpath="(//input[@type='text'])[3]")
private WebElement Checkout;
@FindBy(id="adult_room")
private WebElement Adultroom;
@FindBy(xpath="//input[@type='submit']")
private WebElement Search;
@FindBy(xpath="//input[@type='radio']")
private WebElement Button;
@FindBy(name="continue")
private WebElement Continuebtn;
@FindBy(name="first_name")
private WebElement Firstname;
@FindBy(name="last_name")
private WebElement Lastname;
@FindBy(id="address")
private WebElement Address;
@FindBy(name="cc_num")
private WebElement Creditcardno;
@FindBy(name="cc_type")
private WebElement Creditcardtype;
@FindBy(name="cc_exp_month")
private WebElement Ccmonth;
@FindBy(name="cc_exp_year")
private WebElement Ccyear;
@FindBy(name="cc_cvv")
private WebElement Ccvno;
@FindBy(xpath="//input[@value='Book Now']")
private WebElement Bookbtn;
@FindBy(name="order_no")
private WebElement Order;
public WebElement getUser() {
	return User;
}
public WebElement getPass() {
	return pass;
}
public WebElement getLogin() {
	return Login;
}
public WebElement getLocation() {
	return Location;
}
public WebElement getHotels() {
	return Hotels;
}
public WebElement getRoomtype() {
	return Roomtype;
}
public WebElement getRoomnos() {
	return Roomnos;
}
public WebElement getCheckin() {
	return Checkin;
}
public WebElement getCheckout() {
	return Checkout;
}
public WebElement getAdultroom() {
	return Adultroom;
}
public WebElement getSearch() {
	return Search;
}
public WebElement getButton() {
	return Button;
}
public WebElement getContinuebtn() {
	return Continuebtn;
}
public WebElement getFirstname() {
	return Firstname;
}
public WebElement getLastname() {
	return Lastname;
}
public WebElement getAddress() {
	return Address;
}
public WebElement getCreditcardno() {
	return Creditcardno;
}
public WebElement getCreditcardtype() {
	return Creditcardtype;
}
public WebElement getCcmonth() {
	return Ccmonth;
}
public WebElement getCcyear() {
	return Ccyear;
}
public WebElement getCcvno() {
	return Ccvno;
}
public WebElement getBookbtn() {
	return Bookbtn;
}
public WebElement getOrder() {
	return Order;
}










}
