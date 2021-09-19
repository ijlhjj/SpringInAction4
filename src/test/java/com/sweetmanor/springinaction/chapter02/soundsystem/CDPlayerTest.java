package com.sweetmanor.springinaction.chapter02.soundsystem;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOutNormalized;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.sweetmanor.springinaction.chapter02.soundsystem.config.CDPlayerConfig;

//Junit4的配置方式
//@RunWith(SpringJUnit4ClassRunner.class)
//Junit5的配置方式
//@ExtendWith(SpringExtension.class)
//指定配置文件
//@ContextConfiguration(classes = CDPlayerConfig.class)
//@ContextConfiguration("classpath:chapter02\\soundsystem.xml")
//下面的注解可以替代上面2个注解
@SpringJUnitConfig(classes = CDPlayerConfig.class)
//@SpringJUnitConfig(locations = "classpath:chapter02\\soundsystem.xml")
class CDPlayerTest {

	@Autowired
	private MediaPlayer player;

	@Autowired
	private CompactDisc cd;

	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}

	@Test
	public void play() throws Exception {
		String text = tapSystemOutNormalized(() -> {
			player.play();
		});
		assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n", text);
	}

}
