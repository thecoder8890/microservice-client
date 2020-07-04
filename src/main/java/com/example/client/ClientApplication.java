package com.example.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
	
	@GetMapping("/getClient")
	public String getClient() {
		
		String input="heloo";
				
		RestTemplate restTemplate = new RestTemplate();

//		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType.APPLICATION_JSON);
//		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
//		HttpEntity<String> request = new HttpEntity<String>(input, headers);

		//final ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:8089/ws", request,
				//String.class);
		
		final ResponseEntity<String> response1 = restTemplate.getForEntity("http://localhost:8090/getWord", String.class);
				
		System.out.println(response1);
		
		return response1.toString();
		
	}


}
