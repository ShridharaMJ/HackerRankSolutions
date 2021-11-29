package com.practice.basics;

import java.text.NumberFormat;
import java.util.Locale;

import org.testng.annotations.Test;

public class CurrencyDemo {
@Test
public void formateCurrency() {
	
	double d=12324.134;
	Locale lin=new Locale("en", "IN");
	
	NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	String format = currencyInstance.format(d);
	System.out.println(format);
	
	
}
}
