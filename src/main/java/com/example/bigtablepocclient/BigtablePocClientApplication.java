package com.example.bigtablepocclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
public class BigtablePocClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BigtablePocClientApplication.class, args);
/*
		Thread thread1 = new Thread(new BigtableThread());
		thread1.setName("thread 1");

		Thread thread2 = new Thread(new BigtableThread());
		thread2.setName("thread 2");

		Thread thread3 = new Thread(new BigtableThread());
		thread3.setName("thread 3");

		Thread thread4 = new Thread(new BigtableThread());
		thread4.setName("thread 4");

		Thread thread5 = new Thread(new BigtableThread());
		thread5.setName("thread 5");

		Thread thread6 = new Thread(new BigtableThread());
		thread6.setName("thread 6");

		Thread thread7 = new Thread(new BigtableThread());
		thread7.setName("thread 7");

		Thread thread8 = new Thread(new BigtableThread());
		thread8.setName("thread 8");

		Thread thread9 = new Thread(new BigtableThread());
		thread9.setName("thread 9");

		Thread thread10 = new Thread(new BigtableThread());
		thread10.setName("thread 10");

		Thread thread11 = new Thread(new BigtableThread());
		thread11.setName("thread 11");

		Thread thread12 = new Thread(new BigtableThread());
		thread12.setName("thread 12");

		Thread thread13 = new Thread(new BigtableThread());
		thread13.setName("thread 13");

		Thread thread14 = new Thread(new BigtableThread());
		thread14.setName("thread 14");

		Thread thread15 = new Thread(new BigtableThread());
		thread15.setName("thread 15");

		Thread thread16 = new Thread(new BigtableThread());
		thread16.setName("thread 16");

		Thread thread17 = new Thread(new BigtableThread());
		thread17.setName("thread 17");

		Thread thread18 = new Thread(new BigtableThread());
		thread18.setName("thread 18");

		Thread thread19 = new Thread(new BigtableThread());
		thread19.setName("thread 19");

		Thread thread20 = new Thread(new BigtableThread());
		thread20.setName("thread 20");

		Thread thread21 = new Thread(new BigtableThread());
		thread21.setName("thread 21");

		Thread thread22 = new Thread(new BigtableThread());
		thread22.setName("thread 22");

		Thread thread23 = new Thread(new BigtableThread());
		thread23.setName("thread 23");

		Thread thread24 = new Thread(new BigtableThread());
		thread24.setName("thread 24");

		Thread thread25 = new Thread(new BigtableThread());
		thread25.setName("thread 25");

		Thread thread26 = new Thread(new BigtableThread());
		thread26.setName("thread 26");

		Thread thread27 = new Thread(new BigtableThread());
		thread27.setName("thread 27");

		Thread thread28 = new Thread(new BigtableThread());
		thread8.setName("thread 28");

		Thread thread29 = new Thread(new BigtableThread());
		thread29.setName("thread 29");

		Thread thread30 = new Thread(new BigtableThread());
		thread30.setName("thread 30");

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		thread9.start();
		thread10.start();
		thread11.start();
		thread12.start();
		thread13.start();
		thread14.start();
		thread15.start();
		thread16.start();
		thread17.start();
		thread18.start();
		thread19.start();
		thread20.start();
		thread21.start();
		thread22.start();
		thread23.start();
		thread24.start();
		thread25.start();
		thread26.start();
		thread27.start();
		thread28.start();
		thread29.start();
		thread30.start();

 */


		ExecutorService executorService = Executors.newFixedThreadPool(700);
		for (int i = 0; i < 700; i++){
			executorService.execute(new BigtableThread());
		}
		executorService.shutdown();


	}


}
