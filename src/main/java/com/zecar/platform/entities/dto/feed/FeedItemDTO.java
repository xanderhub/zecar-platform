package com.zecar.platform.entities.dto.feed;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zecar.platform.entities.dto.pictures.PictureCollectionDTO;

import io.swagger.annotations.ApiModelProperty;

public final class FeedItemDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Type of feed item", required=true)
	public FeedItemTypeDTO type;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="The user id of the publisher", required=true)
	public String publisherID;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="The ID of feed item", required=true)
	public String itemID;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Time stamp of this item publication. (server time)", required=true)
	public long publicationTime;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Feed item text", required=false)
	public String text;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Pictures for this post", required=false)
	public PictureCollectionDTO pictures;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Chat id", required=false)
	public String chatroomID;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="Message id", required=false)
	public String messageID;

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemID == null) ? 0 : itemID.hashCode());
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
		final FeedItemDTO other = (FeedItemDTO) obj;
		if (itemID == null) {
			if (other.itemID != null)
				return false;
		} else if (!itemID.equals(other.itemID))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "FeedItemDTO [type=" + type + ", publisherID=" + publisherID + ", itemID=" + itemID
				+ ", publicationTime=" + publicationTime + ", text=" + text + ", pictures=" + pictures + ", chatroomID="
				+ chatroomID + ", messageID=" + messageID + "]";
	}
}
