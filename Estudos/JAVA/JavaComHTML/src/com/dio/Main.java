package com.dio;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;

public class Main {
	public static final String URL_GET="https://jsonplaceholder.typicode.com/posts";
	public static void main(String[] args) {
		//Cliente HTTP
		HttpClient client = HttpClient.newHttpClient();
		//criar a requisição
		HttpRequest request = HttpRequest.newBuilder()
				.GET()
				.timeout(Duration.ofSeconds(30))
				.uri(URI.create(URL_GET))
				.build()
				;

	}

}
