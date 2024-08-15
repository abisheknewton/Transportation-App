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
@JsonPropertyOrder({ "request_time", "source", "acknowledgements", "routes" })
@Generated("jsonschema2pojo")
public class TransportResponse {

	@JsonProperty("request_time")
	private String requestTime;
	@JsonProperty("source")
	private String source;
	@JsonProperty("acknowledgements")
	private String acknowledgements;
	@JsonProperty("routes")
	private List<Route> routes = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("request_time")
	public String getRequestTime() {
		return requestTime;
	}

	@JsonProperty("request_time")
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	@JsonProperty("source")
	public String getSource() {
		return source;
	}

	@JsonProperty("source")
	public void setSource(String source) {
		this.source = source;
	}

	@JsonProperty("acknowledgements")
	public String getAcknowledgements() {
		return acknowledgements;
	}

	@JsonProperty("acknowledgements")
	public void setAcknowledgements(String acknowledgements) {
		this.acknowledgements = acknowledgements;
	}

	@JsonProperty("routes")
	public List<Route> getRoutes() {
		return routes;
	}

	@JsonProperty("routes")
	public void setRoutes(List<Route> routes) {
		this.routes = routes;
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
		sb.append(TransportResponse.class.getName()).append('@')
				.append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("requestTime");
		sb.append('=');
		sb.append(((this.requestTime == null) ? "<null>" : this.requestTime));
		sb.append(',');
		sb.append("source");
		sb.append('=');
		sb.append(((this.source == null) ? "<null>" : this.source));
		sb.append(',');
		sb.append("acknowledgements");
		sb.append('=');
		sb.append(((this.acknowledgements == null) ? "<null>" : this.acknowledgements));
		sb.append(',');
		sb.append("routes");
		sb.append('=');
		sb.append(((this.routes == null) ? "<null>" : this.routes));
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