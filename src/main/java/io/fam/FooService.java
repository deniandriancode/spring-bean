package io.fam;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component
public class FooService {

	@Autowired
	public FooFormatter fooFormatter;

}
