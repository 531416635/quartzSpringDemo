package com.yyx.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestJob {

	private static final Logger logger = LoggerFactory.getLogger(TestJob.class);

	// 把要执行的操作，
	public void execute() {
		execute2();
	}

	public void execute2() {
		logger.error("测试Quartz:",new Date());
	}
}
