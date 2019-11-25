package com.hx.hxcloudpan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 启动类 继承SpringBootServletInitializer，用于war包Tomcat部署
 * 
 * @author xush
 * @since 2019年10月11日
 */
@SpringBootApplication(scanBasePackages = "com.hx.hxcloudpan")
public class HxCloudPanApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(HxCloudPanApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(HxCloudPanApplication.class);
	}
}
