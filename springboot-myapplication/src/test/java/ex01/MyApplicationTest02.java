package ex01;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 
 * Spring Boot Test Integration
 * 실패하는 이유: SpringBoot로 만들어놓고 Configuration(MyApplication)으로 사용하고 있기 때문
 * 
 * Error :
 * Spring Boot Test Integration(@SpringBootTest) 내에서는 
 * @Configuration 을 달고 있는 설정 클래스를 스캔하지 못 한다.
 * 해결책? -> @SpringConfiguration 을 달면 된다 ! (package02 참고)
 * 
 */

@SpringBootTest
public class MyApplicationTest02 {
	
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponentNtoNull() {
		assertNotNull(myComponent);
	}
}
