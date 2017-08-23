package com.zecar.platform.entities.dto.text;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class TagDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Text tag.", required=true)
	public String tag;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Tags weight", required=true)
	public double weight;
	
	public TagDTO(){}
	
	public TagDTO(final String tag, final double weight){
		this.tag = tag;
		this.weight = weight;
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tag == null) ? 0 : tag.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		final TagDTO other = (TagDTO) obj;
		if (tag == null) {
			if (other.tag != null)
				return false;
		} else if (!tag.equals(other.tag))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "TagDTO [tag=" + tag + ", weight=" + weight + "]";
	}
}
