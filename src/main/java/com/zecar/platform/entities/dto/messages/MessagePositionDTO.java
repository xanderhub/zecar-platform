package com.zecar.platform.entities.dto.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class MessagePositionDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Message id.", required=true)
	public String messageId;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Parent message id.", required=true)
	public String parentId;

	
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((messageId == null) ? 0 : messageId.hashCode());
		result = prime * result + ((parentId == null) ? 0 : parentId.hashCode());
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
		final MessagePositionDTO other = (MessagePositionDTO) obj;
		if (messageId == null) {
			if (other.messageId != null)
				return false;
		} else if (!messageId.equals(other.messageId))
			return false;
		if (parentId == null) {
			if (other.parentId != null)
				return false;
		} else if (!parentId.equals(other.parentId))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "MessagePositionDTO [messageId=" + messageId + ", parentId=" + parentId + "]";
	}
}
