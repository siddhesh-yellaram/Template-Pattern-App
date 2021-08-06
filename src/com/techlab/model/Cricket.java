package com.techlab.model;

public class Cricket extends Game {
	@Override
	void initialize() {
		System.out.println("\nCricket Game Initialized!!!");
	}
	
	@Override
	void startPlaying() {
		System.out.println("\nCricket Game Started! So Enjoy Playing It...");
	}
	
	@Override
	void stopPlaying() {
		System.out.println("\nCricket Game Finished!!!");
	}
}
