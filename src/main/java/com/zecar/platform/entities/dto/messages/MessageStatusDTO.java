package com.zecar.platform.entities.dto.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class MessageStatusDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Message status.", required=true)
	public MessageStatusENUM status;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Timestamp.", required=true)
	public long time;
	
	public MessageStatusDTO(){}
	
	public MessageStatusDTO(final MessageStatusENUM status, final long time){
		this.status = status;
		this.time = time;
	}
	
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + (int) (time ^ (time >>> 32));
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
		final MessageStatusDTO other = (MessageStatusDTO) obj;
		if (status != other.status)
			return false;
		if (time != other.time)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "MessageStatusDTO [status=" + status + ", time=" + time + "]";
	}
}
