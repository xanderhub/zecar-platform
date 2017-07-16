package com.zecar.platform.entities.dto.car;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zecar.platform.entities.dto.pictures.PictureCollectionDTO;

import io.swagger.annotations.ApiModelProperty;

public final class CarModelDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Car's model entity ID", required=true)
	public String id;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Car's model name", required=true)
	public String modelName;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Car's model sub-name", required=false)
	public String modelSubName;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Car's manufacturer", required=true)
	public CarManufacturerDTO manufacturer;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="The year since the model is manufactured", required=true)
	public Integer manufaturedSince;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="The year the model was manufactured until. Null if still in production.", required=false)
	public Integer manufaturedUntil;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Pictures of this model", required=false)
	public PictureCollectionDTO modelPictures;

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
		final CarModelDTO other = (CarModelDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "CarModelDTO [id=" + id + ", modelName=" + modelName + ", modelSubName=" + modelSubName
				+ ", manufacturer=" + manufacturer + ", manufaturedSince=" + manufaturedSince + ", manufaturedUntil="
				+ manufaturedUntil + ", modelPictures=" + modelPictures + "]";
	}
}
