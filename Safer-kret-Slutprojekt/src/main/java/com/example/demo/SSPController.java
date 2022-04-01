package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/SSP")
public class SSPController {
	private SSPGameBean SSPGB = new SSPGameBean();

	//  --------------------->StenSaxPåse<---------------------
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public String game(String userInput) {
		
		SSPGB.setPlayerMove(userInput.toLowerCase());
		String result = SSPGB.compareInputs();
		
		return 
				"{" +
					"\"Player_Move\":" + "\"" + SSPGB.getPlayerMove() + "\""+ 
					"," +
					"\"Computer_Move\":" + "\"" + SSPGB.getComputerMove() + "\""+ 
					"," +
					"\"Winner\":" + "\"" + result + "\""+
				"}";
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String totalScore(){
		return ObjectJson();
	}
	
	public String ObjectJson() {
		
		return "{"+ 
				"\"Total_Games\": \"" + SSPGB.getGamesPlayed() + 
				"\"," +
				"\"Player\":" + 
					"[{"+
						"\"Total_Wins\":" + "\"" + SSPGB.getPlayerTotalWins() + "\""+ 
						"," +
						"\"Total_Losses\":" + "\"" + SSPGB.getPlayerTotalLosses() + "\""+ 
						"," +
						"\"Total_Ties\":" + "\"" + SSPGB.getPlayerTotalTies() + "\""+
					"}]"+
				"," +
				"\"Computer\":" + 
					"[{"+
						"\"Total_Wins\":" + "\"" + SSPGB.getComputerTotalWins() + "\""+ 
						"," +
						"\"Total_Losses\":" + "\"" + SSPGB.getComputerTotalLosses() + "\""+ 
						"," +
						"\"Total_Ties\":" + "\"" + SSPGB.getComputerTotalTies() + "\""+
					"}]"+
				"}";
	}
	
	//  --------------------->StenSaxPåse<---------------------
	
}
