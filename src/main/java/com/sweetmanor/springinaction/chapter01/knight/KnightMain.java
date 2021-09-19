package com.sweetmanor.springinaction.chapter01.knight;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sweetmanor.springinaction.chapter01.knight.config.KnightConfig;

/**
 * 应用启动类
 */
public class KnightMain {

	public static void main(String[] args) {
		loadByJavaConfig();
	}

	public static void loadByXml() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chapter01/knight.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}

	public static void loadByJavaConfig() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}

}
