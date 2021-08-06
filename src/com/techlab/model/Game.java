package com.techlab.model;

public abstract class Game {
	abstract void initialize();
	abstract void startPlaying();
	abstract void stopPlaying();
	
	//Template Method
	public final void play() {
		initialize();
		startPlaying();
		stopPlaying();
	}
}
