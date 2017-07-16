package com.zecar.platform.entities.dto.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class PubNubMessageDTO {
	@ApiModelProperty(notes="Message id.", required=true)
	@JsonProperty(required=true)
	public String messageID;
	
	@ApiModelProperty(notes="Chat id.", required=true)
	@JsonProperty(required=true)
	public String chatID;
	
	public PubNubMessageDTO(final String messageID, final String chatID){
		this.messageID = messageID;
		this.chatID = chatID;
	}
	
	public PubNubMessageDTO(){}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chatID == null) ? 0 : chatID.hashCode());
		result = prime * result + ((messageID == null) ? 0 : messageID.hashCode());
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
		final PubNubMessageDTO other = (PubNubMessageDTO) obj;
		if (chatID == null) {
			if (other.chatID != null)
				return false;
		} else if (!chatID.equals(other.chatID))
			return false;
		if (messageID == null) {
			if (other.messageID != null)
				return false;
		} else if (!messageID.equals(other.messageID))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PubNubMessageDTO [messageID=" + messageID + ", chatID=" + chatID + "]";
	}
}
