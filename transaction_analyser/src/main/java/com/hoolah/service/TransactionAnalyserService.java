package com.hoolah.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Date;
import java.util.List;

import com.hoolah.model.Transaction;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;

public class TransactionAnalyserService {
	
	static {
		/*String txtFileName = "D:\\ram\\practice_new\\transaction_analyser\\src\\test\\resources\\input.csv";

		Stream<String> stream = null;
		try {
			stream = Files.lines(Paths.get(txtFileName));
			stream.forEach();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		stream.forEach(System.out::println);*/
		 CsvToBean csv = new CsvToBean();
	       
	      String csvFilename = "data.csv";
	      CSVReader csvReader = null;
		try {
			csvReader = new CSVReader(new FileReader(csvFilename));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	       
	      //Set column mapping strategy
	      List list = csv.parse(setColumMapping(), csvReader);
		
	}
	
	 @SuppressWarnings({"rawtypes", "unchecked"})
	   private static ColumnPositionMappingStrategy setColumMapping()
	   {
	      ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
	      strategy.setType(Transaction.class);
	      String[] columns = new String[] {"id", "firstName", "lastName", "country", "age"}; 
	      strategy.setColumnMapping(columns);
	      return strategy;
	   }

	public int [] getTransactionStatics(Date fromdate, Date toDate, String merchant) {
		
		
		return new int[1];
	}
	
}
