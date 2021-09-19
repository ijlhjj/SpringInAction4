package com.sweetmanor.springinaction.chapter01.knight;

import java.io.PrintStream;

/**
 * 屠龙
 */
public class SlayDragonQuest implements Quest {

	private PrintStream stream;

	public SlayDragonQuest(PrintStream stream) {
		this.stream = stream;
	}

	@Override
	public void embark() {
		stream.println("Embarking on quest to slay the dragon!");
	}

}
