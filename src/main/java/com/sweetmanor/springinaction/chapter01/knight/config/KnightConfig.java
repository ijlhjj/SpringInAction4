package com.sweetmanor.springinaction.chapter01.knight.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sweetmanor.springinaction.chapter01.knight.BraveKnight;
import com.sweetmanor.springinaction.chapter01.knight.Knight;
import com.sweetmanor.springinaction.chapter01.knight.Quest;
import com.sweetmanor.springinaction.chapter01.knight.SlayDragonQuest;

/**
 * 应用配置类
 */
@Configuration
public class KnightConfig {

	/**
	 * Spring在调用@Bean注解的方法时，会自动注入方法所需的参数（按类型注入）。 <br />
	 * Spring会拦截@Bean注解的方法，确保直接返回该方法所创建的bean，而不是每次都对其进行实际的调用。<br />
	 */
	@Bean
	public Knight knight(Quest quest) {
		return new BraveKnight(quest);
	}

	@Bean
	public Quest quest() {
		return new SlayDragonQuest(System.out);
	}

}
