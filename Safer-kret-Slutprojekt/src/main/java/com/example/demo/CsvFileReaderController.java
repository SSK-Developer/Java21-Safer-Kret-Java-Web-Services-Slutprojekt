package com.example.demo;

import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CsvFileReaderController {

	//  --------------------->Läsa CSV-fil<---------------------
	@RequestMapping(value = "/ShowCsv", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String showCsv() throws IOException {
		CsvFileReaderBean myReader = new CsvFileReaderBean();
		myReader.readFile("cities.csv");
		String text = myReader.ShowJson();
		
		return text;
	}
	//  --------------------->Läsa CSV-fil<---------------------
}
