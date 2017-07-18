package com.zecar.platform.entities.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class ThirdPartyLoginRequestDTO {
	@JsonProperty(required=false)
	@ApiModelProperty(notes="user id", required=false)
	public String id;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="access-token", required=true)
	public String token;

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((token == null) ? 0 : token.hashCode());
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
		final ThirdPartyLoginRequestDTO other = (ThirdPartyLoginRequestDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (token == null) {
			if (other.token != null)
				return false;
		} else if (!token.equals(other.token))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "ThirdPartyLoginRequestDTO [id=" + id + ", token=" + token + "]";
	}
}
