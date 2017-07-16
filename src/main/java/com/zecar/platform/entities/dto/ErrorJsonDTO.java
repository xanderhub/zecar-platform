package com.zecar.platform.entities.dto;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class ErrorJsonDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Status code", required=true)
	public int status;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Error name", required=true)
    public String error;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Error message", required=true)
    public String message;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Error timestamp", required=true)
    public String timeStamp;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Stack trace if debug=true", required=false)
    public String trace;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Request params if debug=true", required=false)
    public Map<String, String[]> requestParams;

    
    
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((error == null) ? 0 : error.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((requestParams == null) ? 0 : requestParams.hashCode());
		result = prime * result + status;
		result = prime * result + ((timeStamp == null) ? 0 : timeStamp.hashCode());
		result = prime * result + ((trace == null) ? 0 : trace.hashCode());
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
		final ErrorJsonDTO other = (ErrorJsonDTO) obj;
		if (error == null) {
			if (other.error != null)
				return false;
		} else if (!error.equals(other.error))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (requestParams == null) {
			if (other.requestParams != null)
				return false;
		} else if (!requestParams.equals(other.requestParams))
			return false;
		if (status != other.status)
			return false;
		if (timeStamp == null) {
			if (other.timeStamp != null)
				return false;
		} else if (!timeStamp.equals(other.timeStamp))
			return false;
		if (trace == null) {
			if (other.trace != null)
				return false;
		} else if (!trace.equals(other.trace))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "ErrorJsonDTO [status=" + status + ", error=" + error + ", message=" + message + ", timeStamp="
				+ timeStamp + ", trace=" + trace + ", requestParams=" + requestParams + "]";
	}
}
