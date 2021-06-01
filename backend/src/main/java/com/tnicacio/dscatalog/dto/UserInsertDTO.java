package com.tnicacio.dscatalog.dto;

import com.tnicacio.dscatalog.services.validation.UserInsertValid;

@UserInsertValid
public class UserInsertDTO extends UserDTO {
	private static final long serialVersionUID = 1L;

	private String password;

	public String getPassword() {
		return password;
	}

	public UserInsertDTO() {
		super();
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
