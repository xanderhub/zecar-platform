package com.zecar.platform.entities.dto.attachments;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class AttachmentDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Attachment id.", required=true)
	public String id;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Attachment type.", required=true)
	public AttachmentTypeDTO type;

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		AttachmentDTO other = (AttachmentDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "AttachmentDTO [id=" + id + ", type=" + type + "]";
	}
}
