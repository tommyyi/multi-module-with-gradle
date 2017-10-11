package com.jikexueyuan.test;

import com.jikexueyuan.entity.User;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserTest {
	
	private static final Logger logger = LogManager.getLogger(UserTest.class);

	public static void main(String[] args) {
		User user = new User();
		user.setName("darkmi");
		user.setEmail("darkmi@126.com");
		user.setPassword("123456");
		
		logger.trace(user.toString());
		logger.debug(user.toString());
		logger.info(user.toString());
		logger.warn(user.toString());
		logger.error(user.toString());
		logger.fatal(user.toString());

	}

}
