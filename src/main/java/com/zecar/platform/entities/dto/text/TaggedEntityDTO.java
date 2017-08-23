package com.zecar.platform.entities.dto.text;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class TaggedEntityDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Entity id.", required=true)
	public String id;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Entity tags.", required=true)
	public List<TagDTO> tags;
	
	public TaggedEntityDTO(){}
	
	public TaggedEntityDTO(final String id, final List<TagDTO> tags){
		this.id = id;
		this.tags = tags;
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
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
		final TaggedEntityDTO other = (TaggedEntityDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "TaggedEntityDTO [id=" + id + ", tags=" + tags + "]";
	}
}
