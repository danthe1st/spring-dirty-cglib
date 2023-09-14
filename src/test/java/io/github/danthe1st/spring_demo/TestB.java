package io.github.danthe1st.spring_demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = { "a=b" })
class TestB {
	
	@Test
	void b() throws Exception {
	}
}
