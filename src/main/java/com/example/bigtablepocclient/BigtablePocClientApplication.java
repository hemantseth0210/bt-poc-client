package com.example.bigtablepocclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
public class BigtablePocClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BigtablePocClientApplication.class, args);

		ExecutorService executorService = Executors.newFixedThreadPool(300);
		for (int i = 0; i < 300; i++){
			executorService.execute(new BigtableThread());
		}
		executorService.shutdown();


	}


}
