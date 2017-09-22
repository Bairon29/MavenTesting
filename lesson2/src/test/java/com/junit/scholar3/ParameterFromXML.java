package com.junit.scholar3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterFromXML {
	@Test
	@Parameters({"InvoiceName"})
	public void Invoice(String InvoiceName) {
		System.out.println("Username "+InvoiceName);
	}
}
