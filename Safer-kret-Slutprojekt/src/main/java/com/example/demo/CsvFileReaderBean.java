package com.example.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.core.io.ClassPathResource;

public class CsvFileReaderBean {

	private ArrayList<CsvRowReaderBean> rows = new ArrayList<CsvRowReaderBean>();
	
	public void readFile(String fileName) throws FileNotFoundException, IOException {
		var csvFile = new ClassPathResource(fileName);
		
		try (BufferedReader br = new BufferedReader(new FileReader (csvFile.getFile()))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				addRow(new CsvRowReaderBean(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7]));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addRow(CsvRowReaderBean row) {
		rows.add(row);
	}

	public String ObjectJson(CsvRowReaderBean rowReader) {
		return 
		"{"+ 
				"\"OrderDate\": \"" + rowReader.getOrderDate() + "\"," +
				"\"Region\": \"" + rowReader.getRegion() + "\"," +
				"\"Rep1\": \"" + rowReader.getRep1() + "\"," +
				"\"Rep2\": \"" + rowReader.getRep2() + "\"," +
				"\"Item\": \"" + rowReader.getItem() + "\"," +
				"\"Units\": \"" + rowReader.getUnits() + "\"," +
				"\"UnitCost\": \"" + rowReader.getUnitCost() + "\"," +
				"\"Total\": \"" + rowReader.getTotal() + "\"" +
		"}";
				
	}
	
	public String ObjectsJson(ArrayList<CsvRowReaderBean> rows) {
		String result = "";
		for(var item: rows) {
			result += ObjectJson(item) + ",";
		}
		
		
		if (result.length() > 8) 
		{
			result = result.substring(0, result.length() - 1);
		}
		
		result = "{ \"Orders\": [" + result + "]}";
		return result;
	}
	
	public String ShowJson() {
		return ObjectsJson(rows);
	}
}
