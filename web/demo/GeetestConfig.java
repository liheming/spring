package com.geetest.sdk.java.web.demo;

/**
 * GeetestWeb配置文件
 * 
 *
 */
public class GeetestConfig {

	// 填入自己的captcha_id和private_key
	private static final String captcha_id = "c9de0cb043f85dbf794dcb4f708ec8f7";
	private static final String private_key = "26abe43615fd01ea4c0312838fc1ceb5";

	public static final String getCaptcha_id() {
		return captcha_id;
	}

	public static final String getPrivate_key() {
		return private_key;
	}

}
