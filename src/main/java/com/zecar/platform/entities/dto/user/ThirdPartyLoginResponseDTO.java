package com.zecar.platform.entities.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class ThirdPartyLoginResponseDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="true - if user successfully validated. false - otherwise.", required=true)
	public boolean success;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="true - if user successfully was created on this request. false - otherwise.", required=true)
	public boolean isNew;

	@JsonProperty(required=false)
	@ApiModelProperty(notes="ID (Username) for login.", required=false)
	public String id;

	@JsonProperty(required=false)
	@ApiModelProperty(notes="User's password.", required=false)
	public String password;

	@JsonProperty(required=false)
	@ApiModelProperty(notes="Message in case of failed validation.", required=false)
	public String message;
	
	public ThirdPartyLoginResponseDTO(final String username, final String password, final boolean isNew){
		this.success = true;
		this.message = null;
		this.id = username;
		this.password = password;
		this.isNew = isNew;
	}

	public ThirdPartyLoginResponseDTO(final String message){
		this.success = false;
		this.message = message;
		this.id = null;
		this.password = null;
		this.isNew = false;
	}
	
	public ThirdPartyLoginResponseDTO(){}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (isNew ? 1231 : 1237);
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		final ThirdPartyLoginResponseDTO other = (ThirdPartyLoginResponseDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isNew != other.isNew)
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (success != other.success)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "ThirdPartyLoginResponseDTO [success=" + success + ", isNew=" + isNew + ", id=" + id + ", password="
				+ password + ", message=" + message + "]";
	}
}
