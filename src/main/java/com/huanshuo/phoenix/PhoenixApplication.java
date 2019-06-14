package com.huanshuo.phoenix;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.huanshuo.phoenix.mapper")
public class PhoenixApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhoenixApplication.class, args);
	}

}
