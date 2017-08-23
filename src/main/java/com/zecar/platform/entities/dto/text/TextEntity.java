package com.zecar.platform.entities.dto.text;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class TextEntity {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Base64 encoded text.", required=true)
	public String b64;
	
	public TextEntity(){}
	
	public TextEntity(final String b64){
		this.b64 = b64;
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((b64 == null) ? 0 : b64.hashCode());
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
		final TextEntity other = (TextEntity) obj;
		if (b64 == null) {
			if (other.b64 != null)
				return false;
		} else if (!b64.equals(other.b64))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "TextEntity [b64=" + b64 + "]";
	}
}
