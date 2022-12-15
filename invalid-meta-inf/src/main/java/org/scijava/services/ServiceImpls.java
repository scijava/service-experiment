
package org.scijava.services;

public class ServiceImpls {

	public static class DummyServiceImpl implements IDummyService {

		@Override
		public int number() {
			return 1;
		}
	}

}
