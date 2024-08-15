package com.ahasan.sales.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "mode", "from_point_name", "to_point_name", "destination", "duration", "departure_time",
		"arrival_time", "coordinates", "distance", "distance_desc" })
@Generated("jsonschema2pojo")
public class RoutePart {

	@JsonProperty("mode")
	private String mode;
	@JsonProperty("from_point_name")
	private String fromPointName;
	@JsonProperty("to_point_name")
	private String toPointName;
	@JsonProperty("destination")
	private String destination;
	@JsonProperty("duration")
	private String duration;
	@JsonProperty("departure_time")
	private String departureTime;
	@JsonProperty("arrival_time")
	private String arrivalTime;
	@JsonProperty("coordinates")
	private List<List<Double>> coordinates = null;
	@JsonProperty("distance")
	private Integer distance;
	@JsonProperty("distance_desc")
	private String distanceDesc;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("mode")
	public String getMode() {
		return mode;
	}

	@JsonProperty("mode")
	public void setMode(String mode) {
		this.mode = mode;
	}

	@JsonProperty("from_point_name")
	public String getFromPointName() {
		return fromPointName;
	}

	@JsonProperty("from_point_name")
	public void setFromPointName(String fromPointName) {
		this.fromPointName = fromPointName;
	}

	@JsonProperty("to_point_name")
	public String getToPointName() {
		return toPointName;
	}

	@JsonProperty("to_point_name")
	public void setToPointName(String toPointName) {
		this.toPointName = toPointName;
	}

	@JsonProperty("destination")
	public String getDestination() {
		return destination;
	}

	@JsonProperty("destination")
	public void setDestination(String destination) {
		this.destination = destination;
	}

	@JsonProperty("duration")
	public String getDuration() {
		return duration;
	}

	@JsonProperty("duration")
	public void setDuration(String duration) {
		this.duration = duration;
	}

	@JsonProperty("departure_time")
	public String getDepartureTime() {
		return departureTime;
	}

	@JsonProperty("departure_time")
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	@JsonProperty("arrival_time")
	public String getArrivalTime() {
		return arrivalTime;
	}

	@JsonProperty("arrival_time")
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	@JsonProperty("coordinates")
	public List<List<Double>> getCoordinates() {
		return coordinates;
	}

	@JsonProperty("coordinates")
	public void setCoordinates(List<List<Double>> coordinates) {
		this.coordinates = coordinates;
	}

	@JsonProperty("distance")
	public Integer getDistance() {
		return distance;
	}

	@JsonProperty("distance")
	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	@JsonProperty("distance_desc")
	public String getDistanceDesc() {
		return distanceDesc;
	}

	@JsonProperty("distance_desc")
	public void setDistanceDesc(String distanceDesc) {
		this.distanceDesc = distanceDesc;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(RoutePart.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("mode");
		sb.append('=');
		sb.append(((this.mode == null) ? "<null>" : this.mode));
		sb.append(',');
		sb.append("fromPointName");
		sb.append('=');
		sb.append(((this.fromPointName == null) ? "<null>" : this.fromPointName));
		sb.append(',');
		sb.append("toPointName");
		sb.append('=');
		sb.append(((this.toPointName == null) ? "<null>" : this.toPointName));
		sb.append(',');
		sb.append("destination");
		sb.append('=');
		sb.append(((this.destination == null) ? "<null>" : this.destination));
		sb.append(',');
		sb.append("duration");
		sb.append('=');
		sb.append(((this.duration == null) ? "<null>" : this.duration));
		sb.append(',');
		sb.append("departureTime");
		sb.append('=');
		sb.append(((this.departureTime == null) ? "<null>" : this.departureTime));
		sb.append(',');
		sb.append("arrivalTime");
		sb.append('=');
		sb.append(((this.arrivalTime == null) ? "<null>" : this.arrivalTime));
		sb.append(',');
		sb.append("coordinates");
		sb.append('=');
		sb.append(((this.coordinates == null) ? "<null>" : this.coordinates));
		sb.append(',');
		sb.append("distance");
		sb.append('=');
		sb.append(((this.distance == null) ? "<null>" : this.distance));
		sb.append(',');
		sb.append("distanceDesc");
		sb.append('=');
		sb.append(((this.distanceDesc == null) ? "<null>" : this.distanceDesc));
		sb.append(',');
		sb.append("additionalProperties");
		sb.append('=');
		sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

}