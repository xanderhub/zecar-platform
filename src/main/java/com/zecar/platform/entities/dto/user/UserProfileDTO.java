package com.zecar.platform.entities.dto.user;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zecar.platform.entities.dto.car.CarDTO;
import com.zecar.platform.entities.dto.pictures.PictureCollectionDTO;
import com.zecar.platform.entities.dto.pictures.PictureDTO;

import io.swagger.annotations.ApiModelProperty;

public final class UserProfileDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="User's full name", required=true)
	public String name;

    @JsonProperty(required=false)
    @ApiModelProperty(notes="User's e-mail", required=false)
    public String email;

    @JsonProperty(required=false)
    @ApiModelProperty(notes="Content of 'say something' field.", required=false)
    public String description;

    @JsonProperty(required=false)
    @ApiModelProperty(notes="User's country", required=false)
    public String country;

    @JsonProperty(required=false)
    @ApiModelProperty(notes="User's city", required=false)
    public String city;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="User's birth date", required=true)
	public Date birthDate;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="User's profile pictures", required=false)
	public PictureCollectionDTO pictures;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="User's profile avatar", required=false)
	public PictureDTO avatar;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="User's profile cover picture", required=false)
	public PictureDTO cover;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="User's previous cars list", required=false)
	public List<CarDTO> previousCars;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="User's current cars list. Has to contain at least one car.", required=true)
	public List<CarDTO> currentCars;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="User's future (planned) cars list", required=false)
	public List<CarDTO> futureCars;
	
	@JsonProperty(required=false)
	@ApiModelProperty(notes="User's social networks profiles", required=false)
	public List<SocialNetworkDTO> socialNetworks;

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((avatar == null) ? 0 : avatar.hashCode());
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((cover == null) ? 0 : cover.hashCode());
		result = prime * result + ((currentCars == null) ? 0 : currentCars.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((futureCars == null) ? 0 : futureCars.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pictures == null) ? 0 : pictures.hashCode());
		result = prime * result + ((previousCars == null) ? 0 : previousCars.hashCode());
		result = prime * result + ((socialNetworks == null) ? 0 : socialNetworks.hashCode());
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
		final UserProfileDTO other = (UserProfileDTO) obj;
		if (avatar == null) {
			if (other.avatar != null)
				return false;
		} else if (!avatar.equals(other.avatar))
			return false;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (cover == null) {
			if (other.cover != null)
				return false;
		} else if (!cover.equals(other.cover))
			return false;
		if (currentCars == null) {
			if (other.currentCars != null)
				return false;
		} else if (!currentCars.equals(other.currentCars))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (futureCars == null) {
			if (other.futureCars != null)
				return false;
		} else if (!futureCars.equals(other.futureCars))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pictures == null) {
			if (other.pictures != null)
				return false;
		} else if (!pictures.equals(other.pictures))
			return false;
		if (previousCars == null) {
			if (other.previousCars != null)
				return false;
		} else if (!previousCars.equals(other.previousCars))
			return false;
		if (socialNetworks == null) {
			if (other.socialNetworks != null)
				return false;
		} else if (!socialNetworks.equals(other.socialNetworks))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "UserProfileDTO [name=" + name + ", email=" + email + ", description=" + description + ", country="
				+ country + ", city=" + city + ", birthDate=" + birthDate + ", pictures=" + pictures + ", avatar="
				+ avatar + ", cover=" + cover + ", previousCars=" + previousCars + ", currentCars=" + currentCars
				+ ", futureCars=" + futureCars + ", socialNetworks=" + socialNetworks + "]";
	}
}
