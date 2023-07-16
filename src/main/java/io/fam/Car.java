package io.fam;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component
public class Car {

	public Engine engine;
	public Transmission transmission;

	@Autowired
	public Car(Engine engine, Transmission transmission) {
		this.engine = engine;
		this.transmission = transmission;
	}

	@Override
	public String toString() {
		return String.format("Car[engine=%s, transmission=%s]", engine, transmission);
	}

}
