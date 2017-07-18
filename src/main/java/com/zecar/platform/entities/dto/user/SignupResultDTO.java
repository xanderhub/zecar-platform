package com.zecar.platform.entities.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class SignupResultDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="true - if user successfully created", required=true)
	public boolean success;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Error message in case user creation was not successful", required=false)
	public String errorMessage;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="ID of newly created user", required=false)
	public String id;
	
	public SignupResultDTO(){}
	
	public SignupResultDTO(final String id){
		this.id = id;
		this.success = true;
	}
	
	public SignupResultDTO(final String errorMessage, final boolean success){
		if (success){
			throw new RuntimeException("Constructor with errorMessage can not be invoked when success=true");
		}
		this.success = success;
		this.errorMessage = errorMessage;
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((errorMessage == null) ? 0 : errorMessage.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (success ? 1231 : 1237);
		return result;
	}
	@Override
	public final boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final SignupResultDTO other = (SignupResultDTO) obj;
		if (errorMessage == null) {
			if (other.errorMessage != null)
				return false;
		} else if (!errorMessage.equals(other.errorMessage))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (success != other.success)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "SignupResultDTO [success=" + success + ", errorMessage=" + errorMessage + ", id=" + id + "]";
	}
}
