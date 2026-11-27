package com.expensetracker.expensetracker.Client;

import com.expensetracker.expensetracker.DTO.AccountCreation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URL;

@Component
public class AccountCreation1 {
    @Autowired
    public RestTemplate restTemplate;

    @Value("${target.url}")
    public String url;

    public ResponseEntity<String> getData(AccountCreation accountCreation){
        ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.POST, new HttpEntity<>(accountCreation), String.class);
        return exchange;

    }
}
