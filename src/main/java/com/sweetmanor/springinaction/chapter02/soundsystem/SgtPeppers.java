package com.sweetmanor.springinaction.chapter02.soundsystem;

import org.springframework.stereotype.Component;

/**
 * 甲壳虫乐队的第八张录音室专辑
 */
@Component
public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
