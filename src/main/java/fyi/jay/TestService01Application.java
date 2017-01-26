package fyi.jay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestService01Application {

	public static void main(String[] args) {
		SpringApplication.run(TestService01Application.class, args);
	}
}
