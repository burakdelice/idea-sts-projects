package com.burakdelice.service;

public class BService implements SelectService {
    @Override
    public void sendMsg(String message) {
        System.out.println("Service B :" + message);
    }
}