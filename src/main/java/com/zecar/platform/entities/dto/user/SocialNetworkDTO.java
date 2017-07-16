package com.zecar.platform.entities.dto.user;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class SocialNetworkDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Social network name", required=true)
	public String networkName;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="User's id in this social network", required=true)
	public String networkUserName;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Additional social network specific properties", required=false)
	public Map<String, Object> additionalProperties;

	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((networkName == null) ? 0 : networkName.hashCode());
		result = prime * result + ((networkUserName == null) ? 0 : networkUserName.hashCode());
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
		final SocialNetworkDTO other = (SocialNetworkDTO) obj;
		if (additionalProperties == null) {
			if (other.additionalProperties != null)
				return false;
		} else if (!additionalProperties.equals(other.additionalProperties))
			return false;
		if (networkName == null) {
			if (other.networkName != null)
				return false;
		} else if (!networkName.equals(other.networkName))
			return false;
		if (networkUserName == null) {
			if (other.networkUserName != null)
				return false;
		} else if (!networkUserName.equals(other.networkUserName))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "SocialNetworkDTO [networkName=" + networkName + ", networkUserName=" + networkUserName
				+ ", additionalProperties=" + additionalProperties + "]";
	}
}
