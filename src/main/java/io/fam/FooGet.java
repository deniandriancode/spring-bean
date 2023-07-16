package io.fam;

import org.springframework.stereotype.*;

@Component("fooGet")
public class FooGet implements Formatter {

	@Override
	public void format() {
		System.out.println("FOO GET");
	}
	
}
