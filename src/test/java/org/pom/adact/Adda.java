package org.pom.adact;

import java.util.Date;

import org.base.Baseclass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Adda extends Baseclass {
@BeforeClass
public static void beforeClass() {
	browLaunch("chrome");
	
}
@AfterClass
public static void AfterClass() {
	quit();
}
@Before
public void before() {
	System.out.println("start....."+new Date());
	System.out.println("begin");
}
@After
public void after() {
	System.out.println("end..."+new Date());
System.out.println("end");
}

@Test
public void test1() {
	urlLaunch("https://adactinhotelapp.com/", 20);
	
}
}

