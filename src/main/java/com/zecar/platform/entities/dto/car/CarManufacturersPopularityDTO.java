package com.zecar.platform.entities.dto.car;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class CarManufacturersPopularityDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Manufacturer's name", required=true)
	public String name;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Manufacturer's popularity index", required=true)
	public double popularity;
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		final CarManufacturersPopularityDTO other = (CarManufacturersPopularityDTO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "CarManufacturersPopularityDTO [name=" + name + ", popularity=" + popularity + "]";
	}
}
