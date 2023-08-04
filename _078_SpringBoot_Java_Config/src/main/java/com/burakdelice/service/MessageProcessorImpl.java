package com.burakdelice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class MessageProcessorImpl implements MessageProcessor{

    private SelectService selectService;


    public MessageProcessorImpl(@Qualifier("aService") SelectService selectService) {
        this.selectService = selectService;
    }

    public void setSelectService(SelectService selectService) {
        this.selectService = selectService;
    }

    @Override
    public void processingMsg(String message) {
        selectService.sendMsg(message);
    }
}
