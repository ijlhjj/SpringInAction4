package com.sweetmanor.springinaction.chapter02.soundsystem.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sweetmanor.springinaction.chapter02.soundsystem.CompactDisc;

/**
 * 如果没有其他配置的话，@ComponentScan默认会扫描与配置类相同的包（包括所有子包）。
 */
@Configuration
@ComponentScan(basePackageClasses = { CompactDisc.class })
public class CDPlayerConfig {

}
