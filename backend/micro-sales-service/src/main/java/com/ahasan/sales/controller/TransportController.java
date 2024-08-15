package com.ahasan.sales.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ahasan.sales.dto.TransportRequest;
import com.ahasan.sales.dto.TransportResponse;

@RestController
public class TransportController {

	@PostMapping("/transport")
	public TransportResponse getTransportRequest(@RequestBody TransportRequest request) throws URISyntaxException {

		RestTemplate restTemplate = new RestTemplate();
		final String baseUrl = "https://transportapi.com/v3/uk/public_journey.json?" + "from=" + request.getFrom()
				+ "&to=" + request.getTo() + "&journey_time_type=" + request.getJourneyTimeType() + "&date="
				+ request.getDate() + "&time=" + request.getTime() + "&service=" + request.getService()
				+ "&modes=bus&modes=train&modes=boat&not_modes=bus&not_modes=train&not_modes=boat&app_key=829ba9110141599ec132ff8c1c5cf0ec&app_id=85b402f2";

		URI uri = new URI(baseUrl);

		ResponseEntity<TransportResponse> result = restTemplate.getForEntity(uri, TransportResponse.class);
		return result.getBody();
	}

}
