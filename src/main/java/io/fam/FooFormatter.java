package io.fam;

import org.springframework.stereotype.*;

@Component("fooFormatter")
public class FooFormatter {

	public String format() {
		return "foo";
	}
	
}
