package org.pom.adact;

import java.io.IOException;

import org.base.Baseclass;

import org.login.HotelLocator;

public class Exadc extends Baseclass {
public static void main(String[] args) throws IOException {
	browLaunch("chrome");
	urlLaunch("https://adactinhotelapp.com/", 15);
	HotelLocator h= new HotelLocator();
	sendkeys(h.getUser(), readExcel("Book1", "sheet1",1, 0));
sendkeys(h.getPass(),readExcel("Book1", "Sheet1",1, 1));
clickk(h.getLogin());
sendkeys(h.getLocation(), readExcel("Book1", "Sheet1",1,2 ));
selectByValue(h.getHotels(), readExcel("Book1", "Sheet1", 1, 3));
selectByValue(h.getRoomtype(), readExcel("Book1", "Sheet1", 1, 4));
sendkeys(h.getCheckin(), readExcel("Book1", "Sheet1", 1, 5));
sendkeys(h.getCheckout(), readExcel("Book1", "Sheet1", 1, 6));
selectByValue(h.getAdultroom(), readExcel("Book1", "Sheet1",1,7));
clickk(h.getSearch());
clickk(h.getButton());
clickk(h.getContinuebtn());
sendkeys(h.getFirstname(),readExcel("Book1", "Sheet1", 1, 8));
sendkeys(h.getLastname(),readExcel("Book1", "Sheet1", 1, 9));
sendkeys(h.getAddress(),readExcel("Book1", "Sheet1", 1, 10));
sendkeys(h.getCreditcardno(),readExcel("Book1", "Sheet1", 1, 11));
selectByValue(h.getCreditcardtype(),readExcel("Book1", "Sheet1", 1, 12));
selectByVisibleText(h.getCcmonth(), readExcel("Book1", "Sheet1", 1, 13));
selectByVisibleText(h.getCcyear(), readExcel("Book1", "Sheet1", 1, 14));
sendkeys(h.getCcvno(), readExcel("Book1", "Sheet1", 1, 15));
clickk(h.getBookbtn());
String attribute = getAttribute(h.getFirstname(), "value");
System.out.println(attribute);

}
}