package com.microservicios.actividaddosmicroservicios.users.src.test.java.com.usersPackage.Users;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class UserApplicationTests {

	@Test
	void contextLoads() {
	}

}
