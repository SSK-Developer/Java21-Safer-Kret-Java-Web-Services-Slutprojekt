package com.example.demo;

import java.util.Random;

public class SSPGameBean {

	// initiate RPSPlayerBean class
	private SSPPlayerBean player = new SSPPlayerBean();
	private SSPPlayerBean Computer = new SSPPlayerBean();
	private int GamesPlayed;

	public SSPGameBean() {
	}

	// get total number of wins
	public int getPlayerTotalWins() {
		return player.getWins();
	}

	public int getComputerTotalWins() {
		return Computer.getWins();
	}

	// get total number of losses
	public int getPlayerTotalLosses() {
		return player.getLosses();
	}

	public int getComputerTotalLosses() {
		return Computer.getLosses();
	}

	// get total number of ties
	public int getPlayerTotalTies() {
		return player.getTies();
	}

	public int getComputerTotalTies() {
		return Computer.getTies();
	}

	// get total number of games played
	public int getGamesPlayed() {
		return this.GamesPlayed;
	}

	// set player move (example: rock, paper or scissors)
	public void setPlayerMove(String player1Move) {
		this.player.setMove(player1Move);
	}

	// get player move (example: rock, paper or scissors)
	public String getPlayerMove() {
		return player.getMove();
	}
	
	public String getComputerMove() {
		return Computer.getMove();
	}

	public String getRandomRPSString() {
		String computerChoice;
		String[] computerOptions = new String[] { "rock", "paper", "scissors" }; // create a String array that includes
																					// "rock", "paper", "scissors"
		int randomNumber = new Random().nextInt(3); // use the method Random and insert a random number between 1-3 into
													// the variable randomNumber
		computerChoice = computerOptions[randomNumber]; // use the random number and get a random index from the array

		return computerChoice;
	}

	public String compareInputs() {
		this.Computer.setMove(getRandomRPSString());
		String Computer = getComputerMove();
		String player = getPlayerMove();
		String winner = "";

		// switch-case that checks player move and compares it to Computer move with
		// nested switch-case
		switch (player) {
		case "rock": // player

			switch (Computer) {
			case "rock":
				this.player.addTies();
				this.Computer.addTies();
				this.GamesPlayed += 1;
				winner = "tie";
				break;
			case "scissors":
				this.player.addWins();
				this.Computer.addLosses();
				this.GamesPlayed += 1;
				winner = "Player";
				break;
			case "paper":
				this.Computer.addWins();
				this.player.addLosses();
				this.GamesPlayed += 1;
				winner = "Computer";
				break;
			}

			break;

		case "scissors": // player

			switch (Computer) {
			case "rock":
				this.Computer.addWins();
				this.player.addLosses();
				this.GamesPlayed += 1;
				winner = "Computer";
				break;
			case "scissors":
				this.player.addTies();
				this.Computer.addTies();
				this.GamesPlayed += 1;
				winner = "tie";
				break;
			case "paper":
				this.player.addWins();
				this.Computer.addLosses();
				this.GamesPlayed += 1;
				winner = "Player";
				break;
			}
			break;

		case "paper": // player
			switch (Computer) {
			case "rock":
				this.player.addWins();
				this.Computer.addLosses();
				this.GamesPlayed += 1;
				winner = "Player";
				break;
			case "scissors":
				this.Computer.addWins();
				this.player.addLosses();
				this.GamesPlayed += 1;
				winner = "Computer";
				break;
			case "paper":
				this.player.addTies();
				this.Computer.addTies();
				this.GamesPlayed += 1;
				winner = "tie";
				break;
			}
			break;

		}

		return winner;
	}

}
