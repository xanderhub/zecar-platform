package com.zecar.platform.entities.dto.pictures;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class PictureDTOResource {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Picture resource (url to the resource or BASE64)", required=true)
	public String resource;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Resource type (url or BASE64)", required=true)
	public PictureDTOResourceType type;
	
	public PictureDTOResource(final String resource, final PictureDTOResourceType type){
		this.resource = resource;
		this.type = type;
	}
	public PictureDTOResource(){
		this.resource = null;
		this.type = null;
	}
	public PictureDTOResource(final PictureDTOResource resource){
		this.resource = resource.resource;
		this.type = resource.type;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((resource == null) ? 0 : resource.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		final PictureDTOResource other = (PictureDTOResource) obj;
		if (resource == null) {
			if (other.resource != null)
				return false;
		} else if (!resource.equals(other.resource))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PictureDTOResource [resource=" + resource + ", type=" + type + "]";
	}
}
