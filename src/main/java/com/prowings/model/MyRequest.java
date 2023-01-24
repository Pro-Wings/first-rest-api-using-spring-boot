package com.prowings.model;

public class MyRequest {
	
	String id;
	String name;
	String correlationId;
	
	public MyRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	@Override
	public String toString() {
		return "MyRequest [id=" + id + ", name=" + name + ", correlationId=" + correlationId + "]";
	}

	
}
