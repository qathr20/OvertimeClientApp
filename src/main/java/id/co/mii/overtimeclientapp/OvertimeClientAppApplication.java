package id.co.mii.overtimeclientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OvertimeClientAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OvertimeClientAppApplication.class, args);

		System.out.println();
		System.out.println("Client App is Running");
	}

}
