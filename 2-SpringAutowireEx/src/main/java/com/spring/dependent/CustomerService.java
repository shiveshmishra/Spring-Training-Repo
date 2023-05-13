package com.spring.dependent;

public class CustomerService {
	private String serviceName;
	private String serviceType;

	public CustomerService() {
		super();
	}

	public CustomerService(String serviceName, String serviceType) {
		super();
		this.serviceName = serviceName;
		this.serviceType = serviceType;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	@Override
	public String toString() {
		return "CustomerService [serviceName=" + serviceName + ", serviceType=" + serviceType + "]";
	}

}
