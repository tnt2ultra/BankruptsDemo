package ru.demo.bankrupts;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class BankruptsDemoApplicationTests {

	@Test
	void contextLoads() throws Exception {
		BankruptsServiceClient.main(null);
	}

}
