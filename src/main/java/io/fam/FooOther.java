package io.fam;

import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component("foot")
public class FooOther {

	private FooFormatter fooFormatter;

	@Autowired
	public void setFormatter(FooFormatter fooFormatter) {
		this.fooFormatter = fooFormatter;
	}

	public FooFormatter getFormatter() {
		return fooFormatter;
	}
	
}
