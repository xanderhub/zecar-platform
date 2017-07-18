package com.zecar.platform.entities.dto.rating;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class RatingDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Item's id.", required=true)
	public String itemID;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="The rating of the item.", required=true)
	public double rating;
	

	public RatingDTO(final String itemID, final double rating){
		this.itemID = itemID;
		this.rating = rating;
	}

	public RatingDTO(){}

	public RatingDTO(final String itemID){
		this.itemID = itemID;
	}
	
	public RatingDTO(final double rating){
		this.rating = rating;
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemID == null) ? 0 : itemID.hashCode());
		long temp;
		temp = Double.doubleToLongBits(rating);
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
		final RatingDTO other = (RatingDTO) obj;
		if (itemID == null) {
			if (other.itemID != null)
				return false;
		} else if (!itemID.equals(other.itemID))
			return false;
		if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "RatingDTO [itemID=" + itemID + ", rating=" + rating + "]";
	}
}
