package com.example.demo.dto;

public class AdminLoginDto {
	private String email;
    private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AdminLoginDto(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public AdminLoginDto() {
		super();
	}
	@Override
	public String toString() {
		return "AdimLoginDto [email=" + email + ", password=" + password + "]";
	}
    
}