package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/calc")
public class CalcController {
	private CalcBean cb = new CalcBean();

	// --------------------->calculator<---------------------
	@RequestMapping(value = "/addition", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String addition(@RequestParam Double number1, @RequestParam Double number2) {
		return
			"{" +
				"\"Result\":" + "\"" + cb.addition(number1, number2) + "\""+ 
			"}";
	}

	@RequestMapping(value = "/subtraction", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String subtraction(@RequestParam Double number1, @RequestParam Double number2) {
		return 
			"{" +
				"\"Result\":" + "\"" + cb.subtraction(number1, number2) + "\""+ 
			"}";
	}

	@RequestMapping(value = "/multiplication", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String multiplication(@RequestParam Double number1, @RequestParam Double number2) {
		return 
			"{" +
				"\"Result\":" + "\"" + cb.multiplication(number1, number2) + "\""+ 
			"}";
	}

	@RequestMapping(value = "/division", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String division(@RequestParam Double number1, @RequestParam Double number2) {
		return 
			"{" +
				"\"Result\":" + "\"" + cb.division(number1, number2) + "\""+ 
			"}";
	}
	// --------------------->calculator<---------------------
}

