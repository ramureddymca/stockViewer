package com.hoolah.service;

import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

public class TransactionAnalyserServiceTest {

	@Test
	public void testStatistics() {
		Scanner s= new Scanner(System.in);
		//String txtFileName = s.next();
		
		
		Date fromdate = new Date();
		Date todate = new Date();
		String marchant ="";
		
		TransactionAnalyserService transactionAnalyserService = new TransactionAnalyserService();
		
		transactionAnalyserService.getTransactionStatics(fromdate, todate, marchant);
		
		} 
}
