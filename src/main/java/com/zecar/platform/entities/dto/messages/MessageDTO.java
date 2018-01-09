package com.zecar.platform.entities.dto.messages;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zecar.platform.entities.dto.attachments.AttachmentDTO;
import com.zecar.platform.entities.dto.text.TagDTO;

import io.swagger.annotations.ApiModelProperty;

public final class MessageDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Message id.", required=true)
	public String id;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Sender's user id.", required=true)
	public String sender;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="In case message is a response to another message - the ID of parrent message.", required=false)
	public String parentId = null;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Message text content.", required=false)
	public String text;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Message attachments.", required=false)
	public List<AttachmentDTO> attachments;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Timestamp at which the message was sent.", required=true)
	public long time;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Topics of this message.", required=false)
	public List<TagDTO> topics;

	@JsonProperty(required=false)
	@ApiModelProperty(notes="Car model", required=false)
	public String carModelID;

	@JsonProperty(required=false)
	@ApiModelProperty(notes="Topics of this message.", required=false)
	public MessageStatusDTO status;

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		final MessageDTO other = (MessageDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "MessageDTO [id=" + id + ", sender=" + sender + ", parentId=" + parentId + ", text=" + text
				+ ", attachments=" + attachments + ", time=" + time + ", topics=" + topics + ", carModelID=" + carModelID + ", status=" + status + "]";
	}
}
