package com.expensetracker.expensetracker.Service;

import com.expensetracker.expensetracker.DTO.AccountCreation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessage {



    private AccountCreation accountCreation;

    @KafkaListener(topics = "Account-Creation",groupId = "consumner-1")
    public void consumesMessage(AccountCreation accountCreation1){
        System.out.println("consume1");
        accountCreation=accountCreation1;
    }
    @KafkaListener(topics = "Account-Creation",groupId = "consumner-1")
    public void consumesMessage1(AccountCreation accountCreation1){
        System.out.println("consumes2");

        accountCreation=accountCreation1;
    }
    public AccountCreation getAccountCreation(){
        return accountCreation;
    }
}
