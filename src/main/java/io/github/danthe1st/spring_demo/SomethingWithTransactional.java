package io.github.danthe1st.spring_demo;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class SomethingWithTransactional {
	
	@Transactional
	public void doSomething() {
	}
	
}
