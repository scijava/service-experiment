module org.scijava.services {
	
	exports org.scijava.services;
	
	uses org.scijava.services.IDummyService;
	
	provides org.scijava.services.IDummyService with org.scijava.services.ServiceImpls.DummyServiceImpl;
}
