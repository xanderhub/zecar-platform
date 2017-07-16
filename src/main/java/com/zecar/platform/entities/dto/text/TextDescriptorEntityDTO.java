package com.zecar.platform.entities.dto.text;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class TextDescriptorEntityDTO {
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Entity salience", required=false)
	public float salience;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Entity text", required=false)
	public String entity;

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((entity == null) ? 0 : entity.hashCode());
		result = prime * result + Float.floatToIntBits(salience);
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
		final TextDescriptorEntityDTO other = (TextDescriptorEntityDTO) obj;
		if (entity == null) {
			if (other.entity != null)
				return false;
		} else if (!entity.equals(other.entity))
			return false;
		if (Float.floatToIntBits(salience) != Float.floatToIntBits(other.salience))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "TextDescriptorEntityDTO [salience=" + salience + ", entity=" + entity + "]";
	}
}
