package com.zecar.platform.entities.dto.banner;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class BannerDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Time in milliseconds after which the impression should be changed in UI", required=true)
	public long changeAfter;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="List of impressions", required=true)
    public List<BannerImpressionDTO> impressions;
    
    public BannerDTO(final List<BannerImpressionDTO> impressions, final long changeAfter){
        this.changeAfter = changeAfter;
        this.impressions = impressions;
    }
    
    public BannerDTO(final List<BannerImpressionDTO> impressions){
    	this(impressions, 10000);
    }
    
    public BannerDTO(){
    	this(new ArrayList<BannerImpressionDTO>());
    }
    
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (changeAfter ^ (changeAfter >>> 32));
		result = prime * result + ((impressions == null) ? 0 : impressions.hashCode());
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
		final BannerDTO other = (BannerDTO) obj;
		if (changeAfter != other.changeAfter)
			return false;
		if (impressions == null) {
			if (other.impressions != null)
				return false;
		} else if (!impressions.equals(other.impressions))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "BannerDTO [changeAfter=" + changeAfter + ", impressions=" + impressions + "]";
	}
}
