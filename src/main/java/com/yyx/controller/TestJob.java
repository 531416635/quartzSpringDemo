package com.yyx.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestJob {

	private static final Logger logger = LoggerFactory.getLogger(TestJob.class);

	// ��Ҫִ�еĲ�����
	public void execute() {
		execute2();
	}

	public void execute2() {
		logger.error("����Quartz:",new Date());
	}
}
