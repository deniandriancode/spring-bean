package io.fam;

import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component
public class AggFoo {

	@Autowired
	@Qualifier("fooGet")
	public Formatter fooGet;

	@Autowired
	@Qualifier("fooSet")
	public Formatter fooSet;

}
