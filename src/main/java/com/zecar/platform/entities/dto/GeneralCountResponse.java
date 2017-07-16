package com.zecar.platform.entities.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class GeneralCountResponse {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Count of requested items", required=true)
	public long count;
	
	public GeneralCountResponse(){}
	public GeneralCountResponse(final long count){
		this.count = count;
	}
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (count ^ (count >>> 32));
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
		GeneralCountResponse other = (GeneralCountResponse) obj;
		if (count != other.count)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "GeneralCountResponse [count=" + count + "]";
	}
}
