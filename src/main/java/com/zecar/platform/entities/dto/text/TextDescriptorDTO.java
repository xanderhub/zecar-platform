package com.zecar.platform.entities.dto.text;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class TextDescriptorDTO {
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Text's sentiment polarity", required=false)
	public float sentimentPolarity;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Text's sentiment magnitude", required=false)
	public float sentimentMagnitude;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Detected text language", required=false)
	public String language;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Sentences", required=false)
	public List<String> sentences;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Extracted entities", required=false)
	public List<TextDescriptorEntityDTO> entities;

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((entities == null) ? 0 : entities.hashCode());
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((sentences == null) ? 0 : sentences.hashCode());
		result = prime * result + Float.floatToIntBits(sentimentMagnitude);
		result = prime * result + Float.floatToIntBits(sentimentPolarity);
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
		final TextDescriptorDTO other = (TextDescriptorDTO) obj;
		if (entities == null) {
			if (other.entities != null)
				return false;
		} else if (!entities.equals(other.entities))
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (sentences == null) {
			if (other.sentences != null)
				return false;
		} else if (!sentences.equals(other.sentences))
			return false;
		if (Float.floatToIntBits(sentimentMagnitude) != Float.floatToIntBits(other.sentimentMagnitude))
			return false;
		if (Float.floatToIntBits(sentimentPolarity) != Float.floatToIntBits(other.sentimentPolarity))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "TextDescriptorDTO [sentimentPolarity=" + sentimentPolarity + ", sentimentMagnitude="
				+ sentimentMagnitude + ", language=" + language + ", sentences=" + sentences + ", entities=" + entities
				+ "]";
	}
}
