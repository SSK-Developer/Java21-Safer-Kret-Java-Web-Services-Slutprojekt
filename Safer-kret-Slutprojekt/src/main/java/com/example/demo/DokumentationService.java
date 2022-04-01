package com.example.demo;

public class DokumentationService {

	//---------------------------------Kalkylator dokumentation------------------------------------
	public String additionDescription() {
		return "[GET] Endpoint /calc/addition?number1=x&number2=y \r\n"
					+ "! Räknar plus mellan två tal \r\n"
					+ "> Query parameter number1 [String] \r\n"
					+ "> Query parameter number2 [String] \r\n"
					+ "< Returns Json => { \"result\": answer } \r\n"
					+ "/* /calc/addition?number1=2&number2=2 => 4 */";
	}
		
	public String subtractionDescription() {
		return "[GET] Endpoint /calc/subtraction?number1=x&number2=y \r\n"
					+ "! Räknar minus mellan två tal \r\n"
					+ "> Query parameter number1 [String] \r\n"
					+ "> Query parameter number2 [String] \r\n"
					+ "< Returns Json => { \"result\": answer } \r\n"
					+ "/* /calc/subtraction?number1=2&number2=2 => 0 */";
	}	
	
	public String multiplicationDescription() {
		return "[GET] Endpoint /calc/multiplication?number1=x&number2=y \r\n"
					+ "! Räknar multiplikation mellan två tal \r\n"
					+ "> Query parameter number1 [String] \r\n"
					+ "> Query parameter number2 [String] \r\n"
					+ "< Returns Json => { \"result\": answer } \r\n"
					+ "/* /calc/multiplication?number1=2&number2=2 => 4 */";
	}
		
	public String divisionDescription() {
		return "[GET] Endpoint /calc/division?number1=x&number2=y \r\n"
					+ "! Räknar division mellan två tal \r\n"
					+ "> Query parameter number1 [String] \r\n"
					+ "> Query parameter number2 [String] \r\n"
					+ "< Returns Json => { \"result\": answer } \r\n"
					+ "/* /calc/division?number1=2&number2=2 => 1 */";
	}
	
	public String CalcDescription() {
		return "Kalkylator Dokumentation: \r\n\n"
					+ additionDescription() + "\r\n\n" 
					+ subtractionDescription() + "\r\n\n" 
					+ multiplicationDescription() + "\r\n\n"
					+ divisionDescription();
	}
	//---------------------------------Kalkylator dokumentation------------------------------------
	
	//---------------------------------Sten sax påse dokumentation------------------------------------
	public String SspPostDescription() {
		return "[POST] Endpoint /SSP \r\n"
				+ "! Gör ett drag \r\n"
				+ "! jämför användarens val med datorns och utser vinnare \r\n"
				+ "> header: Content-Type = application/x-www-form-urlencoded \r\n"
				+ "> body parameter: choice [String] - valid values are Rock, Scissors, Paper \r\n"
				+ "< Returns Json => { \"Player_Move\": value, \"Computer_Move\": value, \"Winner\": value } \r\n"
				+ "/* choice [rock]  => returns { \"Player_Move\": rock, \"Computer_Move\": paper, \"Winner\": Player } */";
	}
	
	public String SspGetDescription() {
		return "[GET] Endpoint /SSP \r\n"
				+ "! Visar resultat av pågående match/matcher \r\n"
				+ "> Inga parametrar \r\n"
				+ "< Returns Json => \r\n"
				+ "{"+ 
				"\"Total_Games\": \"Value" + "\",\r\n" +
				"\"Player\":\r\n" + 
					"[{\r\n"+
						"\"Total_Wins\":" + "\"value"+ "\",\r\n"+ 
						"\"Total_Losses\":" + "\"value"+ ",\"\r\n"+
						"\"Total_Ties\":" + "\"value" + "\"\r\n"+
					"}],\r\n"+
				"\"Computer\":\r\n" + 
					"[{\r\n"+
						"\"Total_Wins\":" + "\"value" + "\",\r\n"+ 
						"\"Total_Losses\":" + "\"value" + ",\"\r\n"+ 
						"\"Total_Ties\":" + "\"value" + "\"\r\n"+
					"}]\r\n"+
				"} \r\n\n" 
					
				+"Example: \r\n"
				+"{\"Player_Move\": rock, \"Computer_Move\": paper, \"Winner\": Player } => returns: \r\n"
				+"{\r\n"+ 
				"\"Total_Games\": \"1 ,\r\n"+ 
				"\"Player\":\r\n" + 
					"[{\r\n"+
						"\"Total_Wins\":" + "\"1"+ "\",\r\n"+ 
						"\"Total_Losses\":" + "\"0"+ "\",\r\n"+ 
						"\"Total_Ties\":" + "\"0" + "\",\r\n"+
					"}],\r\n"+
				"\"Computer\":\r\n" + 
					"[{\r\n"+
						"\"Total_Wins\":" + "\"0" + "\",\r\n"+ 
						"," +
						"\"Total_Losses\":" + "\"1" + "\",\r\n"+ 
						"," +
						"\"Total_Ties\":" + "\"0" + "\"\r\n"+
					"}]\r\n"+
				"}" ;
	}
	
	public String SSPDescription() {
		return "Sten Sax Påse Dokumentation: \r\n\n"
				+ SspPostDescription() + "\r\n\n" 
				+ SspGetDescription();
	}
	
	//---------------------------------Sten sax påse dokumentation------------------------------------
	
	//---------------------------------CSV fileReader------------------------------------
	
	public String ShowCsvDescription() {
		return "CSV File-Reader dokumentation: \r\n\n"
				+  "[GET] Endpoint /ShowCsv \r\n"
				+ "! Läser en CSV-fil och returnerar i json-format \r\n"
				+ "> Inga parametrar \r\n"
				+ "< Returns Json => { \"Orders\": [{\"OrderDate\": \"Value\",\"Region\": \"Value\",\"Rep1\": \"Value\",\"Rep2\": \"Value\",\"Item\": \"Value\",\"Units\": \"Value\",\"UnitCost\": \"Value\",\"Total\": \"Value\"}]} \r\n"
				+ "/* Exempel:\r\n/" 
				+ "{\"Orders\": [{\"OrderDate\": \"1/6/2019\",\"Region\": \"East\",\"Rep1\": \"Jones\",\"Rep2\": \"Sharell\",\"Item\": \"Pencil\",\"Units\": \"95\",\"UnitCost\": \"1.99\",\"Total\": \"189.05\"}]}";
	}
	
	//---------------------------------CSV fileReader------------------------------------
	
	//---------------------------------Random IMG------------------------------------
	
	public String ImgDescription() {
		return "IMG randomerare dokumentation: \r\n\n"
				+ "[GET] Endpoint /img \r\n"
				+ "! Väljer en random bild och visar upp den på skärmen \r\n"
				+ "> Inga parametrar \r\n"
				+ "< Returns image \r\n";
	}
	
	//---------------------------------Random IMG------------------------------------
	
	public String totDescription() {
		return
				
				
				CalcDescription() + "\r\n\n" 
				+ SSPDescription() + "\r\n\n" 
				+ ShowCsvDescription() + "\r\n\n"
				+ ImgDescription();
	}
}
