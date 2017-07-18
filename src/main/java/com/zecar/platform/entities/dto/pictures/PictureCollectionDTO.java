package com.zecar.platform.entities.dto.pictures;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class PictureCollectionDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Id of this picture collection.", required=true)
	public String id;
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Total pictures count.", required=true)
	public int totalPictures;
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Header pictures representing this collection.", required=false)
	public List<PictureDTO> headerPictures;
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((headerPictures == null) ? 0 : headerPictures.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + totalPictures;
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
		final PictureCollectionDTO other = (PictureCollectionDTO) obj;
		if (headerPictures == null) {
			if (other.headerPictures != null)
				return false;
		} else if (!headerPictures.equals(other.headerPictures))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (totalPictures != other.totalPictures)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PictureCollectionDTO [id=" + id + ", totalPictures=" + totalPictures + ", headerPictures="
				+ headerPictures + "]";
	}
}
