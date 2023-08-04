package com.burakdelice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MessageProcessorImpl implements MessageProcessor {

    @Autowired
    @Qualifier("aService")
    private SelectService selectService;

    public void setSelectService(SelectService selectService) {
        this.selectService = selectService;
    }

    @Override
    public void processingMsg(String message) {
        selectService.sendMsg(message);
    }
}
