package com.sweetmanor.springinaction.chapter02.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * CD播放器
 */
@Component
public class CDPlayer implements MediaPlayer {

	@Autowired
	private CompactDisc cd;

	@Override
	public void play() {
		cd.play();
	}

}
