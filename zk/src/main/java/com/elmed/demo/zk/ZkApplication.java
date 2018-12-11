package com.elmed.demo.zk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class ZkApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZkApplication.class, args);
	}
}
