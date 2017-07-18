package com.zecar.platform.entities.dto.banner;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class BannerImpressionDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Banner impression type", required=true)
	public String type;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Banner picture url", required=true)
	public String pictureUrl;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Banner header text", required=true)
	public String header;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Banner body text", required=true)
	public String text;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Outgoing resource link (advertised)", required=true)
	public String link;

	public BannerImpressionDTO(final String type,
			final String pictureUrl,
			final String header,
			final String text,
			final String link) {
		this.type = type;
		this.pictureUrl = pictureUrl;
		this.header = header;
		this.text = text;
		this.link = link;
	}
	
	public BannerImpressionDTO(){}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((header == null) ? 0 : header.hashCode());
		result = prime * result + ((link == null) ? 0 : link.hashCode());
		result = prime * result + ((pictureUrl == null) ? 0 : pictureUrl.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
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
		final BannerImpressionDTO other = (BannerImpressionDTO) obj;
		if (header == null) {
			if (other.header != null)
				return false;
		} else if (!header.equals(other.header))
			return false;
		if (link == null) {
			if (other.link != null)
				return false;
		} else if (!link.equals(other.link))
			return false;
		if (pictureUrl == null) {
			if (other.pictureUrl != null)
				return false;
		} else if (!pictureUrl.equals(other.pictureUrl))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "BannerImpressionDTO [type=" + type + ", pictureUrl=" + pictureUrl + ", header=" + header + ", text="
				+ text + ", link=" + link + "]";
	}
}
