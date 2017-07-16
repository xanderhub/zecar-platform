package com.zecar.platform.entities.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class UserReportedDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Reported user id", required=true)
	public String id;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="true if report registered successfuly", required=true)
    public boolean success;

    public UserReportedDTO(){
        this.id = null;
        this.success = false;
    }

    public UserReportedDTO(final String id) {
        this.success = true;
        this.id = id;
    }

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
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
		final UserReportedDTO other = (UserReportedDTO) obj;
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
		return "UserReportedDTO [id=" + id + ", success=" + success + "]";
	}
}
