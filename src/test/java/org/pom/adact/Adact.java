package org.pom.adact;

import org.base.Baseclass;
import org.login.HotelLocator;

public class Adact extends Baseclass {
public static void main(String[] args) throws InterruptedException {
	
	browLaunch("chrome"); 
	urlLaunch("https://adactinhotelapp.com/", 30);
	HotelLocator  l= new HotelLocator();
	sendkeys(l.getUser(), "praveensu1");
sendkeys(l.getPass(), "123456");
clickk(l.getLogin());
thr(4000);
selectByValue(l.getLocation(), "Sydney");
selectByValue(l.getHotels(), "Hotel Creek");
selectByValue(l.getRoomtype(), "Double");
sendkeys(l.getCheckin(), "01/06/2022");
sendkeys(l.getCheckout(), "02/06/2022");
selectByValue(l.getAdultroom(), "1");
clickk(l.getSearch());
clickk(l.getButton());
clickk(l.getContinuebtn());
sendkeys(l.getFirstname(), "praveen");
sendkeys(l.getLastname(), "s u");
sendkeys(l.getAddress(), "no 64A,kalamegam street,kamarajapuram,chennai-600073");
sendkeys(l.getCreditcardno(), "1234567890123456");
selectByValue(l.getCreditcardtype(), "VISA");
selectByVisibleText(l.getCcmonth(), "November");
selectByVisibleText(l.getCcyear(), "2022");
sendkeys(l.getCcvno(), "234");
clickk(l.getBookbtn());
String attribute = getAttribute(l.getOrder(),"value");
System.out.println(attribute);
}
}
