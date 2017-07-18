package com.zecar.platform.entities.dto.pictures;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class PictureDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Id of this picture", required=true)
	public String id;

	@JsonProperty(required=true)
	@ApiModelProperty(notes="Small-size image resource", required=true)
	public PictureDTOResource small;

	@JsonProperty(required=true)
	@ApiModelProperty(notes="Medium-size image resource", required=true)
	public PictureDTOResource medium;

	@JsonProperty(required=true)
	@ApiModelProperty(notes="Large-size image resource", required=true)
	public PictureDTOResource large;

	public PictureDTO(final String id,
			final PictureDTOResource small, 
			final PictureDTOResource medium, 
			final PictureDTOResource large){
		this.id = id;
		this.small = small;
		this.medium = medium;
		this.large = large;
	}
	public PictureDTO(){
		this.id = null;
		this.small = null;
		this.medium = null;
		this.large = null;
	}
	public PictureDTO(final PictureDTO picture){
		this.id = picture.id;
		this.small = new PictureDTOResource(picture.small);
		this.medium = new PictureDTOResource(picture.medium);
		this.large = new PictureDTOResource(picture.large);
	}
	public PictureDTO(final String id,
			final String smallResource, final PictureDTOResourceType smallType,
			final String mediumResource, final PictureDTOResourceType mediumType,
			final String largeResource, final PictureDTOResourceType largeType){
		this.id = id;
		this.small = new PictureDTOResource(smallResource, smallType);
		this.medium = new PictureDTOResource(mediumResource, mediumType);
		this.large = new PictureDTOResource(largeResource, largeType);
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((large == null) ? 0 : large.hashCode());
		result = prime * result + ((medium == null) ? 0 : medium.hashCode());
		result = prime * result + ((small == null) ? 0 : small.hashCode());
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
		final PictureDTO other = (PictureDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (large == null) {
			if (other.large != null)
				return false;
		} else if (!large.equals(other.large))
			return false;
		if (medium == null) {
			if (other.medium != null)
				return false;
		} else if (!medium.equals(other.medium))
			return false;
		if (small == null) {
			if (other.small != null)
				return false;
		} else if (!small.equals(other.small))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PictureDTO [id=" + id + ", small=" + small + ", medium=" + medium + ", large=" + large + "]";
	}
}
