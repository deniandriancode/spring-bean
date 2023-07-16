package io.fam;

import org.springframework.stereotype.*;

@Component("fooSet")
public class FooSet implements Formatter {

	@Override
	public void format() {
		System.out.println("SET FOO");
	}
	
}
