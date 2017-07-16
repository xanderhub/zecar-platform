package com.zecar.platform.entities.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class UserDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="User's id", required=true)
	public String id;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="User's profile", required=true)
	public UserProfileDTO profile;

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((profile == null) ? 0 : profile.hashCode());
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
		final UserDTO other = (UserDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (profile == null) {
			if (other.profile != null)
				return false;
		} else if (!profile.equals(other.profile))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "UserDTO [id=" + id + ", profile=" + profile + "]";
	}
}
