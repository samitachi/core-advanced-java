package com.infotech.customer.model;

import org.springframework.stereotype.Component;

@Component
public class CustomerManagement {
	private String name;

	public CustomerManagement() {
		super();
	}

	public CustomerManagement(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CustomerManagement [name=" + name + "]";
	}

}
