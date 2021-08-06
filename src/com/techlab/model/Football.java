package com.techlab.model;

public class Football extends Game{
	@Override
	void initialize() {
		System.out.println("\nFootball Game Initialized!!!");
	}
	
	@Override
	void startPlaying() {
		System.out.println("\nFootball Game Started! So Enjoy Playing It...");
	}
	
	@Override
	void stopPlaying() {
		System.out.println("\nFootball Game Finished!!!");
	}
}
