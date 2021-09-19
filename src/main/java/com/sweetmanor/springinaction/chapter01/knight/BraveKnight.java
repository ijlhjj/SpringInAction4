package com.sweetmanor.springinaction.chapter01.knight;

/**
 * 英勇的骑士
 */
public class BraveKnight implements Knight {

	private Quest quest;

	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	@Override
	public void embarkOnQuest() {
		quest.embark();
	}

}
