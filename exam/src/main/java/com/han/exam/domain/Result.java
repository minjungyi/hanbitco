package com.han.exam.domain;

public class Result<T>
{
	private String status;
	
	private T Data;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public T getData() {
		return Data;
	}
	public void setData(T data) {
		Data = data;
	}
	
}
