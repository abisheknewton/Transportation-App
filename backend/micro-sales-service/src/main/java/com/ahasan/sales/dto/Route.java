
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
@JsonPropertyOrder({ "duration", "departure_time", "arrival_time", "distance", "distance_desc", "route_parts" })
@Generated("jsonschema2pojo")
public class Route {

	@JsonProperty("duration")
	private String duration;
	@JsonProperty("departure_time")
	private String departureTime;
	@JsonProperty("arrival_time")
	private String arrivalTime;
	@JsonProperty("distance")
	private Integer distance;
	@JsonProperty("distance_desc")
	private String distanceDesc;
	@JsonProperty("route_parts")
	private List<RoutePart> routeParts = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

	@JsonProperty("route_parts")
	public List<RoutePart> getRouteParts() {
		return routeParts;
	}

	@JsonProperty("route_parts")
	public void setRouteParts(List<RoutePart> routeParts) {
		this.routeParts = routeParts;
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
		sb.append(Route.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
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
		sb.append("distance");
		sb.append('=');
		sb.append(((this.distance == null) ? "<null>" : this.distance));
		sb.append(',');
		sb.append("distanceDesc");
		sb.append('=');
		sb.append(((this.distanceDesc == null) ? "<null>" : this.distanceDesc));
		sb.append(',');
		sb.append("routeParts");
		sb.append('=');
		sb.append(((this.routeParts == null) ? "<null>" : this.routeParts));
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