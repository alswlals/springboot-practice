package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 
 * @SpringBootApplication 메타 어노테이션
 * 
 * + @SpringBootConfiguration : cf) ex01, ex02
 * + @ComponentScan : ex04 하위 패키지를 스캐닝한다. ef) ex03
 * + @EnableAutoConfiguration :
 * 		1. MVC, AOP, Seucrity, JPA 등을 자동 "default"(미세 설정 필요) 설정
 * 		2. 발견된 Starter Dependency(Library) 기반으로 설정
 * 
 * */
@SpringBootApplication
public class MyApplication {
	public static void main(String[] args) {
		try (ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)) {

		}
	}
}