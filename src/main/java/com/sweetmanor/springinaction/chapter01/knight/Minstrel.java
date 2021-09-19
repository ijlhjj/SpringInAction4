package com.sweetmanor.springinaction.chapter01.knight;

import java.io.PrintStream;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 吟游诗人
 */
@Aspect
public class Minstrel {

	private PrintStream stream;

	public Minstrel(PrintStream stream) {
		this.stream = stream;
	}

	/**
	 * 定义切点
	 */
	@Pointcut("execution(* *.embarkOnQuest(..))")
	private void embarkOnQuest() {
	};

	/**
	 * 前置处理器
	 */
	@Before("embarkOnQuest()")
	public void singBeforeQuest() {
		stream.println("Fa la la, the knight is so brave!");
	}

	/**
	 * 后置处理器
	 */
	@After("embarkOnQuest()")
	public void singAfterQuest() {
		stream.println("Tee hee hee, the brave knight did embark on a quest!");
	}

}
