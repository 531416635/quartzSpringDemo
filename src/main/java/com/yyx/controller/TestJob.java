package com.yyx.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestJob {

	private static final Logger logger = LoggerFactory.getLogger(TestJob.class);

	public void execute() {
		try {
			logger.info("hello world!");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
