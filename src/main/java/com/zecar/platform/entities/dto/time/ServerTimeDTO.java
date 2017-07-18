package com.zecar.platform.entities.dto.time;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public final class ServerTimeDTO {
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Current hour (24 hours format)", required=true)
	public int hour;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Current minute of the hour", required=true)
	public int minute;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Current second of the minute", required=true)
	public int second;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Corrent year", required=true)
	public int year;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Current month", required=true)
	public int month;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Current day of the month", required=true)
	public int day;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Current day of the year", required=true)
	public int year_day;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Current day of the week", required=true)
	public int week_day;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="Current millisecond of the second", required=true)
	public int millisecond;
	
	@JsonProperty(required=true)
	@ApiModelProperty(notes="The producing timestamp in milliseconds", required=true)
	public long timestamp;

	
	public final Date getDate(){
		return new Date(timestamp);
	}
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + hour;
		result = prime * result + millisecond;
		result = prime * result + minute;
		result = prime * result + month;
		result = prime * result + second;
		result = prime * result + (int) (timestamp ^ (timestamp >>> 32));
		result = prime * result + week_day;
		result = prime * result + year;
		result = prime * result + year_day;
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
		final ServerTimeDTO other = (ServerTimeDTO) obj;
		if (day != other.day)
			return false;
		if (hour != other.hour)
			return false;
		if (millisecond != other.millisecond)
			return false;
		if (minute != other.minute)
			return false;
		if (month != other.month)
			return false;
		if (second != other.second)
			return false;
		if (timestamp != other.timestamp)
			return false;
		if (week_day != other.week_day)
			return false;
		if (year != other.year)
			return false;
		if (year_day != other.year_day)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "ServerTimeDTO [hour=" + hour + ", minute=" + minute + ", second=" + second + ", year=" + year
				+ ", month=" + month + ", day=" + day + ", year_day=" + year_day + ", week_day=" + week_day
				+ ", millisecond=" + millisecond + ", timestamp=" + timestamp + "]";
	}
}
