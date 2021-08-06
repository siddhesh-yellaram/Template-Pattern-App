package com.techlab.test;

import com.techlab.model.Cricket;
import com.techlab.model.Football;
import com.techlab.model.Game;

public class TemplatePatternTest {

	public static void main(String[] args) {
		Game g = new Cricket();
		g.play();
		g = new Football();
		g.play();
	}

}
