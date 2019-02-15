package com.qa.Pool.receiver;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.Pool.persistance.domain.SentAccount;
import com.qa.Pool.persistance.repository.MongoAccountRepo;

@Component
public class AccountReceiver {


    @Autowired
    private MongoAccountRepo repo;

    @JmsListener(destination = "AccountQueue", containerFactory = "myFactory")
    public void receiveMessage(SentAccount sentAccount) {
        repo.save(sentAccount);
    }
}
