package com.zecar.platform.entities.dto;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class GeneralQueryResponseDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Is query successfull", required=true)
	public boolean success;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Additional values", required=false)
	public Map<String, Object> additionalValues;
	
	
	public GeneralQueryResponseDTO(final boolean success, final Object ...args){
		this.success = success;
		final Map<String, Object> map = this.additionalValues = new HashMap<String, Object>();
		boolean isKey = true;
		String key = null;
		for(final Object obj : args){
			if (isKey){
				key = obj.toString();
			}else{
				map.put(key, obj);
			}
			isKey = !isKey;
		}
	}
	public GeneralQueryResponseDTO(){
		this(false);
	}
	
	
	@Override
	public final String toString() {
		return "GeneralQueryResponseDTO [success=" + success + ", additionalValues=" + additionalValues + "]";
	}
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalValues == null) ? 0 : additionalValues.hashCode());
		result = prime * result + (success ? 1231 : 1237);
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
		final GeneralQueryResponseDTO other = (GeneralQueryResponseDTO) obj;
		if (additionalValues == null) {
			if (other.additionalValues != null)
				return false;
		} else if (!additionalValues.equals(other.additionalValues))
			return false;
		if (success != other.success)
			return false;
		return true;
	}
}
