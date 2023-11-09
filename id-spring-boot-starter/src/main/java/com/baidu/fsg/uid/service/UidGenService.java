package com.baidu.fsg.uid.service;

import com.baidu.fsg.uid.UidGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UidGenService {

    @Autowired
    private UidGenerator uidGenerator;

    public long getUid() {
        return uidGenerator.getUID();
    }
}
