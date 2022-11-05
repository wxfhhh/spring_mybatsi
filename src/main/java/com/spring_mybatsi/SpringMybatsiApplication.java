package com.spring_mybatsi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.spring_mybatsi.mapper")
public class SpringMybatsiApplication {
	public static void main(String[] args) {
		//test push异常 版本号不同
		SpringApplication.run(SpringMybatsiApplication.class, args);
	}

}
