package com.ahasan.sales.dto;

public class TransportRequest {

	private String from;
	private String to;
	private String date;
	private String journeyTimeType;
	private String time;
	private String service;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getJourneyTimeType() {
		return journeyTimeType;
	}

	public void setJourneyTimeType(String journeyTimeType) {
		this.journeyTimeType = journeyTimeType;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	@Override
	public String toString() {
		return "TransportRequest [from=" + from + ", to=" + to + ", date=" + date + ", journeyTimeType="
				+ journeyTimeType + ", time=" + time + ", service=" + service + "]";
	}

}
