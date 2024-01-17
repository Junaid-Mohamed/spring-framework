package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PackmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var game = new MarioGame();
		var packmanGame = new PackmanGame(); //1. Object creation
		var gameRunner = new GameRunner(packmanGame);
		//2: Object creation + wiring of dependencies
		// packmanGame is dependency for GameRunner
		gameRunner.run();
	}

}
