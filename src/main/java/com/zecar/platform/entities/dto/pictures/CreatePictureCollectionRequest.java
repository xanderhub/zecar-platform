package com.zecar.platform.entities.dto.pictures;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class CreatePictureCollectionRequest {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Ids of header pictures", required=true)
	public List<String> headerPics;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Ids of all pictures", required=true)
	public List<String> allPics;

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allPics == null) ? 0 : allPics.hashCode());
		result = prime * result + ((headerPics == null) ? 0 : headerPics.hashCode());
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
		final CreatePictureCollectionRequest other = (CreatePictureCollectionRequest) obj;
		if (allPics == null) {
			if (other.allPics != null)
				return false;
		} else if (!allPics.equals(other.allPics))
			return false;
		if (headerPics == null) {
			if (other.headerPics != null)
				return false;
		} else if (!headerPics.equals(other.headerPics))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "CreatePictureCollectionRequest [headerPics=" + headerPics + ", allPics=" + allPics + "]";
	}
}
