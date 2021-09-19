package com.sweetmanor.springinaction.chapter01.knight;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

/**
 * 测试英勇的骑士
 */
class BraveKnightTest {

	@Test
	void testEmbarkOnQuest() {
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}

}
