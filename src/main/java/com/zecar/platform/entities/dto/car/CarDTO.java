package com.zecar.platform.entities.dto.car;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zecar.platform.entities.dto.pictures.PictureCollectionDTO;

import io.swagger.annotations.ApiModelProperty;

public final class CarDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Car entity ID", required=true)
	public String id;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Model of this car", required=true)
	public CarModelDTO model;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Pictures of this car", required=false)
	public PictureCollectionDTO carPictures;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="The date this car is in use from", required=false)
	public Date inUseSince;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="The date this car was manufactured in", required=true)
	public Date manufactured;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Additional info or comments about this car", required=false)
	public String additionalInfo;

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		final CarDTO other = (CarDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "CarDTO [id=" + id + ", model=" + model + ", carPictures=" + carPictures + ", inUseSince=" + inUseSince
				+ ", manufactured=" + manufactured + ", additionalInfo=" + additionalInfo + "]";
	}
}
