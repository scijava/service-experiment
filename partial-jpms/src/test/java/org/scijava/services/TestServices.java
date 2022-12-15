package org.scijava.services;

import java.util.ServiceLoader;

import org.junit.jupiter.api.Test;

public class TestServices {
	@Test
	public void loadServices() {
		IDummyService next = ServiceLoader.load(IDummyService.class).iterator().next();
		System.out.println(next);
	}
}
