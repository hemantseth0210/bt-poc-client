package com.example.bigtablepocclient;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;

public class BigtableThread implements Runnable{

    @Override
    public void run(){
        RestTemplate restTemplate = new RestTemplate();
        //final String baseUrl = "http://localhost:8080/processNcpEligibleUpcsByPrefixPostWithRedisCache";
        final String baseUrl = "http://104.197.166.156:8080/processNcpEligibleUpcsByPrefixPostWithRedisCache";
        URI uri = null;
        try {
            uri = new URI(baseUrl);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        List<String> upcs = getUpcs();
        HttpHeaders headers = new HttpHeaders();
        int counter = 1;
        while(true){
           // try {
                //Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " Hitting range service " + counter + " times");
                List<String> finalUpcsList = new ArrayList<>();
                Collections.shuffle(upcs, new Random(upcs.size()));
                Random rand = new Random();
                for (int i = 0; i < 10; i++) {
                    int randomIndex = rand.nextInt(upcs.size());
                    finalUpcsList.add(upcs.get(randomIndex));
                }
                HttpEntity<List<String>> request = new HttpEntity<>(finalUpcsList, headers);
                restTemplate.postForEntity(uri, request, Map.class);
                System.out.println(Thread.currentThread().getName() + " Got the result from range service " + counter + " times");
                counter++;
            //} catch (InterruptedException e) {
            //  e.printStackTrace();
            //}
        }
    }

    private List<String> getUpcs(){
        List<String> upcs = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("src/main/resources/upcs.txt"));
            String line = reader.readLine();
            while (line != null) {
                upcs.add(line);
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return upcs;
    }

}
